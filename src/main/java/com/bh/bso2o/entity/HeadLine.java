package com.bh.bso2o.entity;

import java.util.Date;

//头条类
public class HeadLine {
    private Long lineID;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    //0.不可用 1.可用
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

}
