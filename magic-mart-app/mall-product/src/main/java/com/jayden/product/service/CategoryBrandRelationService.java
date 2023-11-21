package com.jayden.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:24:39
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

