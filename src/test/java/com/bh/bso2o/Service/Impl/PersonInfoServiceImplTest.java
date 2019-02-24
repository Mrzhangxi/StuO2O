package com.bh.bso2o.Service.Impl;

import com.bh.bso2o.Service.PersonInfoService;
import com.bh.bso2o.entity.PersonInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonInfoServiceImplTest {

    @Autowired
    private PersonInfoService personInfoService;

    @Test
    public void testGetAll() {
        System.out.println(personInfoService.getAll());
    }

    @Test
    public void testGetAllbystatus() {
        System.out.println(personInfoService.getAllbyStatus(1));
    }

    @Test
    public void testGetByid() {
        System.out.println(personInfoService.getByUserId(1));
    }

    @Test
    public void testCreate() {
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("zx");
        personInfo.setCreateTime(new Date());
        personInfo.setEmail("y6622576@163.com");
        personInfo.setEnableStatus(1);
        personInfo.setGender("男");
        personInfo.setLastEditTime(new Date());
        personInfo.setPassword("123");
        personInfo.setProfileImg("/");
        personInfo.setUserType(1);
        System.out.println(personInfoService.createPersonInfo(personInfo));
    }

    @Test
    public void testModify() {
        PersonInfo personInfo = new PersonInfo();
        personInfo.setUserId(2);
        personInfo.setName("zx1");
        personInfo.setCreateTime(new Date());
        personInfo.setEmail("y6622576@163.com");
        personInfo.setEnableStatus(1);
        personInfo.setGender("男");
        personInfo.setLastEditTime(new Date());
        personInfo.setPassword("123321");
        personInfo.setProfileImg("/");
        personInfo.setUserType(2);
        personInfoService.modifyPersonInfo(personInfo);
    }

    @Test
    public void testGetByName() {
        System.out.println(personInfoService.getByName("gj"));
    }
}