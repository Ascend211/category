package com.fh.shop.category.biz;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.shop.ServerResponse;
import com.fh.shop.category.mapper.ICategoryMapper;
import com.fh.shop.category.po.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class ICategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryMapper categoryMapper;
    @Override
    public ServerResponse findCategoryList(String id) {
        QueryWrapper qw = new QueryWrapper<Category>();
        qw.eq("pid",id);
        List<Category> list = categoryMapper.selectList(qw);
        return ServerResponse.success(list);
    }
}
