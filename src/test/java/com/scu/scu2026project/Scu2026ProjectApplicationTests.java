package com.scu.scu2026project;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.scu.scu2026project.entity.User;
import com.scu.scu2026project.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class Scu2026ProjectApplicationTests {
    //注入持久层接口
    @Autowired
    private UserMapper userMapper;
    @Test
    void getUserList(){
        //查询所有用户信息
        List<User> userList = userMapper.selectList(null);
        log.info("查询的用户列表：{}", userList);
        log.info("用户个数：{}", userList.size());
    }

    //根据用户名进行查询
    @Test
    void getUser() {
        //创建查询条件
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //1.列名 2.值
        queryWrapper.like("USER_LOGNAME", "d")
                .eq("USER_ROLE", 3);
        List<User> userList = userMapper.selectList(queryWrapper);
        log.info("查询的用户列表：{}", userList);
    }
/*
    @Test
    void inertUser() {
        User user = new User();
        user.setLoginName("laowang");
        user.setPassword("123456");
        user.setRealName("老王");
        user.setEmail("laowangqq.com");
        user.setRoleId(2);
        user.setState(1);
        int result = userMapper.insert(user);
        log.info("新增用户的结果：{}", result);
    }*/

    /*
    @Test
    void updateUser() {
        User user = new User();
        user.setId(7);
        user.setLoginName("tony");
        user.setEmail("tony@qq.com");
        int result = userMapper.updateById(user);
        log.info("修改用户的结果：{}", result);
    }*/

    @Test
    void getUserById() {
        User user = userMapper.selectById(7);
        log.info("查询的用户信息：{}", user);
    }

    /*
    @Test
    void deleteUserById() {
        int result = userMapper.deleteById(7);
        log.info("删除用户的结果：{}", result);
    }*/

    @Test
    void deleteUser() {
        User user = new User();
        user.setId(1);
        user.setState(0);
        int result = userMapper.updateById(user);
        log.info("逻辑删除用户的结果：{}", result);
    }


}
