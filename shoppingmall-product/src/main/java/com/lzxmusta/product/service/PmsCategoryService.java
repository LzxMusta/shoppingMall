package com.lzxmusta.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzxmusta.common.utils.PageUtils;
import com.lzxmusta.product.entity.PmsCategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lzxmusta
 * @email pms_
 * @date 2022-11-15 14:41:14
 */
public interface PmsCategoryService extends IService<PmsCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

