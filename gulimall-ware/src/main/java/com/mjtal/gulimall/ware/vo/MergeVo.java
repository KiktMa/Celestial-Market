package com.mjtal.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: june
 * @Date: 2023/9/15 16:01
 */
@Data
public class MergeVo {

    private Long purchaseId; //整单id
    private List<Long> items;//[1,2,3,4] //合并项集合
}

