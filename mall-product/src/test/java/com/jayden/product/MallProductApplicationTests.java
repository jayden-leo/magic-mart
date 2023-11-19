package com.jayden.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jayden.product.entity.BrandEntity;
import com.jayden.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    void insert() {
        BrandEntity entity = new BrandEntity();
        entity.setName("iqoo12");
        brandService.save(entity);
    }

    @Test
    void selectAll() {
        List<BrandEntity> list = brandService.list();
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }

    @Test
    void selectById() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",2));
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }

}
