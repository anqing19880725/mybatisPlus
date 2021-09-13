package com.dianxiao.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.dianxiao.mybatisplus.enums.AgeEnum;
import com.dianxiao.mybatisplus.enums.StatusEnum;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "user")
public class User {
    //    @TableId(value="id")
//    @TableId(type = IdType.NONE)
    @TableId
    private String id;
    @TableField(value = "name", select = false)
    private String title;
    private AgeEnum age;
    @TableField(exist = false)
    private String gender;
//    private Product product;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    private Integer version;

    @TableField(value = "status")
    private StatusEnum statusEnum;


}

