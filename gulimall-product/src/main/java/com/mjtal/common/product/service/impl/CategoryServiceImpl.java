package com.mjtal.common.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mjtal.common.utils.PageUtils;
import com.mjtal.common.utils.Query;

import com.mjtal.common.product.dao.CategoryDao;
import com.mjtal.common.product.entity.CategoryEntity;
import com.mjtal.common.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 进行分类
        List<CategoryEntity> level1 = entities.stream().filter(
                categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((menu)->{
                    menu.setChildren(getChildrens(menu,entities));
                    return menu;
                }).sorted((menu1,menu2)->{
                    return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());

        return level1;
    }

    @Override
    public void removeMenueByIds(List<Long> asList) {
        // todo  逻辑删除代码片段
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] findcatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);
        Collections.reverse(parentPath);
        return parentPath.toArray(new Long[parentPath.size()]);
    }

    private List<Long> findParentPath(Long catelogId,List<Long> paths){
        paths.add(catelogId);
        CategoryEntity category = this.getById(catelogId);
        if(category.getParentCid()!=0){
            findParentPath(category.getParentCid(),paths);
        }
        return paths;
    }
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId())
                .map((categoryEntity)->{
                    categoryEntity.setChildren(getChildrens(categoryEntity,all));
                    return categoryEntity;
                }).sorted((menu1,menu2)->{
                    return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                }).collect(Collectors.toList());
        return children;
    }

}