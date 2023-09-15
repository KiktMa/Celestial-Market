package com.mjtal.gulimall.ware.vo;

import lombok.Data;

/**
 * @Author: june
 * @Date: 2023/9/15 16:02
 */
@Data
public class PurchaseItemDoneVo {
    //{itemId:1,status:4,reason:""}
    private Long itemId;
    private Integer status;
    private String reason;
}

