package com.fh.shop.category.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ICategoryServiceImplTest {
    @Resource(name = "categoryService")
    private ICategoryService categoryService;
    @Test
    public void findCategoryList() {
        System.out.println(categoryService.findCategoryList("0").getData());
    }
}