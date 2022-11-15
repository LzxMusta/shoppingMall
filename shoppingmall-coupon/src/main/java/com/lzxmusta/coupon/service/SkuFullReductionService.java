package com.lzxmusta.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzxmusta.common.utils.PageUtils;
import com.lzxmusta.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author lzxmusta
 * @email 1244453574@qq.com
 * @date 2022-11-15 23:43:11
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

