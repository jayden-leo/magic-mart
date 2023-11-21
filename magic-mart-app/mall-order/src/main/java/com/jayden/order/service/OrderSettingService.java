package com.jayden.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:34:15
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

