package com.dianxiao.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dianxiao.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    void test() {
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save() {
        User user = new User();
        user.setTitle("C罗");
//        user.setAge(22);
        mapper.insert(user);
        System.out.println(user);
    }

    @Test
    void update() {
//        User user = mapper.selectById(7);
//        user.setTitle("一号");
//
//        User user1 = mapper.selectById(7);
//        user1.setTitle("二号");
//
//        mapper.updateById(user1);
//        mapper.updateById(user);

        User user = mapper.selectById(1);
        user.setTitle("小红");
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("age",22);
        mapper.update(user,wrapper);

    }

    @Test
    void delete() {
//        mapper.deleteById(1);
//        mapper.deleteBatchIds(Arrays.asList(7,8));

//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("age",14);
//        mapper.delete(wrapper);

//        Map<String,Object> map = new HashMap<>();
//        map.put("id",10);
//        mapper.deleteByMap(map);

    }

//    @Test
//    void select(){
    // 不加任何条件全部查询
//        mapper.selectList(null);

//        QueryWrapper wrapper = new QueryWrapper();

    // 单条件查询 直接放入wrapper
//        wrapper.eq("name","小红");
    // 多条件查询 将条件放入map 将map传入
//        Map<String,Object> map = new HashMap<>();
//        map.put("name","小红");
//        map.put("age",3);
//        wrapper.allEq(map);
//        wrapper.gt("age",2);
//        wrapper.ne("name","小红");
//        wrapper.ge("age","2");

//        wrapper.like("name","小");
    // like"%小"
//        wrapper.likeLeft("name","小");
    // like"小%"
//        wrapper.likeRight("name","小");

    // inSQL
//        wrapper.inSql("id","select id from user where id <10");
//        wrapper.inSql("age","select age from user where age > 3");

//        System.out.println(mapper.selectList(wrapper));

//        wrapper.orderByAsc("age");
//        wrapper.orderByDesc("age");
//        wrapper.orderByAsc("age");
//        wrapper.having("id > 8 ");
//        mapper.selectList(wrapper).forEach(System.out::println);
//    }

//    @Test
//    void select() {
//        System.out.println(mapper.selectById(7));
//        mapper.selectBatchIds(Arrays.asList(7,8,9)).forEach(System.out::println);

    // map只能做等值查询 逻辑判断需要使用Wrapper来处理
//        Map<String,Object> map = new HashMap<>();
//        map.put("id",7);
//        mapper.selectByMap(map).forEach(System.out::println);

//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.gt("id",1);
//        // count返回的是统计的个数
//        System.out.println(mapper.selectCount(wrapper));

    // 将查询的结果集封装到Map中
//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.gt("id",1);
//        mapper.selectMaps(wrapper).forEach(System.out::println);
//        System.out.println("-------------");
//        mapper.selectList(wrapper).forEach(System.out::println);

    // 分页查询
    // 前面是页数,后面是每页几条
//        Page<User> page = new Page<>(1,2);
//        Page<User> result = mapper.selectPage(page,null);
//        System.out.println(result.getSize());
    // 总数
//        System.out.println(result.getTotal());
//        result.getRecords().forEach(System.out::println);

    // 返回的还是个map
//        Page<Map<String,Object>> page = new Page<>(1,2);
//        mapper.selectMapsPage(page,null).getRecords().forEach(System.out::println);

    // 返回一个object对象 拿的是主键
//        mapper.selectObjs(null).forEach(System.out::println);

    // 查询单个记录 前提这个结果集必须是只有一个结果 不然就报错
//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("id",7);
//        System.out.println(mapper.selectOne(wrapper));

//}
        @Test
        void product() {
            mapper.productList(7).forEach(System.out::println);
        }
}