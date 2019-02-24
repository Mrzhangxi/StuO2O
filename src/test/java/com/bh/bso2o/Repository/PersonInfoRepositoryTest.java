package com.bh.bso2o.Repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonInfoRepositoryTest {

    @Autowired
    private PersonInfoRepository personInfoRepository;

    @Test
    public void getAll() {
        System.out.println(personInfoRepository.findAll());
    }

    @Test
    public void getByName() {
        System.out.println(personInfoRepository.findByName("gj"));
    }
}