package com.lzxmusta.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzxmusta.common.utils.PageUtils;
import com.lzxmusta.product.entity.PmsAttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lzxmusta
 * @email pms_
 * @date 2022-11-15 14:41:14
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

