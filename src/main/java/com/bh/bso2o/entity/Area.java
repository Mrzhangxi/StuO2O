package com.bh.bso2o.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

//区域类
@Data
@Entity
@Table(name = "tb_area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer areaId;
    private String areaName;
    private Integer priority;//权重
    private Date createTime;
    private Date lastTime;
    }

