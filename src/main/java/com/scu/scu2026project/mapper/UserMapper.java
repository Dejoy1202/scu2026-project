package com.scu.scu2026project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scu.scu2026project.entity.User;
import org.springframework.stereotype.Repository;

@Repository //仓库注解
public interface UserMapper extends BaseMapper<User> {
}
