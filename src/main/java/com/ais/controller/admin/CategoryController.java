package com.ais.controller.admin;

import com.ais.entity.Category;
import com.ais.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public String index(@PageableDefault(size = 3,sort = {"id"},direction = Sort.Direction.DESC)
                    Pageable pageable, Model model){
        model.addAttribute("page",categoryService.listCategory(pageable));
        return  "/admin/category/index";
    }

}
