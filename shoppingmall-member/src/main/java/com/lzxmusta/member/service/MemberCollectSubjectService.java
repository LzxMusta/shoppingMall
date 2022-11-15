package com.lzxmusta.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzxmusta.common.utils.PageUtils;
import com.lzxmusta.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author lzxmusta
 * @email 1244453574@qq.com
 * @date 2022-11-15 23:11:59
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

