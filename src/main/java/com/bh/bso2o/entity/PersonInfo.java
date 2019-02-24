package com.bh.bso2o.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

//用户信息
@Data
@Entity
@Table(name = "tb_person_info")
public class PersonInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;
    private String password;
    private String profileImg;//头像地址
    private String email;
    private String gender;
    private Integer enableStatus;
    private Integer userType;//1.顾客 2.店家 3.超级管理员
    private Date createTime;
    private Date lastEditTime;

}
