package com.bh.bso2o.Service;

import com.bh.bso2o.entity.PersonInfo;

import java.util.List;

public interface PersonInfoService {

    List<PersonInfo> getAll();

    List<PersonInfo> getAllbyStatus(Integer status);

    List<PersonInfo> getAllbyType(Integer type);

    PersonInfo getByUserId(Integer userId);

    PersonInfo createPersonInfo(PersonInfo personInfo);

    PersonInfo modifyPersonInfo(PersonInfo personInfo);

    PersonInfo getByName(String name);

//    String deletePersonInfo(Integer userId);
}
