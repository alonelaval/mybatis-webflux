package com.alonelaval.mybatis.service;

import com.alonelaval.mybatis.dao.mapper.UserMapper;
import com.alonelaval.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author huawei
 * @create 2018-11-06
 **/
@Component
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    UserMapper userMapper;


    public void updateUser(){
        User user = userMapper.selectByPrimaryKey(111);
        System.out.println(user);

        user.setUserRealName("111");
        userMapper.updateByPrimaryKey(user);
        throw  new RuntimeException("error");
    }

    public User queryUser(){
        User user = userMapper.selectByPrimaryKey(111);
//        System.out.println(user);
        user.setUserRealName("111");
        return  user;

    }


}
