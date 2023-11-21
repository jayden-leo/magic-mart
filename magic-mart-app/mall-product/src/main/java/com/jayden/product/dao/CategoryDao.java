package com.jayden.product.dao;

import com.jayden.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:24:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
