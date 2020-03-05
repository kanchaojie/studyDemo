package com.kcj.mapper;

import com.kcj.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component("userMapper")
public interface UserMapper extends Mapper<User> {
}
