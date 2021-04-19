package com.jinrui.test;

import com.jinrui.pojo.User;
import com.jinrui.service.UserService;
import com.jinrui.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jinrui Zhang
 * @create 2021-01-28 20:25
 */
public class UserServiceTest {
UserService userService = new UserServiceImpl();
    @Test
    public void registUser() {
        userService.registUser(new User(null,"bbji167","6666","zhangjinru@163.com"));
        userService.registUser(new User(null,"bbji168","6666","zhangjinrui@163.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"zjr123","123456",null)));
    }

    @Test
    public void existUsername() {
        if (userService.existUsername("zjr")){
            System.out.println("用户名已存在！");
        }else {
            System.out.println("用户名可用！");
        }
    }

}