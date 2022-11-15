package com.lzxmusta.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzxmusta.common.utils.PageUtils;
import com.lzxmusta.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lzxmusta
 * @email 1244453574@qq.com
 * @date 2022-11-15 23:30:08
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

