package com.mjtal.common.product.vo;

import lombok.Data;

import java.math.BigDecimal;
/**
 * @Author: june
 * @Date: 2023/9/6 16:25
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}