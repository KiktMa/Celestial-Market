package com.mjtal.common.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjtal.common.product.vo.SkuItemSaleAttrVo;
import com.mjtal.common.utils.PageUtils;
import com.mjtal.common.product.entity.SkuSaleAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:09
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuItemSaleAttrVo> getSaleAttrBySpuId(Long spuId);
}

