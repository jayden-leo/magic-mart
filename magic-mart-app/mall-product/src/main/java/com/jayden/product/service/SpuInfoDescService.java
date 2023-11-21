package com.jayden.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jayden.common.utils.PageUtils;
import com.jayden.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:24:39
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

