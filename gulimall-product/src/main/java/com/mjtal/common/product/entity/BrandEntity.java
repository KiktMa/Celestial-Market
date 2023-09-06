package com.mjtal.common.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.mjtal.common.vaild.AddGroup;
import com.mjtal.common.vaild.ListValue;
import com.mjtal.common.vaild.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 *
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:10
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    // 使用校验注解中的group来对注解进行分组执行
    // 例如下面的例子，在更新时就必须让id不为空，在添加时由于id为自增所以必须为空
    // group为接口，创建接口不许实现，只是一个识别标志
    @Null(message = "新增不能指定品牌id", groups = AddGroup.class)
    @NotNull(message = "修改必须指定品牌id", groups = UpdateGroup.class)
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "品牌名必须提交")
    private String name;
    /**
     * 品牌logo地址
     */
    @URL(message = "logo必须是一个合法的url地址")
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    // 添加自定义校验注解
    @ListValue(vals = {0, 1})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty
    // java中写正则不需要加/ /
    @Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是一个字母")
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull
    @Min(value = 0, message = "排序必须不小于0")
    private Integer sort;

}
