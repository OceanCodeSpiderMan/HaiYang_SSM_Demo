package com.haiyang.service.UserServiceImpl;

import com.haiyang.dao.UserDao;
import com.haiyang.pojo.User;
import com.haiyang.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource(name = "UserDao")
    private UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.findUser(user);
    }

    @Override
    public int register(User user) {
        return userDao.userRegister(user);
    }
}
