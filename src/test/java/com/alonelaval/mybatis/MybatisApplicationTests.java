package com.alonelaval.mybatis;

import com.alonelaval.mybatis.dao.mapper.UserMapper;
import com.alonelaval.mybatis.entity.User;
import com.alonelaval.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @Test
    public void  testFindById(){
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.toString());

        userService.updateUser();
    }
}
