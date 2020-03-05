package com.kcj.service;

import com.kcj.mapper.UserMapper;
import com.kcj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
    @Transactional//jdbc引入已经完成事务了，这里加只是告诉spring当前方法需要事务控制
    public void insertUser(User user){
        userMapper.insert(user);
    }
}
