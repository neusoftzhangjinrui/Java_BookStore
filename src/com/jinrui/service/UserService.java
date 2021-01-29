package com.jinrui.service;

import com.jinrui.pojo.User;

/**
 * @author Jinrui Zhang
 * @create 2021-01-28 20:16
 */
public interface UserService {
    public void registUser(User user);
    public User login(User user);
    public boolean existUsername(String username);
}
