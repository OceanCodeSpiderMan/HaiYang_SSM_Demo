package com.haiyang.dao.UserDaoImpl;

import com.haiyang.Utils.MybatisUtils;
import com.haiyang.dao.UserDao;
import com.haiyang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public User findUser(User user) {
        SqlSession session= MybatisUtils.getSession();
         UserDao userDao=session.getMapper(UserDao.class);
         User users=userDao.findUser(user);
         session.close();
        return users;
    }

    @Override
    public int userRegister(User user) {
        SqlSession session=MybatisUtils.getSession();
        UserDao userDao=session.getMapper(UserDao.class);
        int result=userDao.userRegister(user);
        session.commit();
        session.close();
        return result;
    }
}
