package com.ais.dao;


import com.ais.entity.Category;
import com.ais.entity.Lable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface LableRepository extends JpaRepository<Lable,Long> {
    Lable findByName(String name);


}
