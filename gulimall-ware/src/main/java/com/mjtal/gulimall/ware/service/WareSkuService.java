package com.mjtal.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjtal.common.to.es.SkuHasStockVo;
import com.mjtal.common.utils.PageUtils;
import com.mjtal.gulimall.ware.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 23:07:22
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);

    List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);
}

