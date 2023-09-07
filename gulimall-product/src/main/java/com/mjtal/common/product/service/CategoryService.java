package com.mjtal.common.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjtal.common.utils.PageUtils;
import com.mjtal.common.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:09
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenueByIds(List<Long> asList);

    Long[] findcatelogPath(Long catelogId);
}

