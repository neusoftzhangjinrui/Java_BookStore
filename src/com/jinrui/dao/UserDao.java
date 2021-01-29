package com.jinrui.dao;

import com.jinrui.pojo.User;

/**
 * @author Jinrui Zhang
 * @create 2021-01-28 18:35
 */
public interface UserDao {
    public User queryUserByUsername(String username);
    public User queryUserByUsernameAndPassword(String username,String password);
    public int saveUser(User user);



}
