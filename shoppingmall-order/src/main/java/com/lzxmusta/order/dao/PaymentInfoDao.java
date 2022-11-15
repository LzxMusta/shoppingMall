package com.lzxmusta.order.dao;

import com.lzxmusta.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lzxmusta
 * @email 1244453574@qq.com
 * @date 2022-11-15 23:20:28
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
