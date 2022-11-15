package com.lzxmusta.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzxmusta.common.utils.PageUtils;
import com.lzxmusta.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author lzxmusta
 * @email 1244453574@qq.com
 * @date 2022-11-15 23:20:28
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

