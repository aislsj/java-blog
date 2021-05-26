package com.ais.service;

import com.ais.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);

    Category getCategory(Long id);

    Category updateCategory(Long id,Category category);

    Page<Category> listCategory(Pageable pageable);

    void delCategory(Long id);

    List<Category> allCategory();


    Category findByName(String name);


}
