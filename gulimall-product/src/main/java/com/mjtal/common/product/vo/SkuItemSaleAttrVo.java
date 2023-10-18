package com.mjtal.common.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author: june
 * @Date: 2023/10/10 15:55
 */
@Data
@ToString
public class SkuItemSaleAttrVo {

    private Long attrId;

    private String attrName;

    private List<AttrValueWithSkuIdVo> attrValues;

}