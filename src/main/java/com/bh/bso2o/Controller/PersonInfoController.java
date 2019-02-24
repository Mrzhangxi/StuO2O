package com.bh.bso2o.Controller;

import com.bh.bso2o.Contorver.PersonInfo2VO;
import com.bh.bso2o.ViewObject.PersonInfoVO;
import com.bh.bso2o.Service.PersonInfoService;
import com.bh.bso2o.Utils.DateUtils;
import com.bh.bso2o.entity.PersonInfo;
import com.bh.bso2o.enums.PersonInfoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/personinfo")
public class PersonInfoController {

    @Autowired
    private PersonInfoService personInfoService;

    @RequestMapping("/getall")
    @ResponseBody
    public List<PersonInfoVO> getall() {
        List<PersonInfo> personInfos = personInfoService.getAll();
        List<PersonInfoVO> personInfoVOS = new ArrayList<>();
        for(PersonInfo personInfo : personInfos) {
            personInfoVOS.add(PersonInfo2VO.personInfo2PersonInfoVO(personInfo));
        }
        return personInfoVOS;
    }

    @RequestMapping("/getallbystatus/{status}")
    @ResponseBody
    public List<PersonInfoVO> getallBystatus(@PathVariable(value = "status") String status) {
        int istatus = PersonInfoEnum.getUserCode(status).getCode();
        List<PersonInfo> personInfos = personInfoService.getAllbyStatus(istatus);
        List<PersonInfoVO> personInfoVOS = new ArrayList<>();
        for(PersonInfo personInfo : personInfos) {
            personInfoVOS.add(PersonInfo2VO.personInfo2PersonInfoVO(personInfo));
        }
        return personInfoVOS;
    }

    @RequestMapping("/getallbytype/{type}")
    @ResponseBody
    public List<PersonInfoVO> getallBytype(@PathVariable(value = "type") String type) {
        int itype = PersonInfoEnum.getUserCode(type).getCode();
        List<PersonInfo> personInfos = personInfoService.getAllbyType(itype);
        List<PersonInfoVO> personInfoVOS = new ArrayList<>();
        for(PersonInfo personInfo : personInfos) {
            personInfoVOS.add(PersonInfo2VO.personInfo2PersonInfoVO(personInfo));
        }
        return personInfoVOS;
    }

    @RequestMapping("/getbyid/{id}")
    @ResponseBody
    public PersonInfoVO getallByid(@PathVariable(value = "id") Integer id) {
        PersonInfo personInfo = personInfoService.getByUserId(id);
        System.out.println(personInfo);
        return PersonInfo2VO.personInfo2PersonInfoVO(personInfo);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public PersonInfoVO create(PersonInfoVO personInfoVO) {
        System.out.println(personInfoVO);
        PersonInfo personInfo = PersonInfo2VO.personInfoVO2PersonInfo(personInfoVO);
        personInfo.setCreateTime(new Date());
        personInfo.setLastEditTime(new Date());
        return PersonInfo2VO.personInfo2PersonInfoVO(personInfoService.createPersonInfo(personInfo));
    }
}
