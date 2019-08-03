package com.fh.shop.category.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_jd")
public class Category implements Serializable {
    private static final long serialVersionUID = -7368917208645377214L;
    private String id;

    private String name;

    private String pid;
}
