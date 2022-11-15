package com.lzxmusta.order.dao;

import com.lzxmusta.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lzxmusta
 * @email 1244453574@qq.com
 * @date 2022-11-15 23:20:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
