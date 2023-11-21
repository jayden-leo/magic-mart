package com.jayden.order.dao;

import com.jayden.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:34:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
