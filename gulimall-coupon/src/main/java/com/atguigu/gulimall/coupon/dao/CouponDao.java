package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author devmzy
 * @email devmzy@outlook.com
 * @date 2022-09-24 16:25:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
