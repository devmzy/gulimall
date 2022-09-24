package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author devmzy
 * @email devmzy@outlook.com
 * @date 2022-09-24 16:43:35
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
