package com.nowcoder.communtity.service;

import com.nowcoder.communtity.dao.UserMapper;
import com.nowcoder.communtity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

}
