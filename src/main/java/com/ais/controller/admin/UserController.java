package com.ais.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {


    @GetMapping("/admin/user")
    public String index(){
        return  "/admin/user/index";
    }
}
