package com.yicai.applet.service;

import com.yicai.applet.entity.Msg;
import com.yicai.applet.mapper.UserMapper;
import com.yicai.applet.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public Msg judgeUser(String username, String password) {
        if(userMapper.judgeUser(username,MD5Util.codeByMd5(password)) == 1 ){
            return Msg.success();
        }else{
            return Msg.fail();
        }
    }

    public Msg addUser(String code,String name, String password) {
        if(userMapper.findUserName(code) > 0){
            return Msg.defineFail("用户账号重复，请换一个！");
        }else{
            Integer integer = userMapper.insertUser(code, name, password);
            return Msg.success();
        }
    }
}
