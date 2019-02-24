package com.bh.bso2o.entity;

import java.util.Date;

//店铺类
public class Shop {
    private Long shopID;
    private String shopName;
    private String shopDesc;
    private String shopAddr;
    private String phone;
    private String shopImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //-1不可用 0审核中 1可用
    private Integer enableStatus;
    //超级管理员给店家的提醒
    private String advice;
    private Area area;
    private PersonInfo owner;
    private ShopCategory shopCategory;


}
