package com.ais.service;


import com.ais.dao.CategoryRepository;
import com.ais.entity.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public  class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Transactional
    @Override
    public Page<Category> listCategory(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }
    @Transactional
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    @Transactional
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).get();
    }


    @Override
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Transactional
    @Override
    public Category updateCategory(Long id, Category category) {
        Category c = categoryRepository.getOne(id);
        BeanUtils.copyProperties(category,c);
        return categoryRepository.save(c);
    }

    @Transactional
    @Override
    public void delCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> allCategory() {
       List<Category> all=categoryRepository.findAll();
        return all;
    }
}
