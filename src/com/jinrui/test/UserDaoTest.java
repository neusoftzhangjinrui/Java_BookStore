package com.jinrui.test;

import com.jinrui.dao.UserDao;
import com.jinrui.dao.impl.UserDaoTmpl;
import com.jinrui.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jinrui Zhang
 * @create 2021-01-28 18:50
 */
public class UserDaoTest {
    UserDao userDao = new UserDaoTmpl();

    @Test
    public void queryUserByUsername() {

        if (userDao.queryUserByUsername("admin123") == null) {
            System.out.println("用户名可用！");
        } else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {

        if (userDao.queryUserByUsernameAndPassword("admin", "admin") == null) {
            System.out.println("用户名或密码错误登陆失败");
        } else {
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null, "zjr123", "123456", "1072552872@qq.com")));


    }


}