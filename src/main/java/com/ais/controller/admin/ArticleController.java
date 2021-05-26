package com.ais.controller.admin;

import com.ais.entity.Article;
import com.ais.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ArticleController {
    @Autowired
    private ArticleService articleService;


    @GetMapping("/article")
    public String index(@PageableDefault(size = 2,sort = {"updateTime"},direction = Sort.Direction.DESC)
                  Pageable pageable, Article article, Model model){


        model.addAttribute("page",articleService.listArticle(pageable,article));
        return  "/admin/article/index";
    }

}
