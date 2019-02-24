package com.bh.bso2o.Service.Impl;

import com.bh.bso2o.Service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceImplTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void testgetAll() {
        System.out.println(areaService.getall());
    }

}