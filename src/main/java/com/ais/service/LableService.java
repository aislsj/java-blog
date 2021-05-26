package com.ais.service;


import com.ais.dao.CategoryRepository;
import com.ais.entity.Category;
import com.ais.entity.Lable;
import org.springframework.beans.factory.annotation.Autowired;

public interface LableService {



    Lable saveLable(Lable lable);


    Lable findByName(String name);


}
