package com.yicai.applet.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    Integer judgeUser(String username, String password);

    Integer findUserName(@Param("code") String code);

    Integer insertUser(String code,String name, String password);
}
