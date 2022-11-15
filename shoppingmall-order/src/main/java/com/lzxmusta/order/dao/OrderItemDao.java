package com.lzxmusta.order.dao;

import com.lzxmusta.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lzxmusta
 * @email 1244453574@qq.com
 * @date 2022-11-15 23:20:29
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
