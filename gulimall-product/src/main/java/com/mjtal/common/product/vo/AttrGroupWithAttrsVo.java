package com.mjtal.common.product.vo;

import com.mjtal.common.product.entity.AttrEntity;
import lombok.Data;
import java.util.List;
/**
 * @Author: june
 * @Date: 2023/9/6 16:25
 */
@Data
public class AttrGroupWithAttrsVo {

    /**
     * 分组id
     */
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
