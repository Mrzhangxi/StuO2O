package com.bh.bso2o.Contorver;

import com.bh.bso2o.Utils.DateUtils;
import com.bh.bso2o.ViewObject.PersonInfoVO;
import com.bh.bso2o.entity.PersonInfo;
import com.bh.bso2o.enums.PersonInfoEnum;

public class PersonInfo2VO {

    public static PersonInfoVO personInfo2PersonInfoVO(PersonInfo personInfo){
        PersonInfoVO personInfoVO = new PersonInfoVO();
        personInfoVO.setEmail(personInfo.getEmail());
        personInfoVO.setGender(personInfo.getGender());
        personInfoVO.setName(personInfo.getName());
        personInfoVO.setPassword(personInfo.getPassword());
        personInfoVO.setProfileImg(personInfo.getProfileImg());
        personInfoVO.setUserId(personInfo.getUserId());
        personInfoVO.setUserType(PersonInfoEnum.getUserType(personInfo.getUserType()).getMsg());
        personInfoVO.setEnableStatus(PersonInfoEnum.getUserType(personInfo.getEnableStatus()).getMsg());
        personInfoVO.setCreateTime(DateUtils.dateToString(personInfo.getCreateTime()));
        personInfoVO.setLastEditTime(DateUtils.dateToString(personInfo.getLastEditTime()));
        return personInfoVO;
    }

    public static PersonInfo personInfoVO2PersonInfo(PersonInfoVO personInfoVO){
        PersonInfo personInfo = new PersonInfo();
        if (!(personInfoVO.getUserId() == null || "".equals(personInfoVO.getUserId()))){
            personInfo.setUserId(personInfoVO.getUserId());
        }
        personInfo.setEmail(personInfoVO.getEmail());
        personInfo.setGender(personInfoVO.getGender());
        personInfo.setName(personInfoVO.getName());
        personInfo.setPassword(personInfoVO.getPassword());
        personInfo.setProfileImg(personInfoVO.getProfileImg());
        personInfo.setUserType(PersonInfoEnum.getUserCode(personInfoVO.getUserType()).getCode());
        personInfo.setEnableStatus(PersonInfoEnum.getUserCode(personInfoVO.getEnableStatus()).getCode());
        if (!(personInfoVO.getCreateTime()==null || "".equals(personInfoVO.getCreateTime()))){
            personInfo.setCreateTime(DateUtils.stringToDate(personInfoVO.getCreateTime()));
        }
        if (!(personInfoVO.getLastEditTime()==null || "".equals(personInfoVO.getLastEditTime()))){
            personInfo.setLastEditTime(DateUtils.stringToDate(personInfoVO.getLastEditTime()));
        }
        return personInfo;
    }
}
