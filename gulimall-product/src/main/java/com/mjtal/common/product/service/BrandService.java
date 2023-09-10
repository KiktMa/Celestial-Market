package com.mjtal.common.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjtal.common.utils.PageUtils;
import com.mjtal.common.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:10
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

