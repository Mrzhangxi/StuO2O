package com.bh.bso2o.Controller;

import com.bh.bso2o.Service.PersonInfoService;
import com.bh.bso2o.entity.PersonInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/")
@Slf4j
public class LoginController {

    @Autowired
    private PersonInfoService personInfoService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String verification(@RequestParam(value = "username", required = true) String username, @RequestParam(value = "password", required = true) String password, HttpServletRequest request) {
        PersonInfo personInfo = personInfoService.getByName(username);
        ModelAndView modelAndView = new ModelAndView();
        if (personInfo == null){
            return ("用户名不正确");
        }
        if (!personInfo.getPassword().equals(password)) {
            return ("密码不正确");
        }

        // TODO: 2019/2/24 这里要把登录信息写入Cookie和Redis中
//        request.getSession().setAttribute("UserID", personInfo.getId());
//        modelAndView.addObject("userId", user.getId());
//        modelAndView.setViewName("teacher/myinfo");
        return "成功";
    }
}
