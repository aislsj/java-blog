package com.ais.controller.admin;

import com.ais.entity.User;
import com.ais.service.UserService;
import com.ais.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String index(){
        return  "/admin/login/index";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            HttpSession session,
            RedirectAttributes attributes){
        User user = userService.checkUser(username, MD5Util.getMD5(password));
        if(user != null){
            user.setPassword(null);
            session.setAttribute("user",user);
            return "/admin/index/index";
        }else{
            attributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/admin/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){

        session.removeAttribute("user");
        return "redirect:/admin/login";
    }

}
