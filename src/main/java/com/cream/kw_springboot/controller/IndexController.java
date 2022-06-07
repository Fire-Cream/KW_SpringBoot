package com.cream.kw_springboot.controller;

import com.cream.kw_springboot.util.CreateVerifiCodeImage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("HappyCaptcha")
    public void happyCaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取图片
        BufferedImage verifiCodeImage = CreateVerifiCodeImage.getVerifiCodeImage();
        //获取验证码
        String captcha = new String(CreateVerifiCodeImage.getVerifiCode());
        //将验证码存到session
        HttpSession session = request.getSession();
        session.setAttribute("captcha",captcha);
        ImageIO.write(verifiCodeImage,"JPEG",response.getOutputStream());
    }

    //跳转页面
    @RequestMapping("/{page}")
    public String show(@PathVariable String page){
        return page;
    }
}
