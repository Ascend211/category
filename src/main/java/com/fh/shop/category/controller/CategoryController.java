package com.fh.shop.category.controller;

import com.fh.shop.ServerResponse;
import com.fh.shop.category.biz.ICategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/categorys")
@CrossOrigin
public class CategoryController {
    @Resource(name = "categoryService")
    private ICategoryService categoryService;

    @GetMapping
    public ServerResponse findCategoryList(String id){
        System.out.println(System.currentTimeMillis()+"cateGory:list");
        return categoryService.findCategoryList(id);
    }
}
