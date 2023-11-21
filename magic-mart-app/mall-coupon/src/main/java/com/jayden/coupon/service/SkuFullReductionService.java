package com.jayden.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:35:55
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

