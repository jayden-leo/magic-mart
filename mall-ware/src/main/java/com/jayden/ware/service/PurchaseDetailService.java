package com.jayden.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:32:14
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

