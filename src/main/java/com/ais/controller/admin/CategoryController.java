package com.ais.controller.admin;

import com.ais.entity.Category;
import com.ais.entity.Lable;
import com.ais.service.CategoryService;
import com.ais.service.LableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


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


    @GetMapping("/category/input")
    public String add_input(Model model){
        model.addAttribute("category", new Category());
        return  "/admin/category/index-input";
    }


    @GetMapping("/category/{id}/input")
    public String edit_input(@PathVariable Long id,Model model){
        model.addAttribute("category",categoryService.getCategory(id));
        return  "/admin/category/index-input";
    }


    @GetMapping("/category/{id}/delete")
    public String delete_input(@PathVariable Long id,RedirectAttributes attributes){
        categoryService.delCategory(id);
        attributes.addFlashAttribute("message","插入成功");
        return "redirect:/admin/category";
    }


    @PostMapping("/category/input")
    public String add(@Valid Category category, BindingResult result, RedirectAttributes attributes){
        Category category1 = categoryService.findByName(category.getName());
        if(category1 != null){
            result.rejectValue("name","nameError","不能够重复分类名称");
        }

        if(result.hasErrors()){
            return "redirect:/admin/category/input";
        }
        Category c = categoryService.saveCategory(category);
        if(c == null){
            attributes.addFlashAttribute("message","插入失败");
        }else {
            attributes.addFlashAttribute("message","插入成功");
        }
        return "redirect:/admin/category";
    }



    @PostMapping("/category/{id}")
    public String editPost(@Valid Category category, BindingResult result, @PathVariable  Long id, RedirectAttributes attributes){
        Category category1 = categoryService.findByName(category.getName());
        if(category1 != null){
            result.rejectValue("name","nameError","不能够重复分类名称");
        }
        if(result.hasErrors()){
            return "redirect:/admin/category/input";
        }
        Category c = categoryService.updateCategory(id,category);
        if(c == null){
            attributes.addFlashAttribute("message","修改失败");
        }else {
            attributes.addFlashAttribute("message","修改成功");
        }
        return "redirect:/admin/category";
    }




}
