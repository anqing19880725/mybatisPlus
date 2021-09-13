package com.dianxiao.mybatisplus.mapper;

import com.dianxiao.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    void test(){
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save(){
        User user = new User();
        user.setTitle("C罗");
        user.setAge(22);
        mapper.insert(user);
        System.out.println(user);
    }

    @Test
    void update(){
        User user = mapper.selectById(7);
        user.setTitle("一号");

        User user1 = mapper.selectById(7);
        user1.setTitle("二号");

        mapper.updateById(user1);
        mapper.updateById(user);
    }


}