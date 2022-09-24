package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author devmzy
 * @email devmzy@outlook.com
 * @date 2022-09-24 16:30:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
