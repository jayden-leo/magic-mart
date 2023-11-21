package com.jayden.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:34:15
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

