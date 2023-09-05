package com.mjtal.common.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mjtal.common.product.entity.BrandEntity;
import com.mjtal.common.product.service.BrandService;
import com.mjtal.common.utils.PageUtils;
import com.mjtal.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author mjtal
 * @email mjtal@gmail.com
 * @date 2022-08-09 22:20:10
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    // 为字段添加NotBlank注解后必须在controller中添加@Valid注解才能开启NotBlank的作用
    // validation-api这个包中还包含大量此类的注解，NotNull也在其中，均用正则表达式写
    // 可以使用他为字段添加后端校验
    // 在@Valid注解后的参数后面必须跟一个BindingResult参数来获取校验失败或成功的结果
    public R save(@Valid @RequestBody BrandEntity brand, BindingResult result){
		if(result.hasErrors()){
            Map<String,String> map = new HashMap<>();
            result.getFieldErrors().forEach((item)->{
                String defaultMessage = item.getDefaultMessage();
                String objectName = item.getObjectName();
                map.put(defaultMessage,objectName);
            });
            return R.error(400,"提交的数据不合法").put("data",map);
        }else {
            brandService.save(brand);
            return R.ok();
        }
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
