package com.dianxiao.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dianxiao.mybatisplus.entity.ProductVO;
import com.dianxiao.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Select("select p.*,u.name userName from product p ,user u where p.user_id = u.id and u.id = #{id}")
    List<ProductVO> productList(Integer id);
}

//public interface UserMapper extends BaseMapper<hnapp> {
//}
