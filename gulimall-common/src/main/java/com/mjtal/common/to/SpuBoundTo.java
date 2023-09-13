package com.mjtal.common.to;

import lombok.Data;

import java.math.BigDecimal;
/**
 * @Author: june
 * @Date: 2023/9/13 16:25
 */
@Data
public class SpuBoundTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
