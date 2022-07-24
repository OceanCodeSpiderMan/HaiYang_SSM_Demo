package com.haiyang.service;

import com.haiyang.pojo.User;

public interface UserService {
    public User login(User user);
    public int register(User user);
}
