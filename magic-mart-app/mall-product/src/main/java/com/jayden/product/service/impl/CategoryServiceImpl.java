package com.jayden.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jayden.common.utils.PageUtils;
import com.jayden.common.utils.Query;

import com.jayden.product.dao.CategoryDao;
import com.jayden.product.entity.CategoryEntity;
import com.jayden.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查询所有的类别数据，然后将数据封装为树形结构，便于前端使用
     * @param params
     * @return
     */
    @Override
    public List<CategoryEntity> queryPageWithThree(Map<String, Object> params) {
        // 1.查询所有的商品分类信息
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        // 2.将商品分类信息拆解为树形结构【父子关系】
        // 2.1 遍历所有的大类  parent_cid = 0
        return categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .peek(categoryEntity -> {
                    // 2.2 根据大类找到对应的小类  递归的方式实现
                    categoryEntity.setChildrens(getCategoryChildrens(categoryEntity, categoryEntities));
                }).sorted(Comparator.comparingInt(entity -> (entity.getSort() == null ? 0 : entity.getSort())))
                .collect(Collectors.toList());
    }

    /**
     * 实现逻辑删除，而不是真的删除表中数据
     * @param asList
     */
    @Override
    public void removeCategoryByIds(List<Long> asList) {
        // TODO 1. 检查类别数据是否在其他业务中使用
        // 批量逻辑删除操作
        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 查找该大类下所有的小类
     * @param categoryEntity   某个大类
     * @param categoryEntities 所有的类别数据
     * @return
     */
    private List<CategoryEntity> getCategoryChildrens(CategoryEntity categoryEntity, List<CategoryEntity> categoryEntities) {
        return categoryEntities.stream().filter(entity -> {
                    // 根据大类找到他的直属的小类
                    return entity.getParentCid().equals(categoryEntity.getCatId());
                }).peek(entity -> {
                    // 根据小类递归找到对应的小小类
                    entity.setChildrens(getCategoryChildrens(entity, categoryEntities));
                }).sorted(Comparator.comparingInt(entity -> (entity.getSort() == null ? 0 : entity.getSort())))
                .collect(Collectors.toList());
    }

}