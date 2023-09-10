package com.mjtal.common.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjtal.common.product.vo.AttrGroupRelationVo;
import com.mjtal.common.product.vo.AttrRespVo;
import com.mjtal.common.product.vo.AttrVo;
import com.mjtal.common.utils.PageUtils;
import com.mjtal.common.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:10
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
}

