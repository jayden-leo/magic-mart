package com.jayden.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:24:39
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> queryPageWithThree(Map<String, Object> params);

    void removeCategoryByIds(List<Long> asList);
}

