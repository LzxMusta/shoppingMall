package com.lzxmusta.product.dao;

import com.lzxmusta.product.entity.PmsCommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lzxmusta
 * @email pms_
 * @date 2022-11-15 14:41:14
 */
@Mapper
public interface PmsCommentReplayDao extends BaseMapper<PmsCommentReplayEntity> {
	
}
