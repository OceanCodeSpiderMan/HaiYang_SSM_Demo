package com.haiyang.controller;

import com.haiyang.pojo.User;
import com.haiyang.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Resource(name = "UserService")
    private UserService userService;
    @RequestMapping("login")
    public String isUser(User user, HttpSession session)
    {
        User u=userService.login(user);
        if(u!=null)
        {
            session.setAttribute("userName",u);
            return "main";
        }
        else
        {
            session.setAttribute("userInfo","账号或者密码错误!");
            return "login";
        }
    }
@RequestMapping("register")
    public String userAdd(User user)
{
     int result=userService.register(user);
     System.out.println("影响"+result+"行");
     return "success";
}
@RequestMapping("loginout")
    public String loginout(HttpSession session)
{
    session.invalidate();
    return "login";
}
}
