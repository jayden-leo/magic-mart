package com.jayden.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jayden.product.entity.CategoryEntity;
import com.jayden.product.service.CategoryService;
import com.jayden.common.utils.PageUtils;
import com.jayden.common.utils.R;



/**
 * 商品三级分类
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:24:39
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);
        return R.ok().put("page", page);
    }

    @RequestMapping("/listTree")
    public R listTree(@RequestParam Map<String, Object> params){
        List<CategoryEntity> list = categoryService.queryPageWithThree(params);
        return R.ok().put("data", list);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        System.out.println("i am invoked");
//		categoryService.removeByIds(Arrays.asList(catIds));
		categoryService.removeCategoryByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
