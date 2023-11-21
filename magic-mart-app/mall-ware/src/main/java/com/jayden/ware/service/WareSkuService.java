package com.jayden.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:32:14
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

