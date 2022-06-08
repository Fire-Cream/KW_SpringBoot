package com.cream.kw_springboot.controller;

import com.cream.kw_springboot.bean.User;
import com.cream.kw_springboot.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String captcha = request.getParameter("captcha");
        if (username == null || password == null || captcha == null) return "login";
        //判断验证码是否正确
        System.out.println(captcha.toLowerCase()+" "+(request.getSession().getAttribute("captcha")).toString().toLowerCase());
        System.out.println(captcha.toLowerCase().equals((request.getSession().getAttribute("captcha")).toString().toLowerCase()));
        if (!captcha.toLowerCase().equals((request.getSession().getAttribute("captcha")).toString().toLowerCase())){
            model.addAttribute("msg","验证码错误");
            return "login";
        }
        User user = userService.login(username,password);
        if (user == null){
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
        request.getSession().setAttribute("user",user);
        return "index";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //接收用户的注册信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");

        //创建User对象储存注册的用户信息
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setNickName(name);
        user.setTelephone(tel);

        //创建UserService 进行注册操作
        userService.registerUser(user);
        response.sendRedirect(request.getContextPath() + "/login");
        return null;
    }

    //退出
    @RequestMapping("/exit")
    public String exit(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //销毁session
        request.getSession().invalidate();
        //跳转到登录页面
        response.sendRedirect(request.getContextPath() + "/");
        return null;
    }

    //ajax验证用户名是否存在
    @RequestMapping("checkUser")
    @ResponseBody
    public Map<String, String> checkUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //解决乱码
        response.setContentType("application/json;charset=utf-8");

        String username = request.getParameter("username");
        User user = userService.existUser(username);
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> map = new HashMap<>();
        if (user != null) {
            map.put("code", "0");
            map.put("rs", "用户名已被使用");
        } else {
            map.put("code", "1");
            map.put("rs", "用户名可以使用");
        }
        //objectMapper.writeValue(response.getWriter(), map);
        return map;
    }
}
