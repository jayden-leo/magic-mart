package com.jayden.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:34:15
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

