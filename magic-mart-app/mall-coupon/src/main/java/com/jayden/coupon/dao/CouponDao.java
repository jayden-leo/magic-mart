package com.jayden.coupon.dao;

import com.jayden.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:35:55
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
