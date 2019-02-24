package com.bh.bso2o.Service.Impl;

import com.bh.bso2o.Repository.PersonInfoRepository;
import com.bh.bso2o.Service.PersonInfoService;
import com.bh.bso2o.entity.PersonInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {

    @Autowired
    private PersonInfoRepository personInfoRepository;

    @Override
    public List<PersonInfo> getAll() {
        return personInfoRepository.findAll();
    }

    @Override
    public List<PersonInfo> getAllbyStatus(Integer status) {
        return personInfoRepository.findAllByEnableStatus(status);
    }

    @Override
    public List<PersonInfo> getAllbyType(Integer type) {
        return personInfoRepository.findAllByUserType(type);
    }

    @Override
    public PersonInfo getByUserId(Integer userId) {
        return personInfoRepository.findByUserId(userId);
    }

    @Override
    public PersonInfo createPersonInfo(PersonInfo personInfo) {
        return personInfoRepository.save(personInfo);
    }

    @Override
    public PersonInfo modifyPersonInfo(PersonInfo personInfo) {
        int userId = personInfo.getUserId();
        PersonInfo old = personInfoRepository.findByUserId(userId);
        personInfo.setCreateTime(old.getCreateTime());
        personInfo.setLastEditTime(old.getLastEditTime());
        return personInfoRepository.save(personInfo);
    }

    @Override
    public PersonInfo getByName(String name) {
        return personInfoRepository.findByName(name);
    }

//    @Override
//    public String deletePersonInfo(Integer userId) {
//        personInfoRepository.deleteByUserId(1);
//        return "success";
//    }
}
