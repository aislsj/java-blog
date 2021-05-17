package com.ais.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController {

    @GetMapping
    public String index(){
       return  "/admin/index/index";
    }
    @RequestMapping("/homepage")
    public String homepage(){
        return "/admin/index/homepage";
    }


}
