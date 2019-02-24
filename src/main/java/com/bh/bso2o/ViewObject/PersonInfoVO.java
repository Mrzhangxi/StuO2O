package com.bh.bso2o.ViewObject;

import lombok.Data;

@Data
public class PersonInfoVO {
    private Integer userId;
    private String name;
    private String password;
    private String profileImg;//头像地址
    private String email;
    private String gender;
    private String enableStatus;
    private String userType;//1.顾客 2.店家 3.超级管理员
    private String createTime;
    private String lastEditTime;
}
