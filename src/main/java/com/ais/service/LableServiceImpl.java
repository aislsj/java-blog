package com.ais.service;


import com.ais.dao.LableRepository;
import com.ais.entity.Category;
import com.ais.entity.Lable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public  class LableServiceImpl implements LableService {

    @Autowired
    private LableRepository lableRepository;

    @Override
    public Lable saveLable(Lable lable) {
        return lableRepository.save(lable);
    }


    @Override
    public Lable findByName(String name) {
        return lableRepository.findByName(name);

    }
}
