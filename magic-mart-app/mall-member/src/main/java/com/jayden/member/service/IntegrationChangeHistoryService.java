package com.jayden.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:34:53
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

