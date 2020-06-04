package com.yicai.applet.controller;

import com.yicai.applet.entity.Msg;
import com.yicai.applet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    private UserService thisService;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Msg login(String username,String password) {
        return thisService.judgeUser(username,password);
    }


    /**
     * 添加用户
     * @param code
     * @param password
     * @return
     */
    @RequestMapping("/addUser")
    @ResponseBody
    public Msg addUser(String code,String name,String password) {
        return thisService.addUser(code,name,password);
    }




}
