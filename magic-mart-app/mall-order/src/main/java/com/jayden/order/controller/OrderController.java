package com.jayden.order.controller;

import java.util.Arrays;
import java.util.Map;

import com.jayden.order.feign.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.jayden.order.entity.OrderEntity;
import com.jayden.order.service.OrderService;
import com.jayden.common.utils.PageUtils;
import com.jayden.common.utils.R;


/**
 * 订单
 *
 * @author jayden
 * @email 1263346845@qq.com
 * @date 2023-11-19 23:34:15
 */
@RestController
@RequestMapping("order/order")
@RefreshScope
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public R queryProduct() {
        return productService.queryAllBrand();
    }

    @Value("${user.userName}")
    private String userName;
    @Value("${user.age}")
    private Integer age;

    @GetMapping("/users")
    public R queryUser() {
        return R.ok().put("username", userName).put("age", age);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderEntity order) {
        orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderEntity order) {
        orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
