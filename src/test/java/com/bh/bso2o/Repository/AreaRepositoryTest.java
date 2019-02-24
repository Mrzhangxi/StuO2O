package com.bh.bso2o.Repository;

import com.bh.bso2o.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaRepositoryTest {

    @Autowired
    private AreaRepository areaRepository;

    @Test
    public void testgetAll() {
        System.out.println(areaRepository.findAll());
    }
}