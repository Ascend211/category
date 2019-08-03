package com.fh.shop.category;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.shop.category.mapper")
public class ShopCategoryProducrMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCategoryProducrMpApplication.class, args);
    }

}
