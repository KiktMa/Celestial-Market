package com.mjtal.common.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author: june
 * @Date: 2023/10/10 15:56
 */
@Data
@ToString
public class SpuItemAttrGroupVo {

    private String groupName;

    private List<Attr> attrs;

}
