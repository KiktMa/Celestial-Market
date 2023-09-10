package com.mjtal.common.product.vo;

import lombok.Data;
/**
 * @Author: june
 * @Date: 2023/9/6 16:25
 */
@Data
public class AttrRespVo extends AttrVo {
    /**
     * 			"catelogName": "手机/数码/手机", //所属分类名字
     * 			"groupName": "主体", //所属分组名字
     */
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
