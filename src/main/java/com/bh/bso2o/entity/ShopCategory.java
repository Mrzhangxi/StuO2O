package com.bh.bso2o.entity;

import java.util.Date;

//商店类别
public class ShopCategory {
    private Long shopCategoryID;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

}
