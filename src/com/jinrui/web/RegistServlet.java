package com.jinrui.web;

import com.jinrui.pojo.User;
import com.jinrui.service.UserService;
import com.jinrui.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jinrui Zhang
 * @create 2021-01-29 14:55
 */
public class RegistServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        if ("abcde".equalsIgnoreCase(code)) {

            if (userService.existUsername(username)) {

                System.out.println("用户名[" + username + "]已存在");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);

            } else {

                userService.registUser(new User(null, username, password, email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);
            }
        } else {
            System.out.println("验证码[" + code + "]错误！");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }
    }
}
