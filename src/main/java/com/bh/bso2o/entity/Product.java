package com.bh.bso2o.entity;

import java.util.Date;
import java.util.List;

public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    private String imgAddr;// 简略图
    private String normalPrice;//正常价格
    private String promotionPrice;//折扣价格
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //-1不可用 0下架 1在前端展示
    private Integer enableStatus;
    private List<ProductImg> productImgList;
    private ProductCategory productCategory;
    private Shop shop;


}
