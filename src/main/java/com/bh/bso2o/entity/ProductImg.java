package com.bh.bso2o.entity;

import java.util.Date;

//图片详情类
public class ProductImg {
    private Long productImgID;
    private String imgAddr;//图片地址
    private String imgDesc;
    private Integer priority;
    private Date createTime;
    private Long productID;//属于哪个商品的，属于多对一关系


}
