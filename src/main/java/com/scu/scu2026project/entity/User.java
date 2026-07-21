package com.scu.scu2026project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data //lombok注解
@TableName("tb_users")
public class User {
    @TableId(value = "USER_ID", type = IdType.AUTO)
    private Integer id;
    @TableField("USER_LOGNAME")
    private String loginName;
    @TableId("USER_PWD")
    private String password;
    @TableId("USER_REALNAME")
    private String realName;
    @TableField("USER_EMAIL")
    private String email;
    @TableField("USER_ROLE")
    private Integer roleId;
    @TableField("USER_STATE")
    private Integer state;
}
