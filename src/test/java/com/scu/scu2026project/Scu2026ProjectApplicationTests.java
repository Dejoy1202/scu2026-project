package com.scu.scu2026project;

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

}
