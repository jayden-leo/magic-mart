package com.jayden.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:24:39
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

