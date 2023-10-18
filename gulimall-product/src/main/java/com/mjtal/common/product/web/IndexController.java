package com.mjtal.common.product.web;

import com.mjtal.common.product.entity.CategoryEntity;
import com.mjtal.common.product.service.CategoryService;
import com.mjtal.common.product.vo.Catelog2Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author: june
 * @Date: 2023/9/26 17:18
 */

@Controller
public class IndexController {

    @Autowired
    CategoryService categoryService;
    @GetMapping(value = {"/","index.html"})
    private String indexPage(Model model) {

        //1、查出所有的一级分类
        List<CategoryEntity> categoryEntities = categoryService.getLevel1Categorys();
        model.addAttribute("categories",categoryEntities);
        return "index";
    }


    //index/json/catalog.json
    @GetMapping(value = "/index/json/catalog.json")
    @ResponseBody
    public Map<String, List<Catelog2Vo>> getCatalogJson() {

        Map<String, List<Catelog2Vo>> catalogJson = categoryService.getCatalogJson();

        return catalogJson;

    }
}
