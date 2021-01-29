package com.jinrui.service.impl;

import com.jinrui.dao.UserDao;
import com.jinrui.dao.impl.UserDaoTmpl;
import com.jinrui.pojo.User;
import com.jinrui.service.UserService;

/**
 * @author Jinrui Zhang
 * @create 2021-01-28 20:20
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoTmpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            return false;
        }
        return true;
    }
}
