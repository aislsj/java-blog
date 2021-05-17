package com.ais;

import com.ais.dao.CategoryRepository;
import com.ais.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
class BlogApplicationTests {
	private CategoryService categoryService;
	@Autowired
	private CategoryRepository categoryRepository;
	@Test
	void contextLoads() {
	}

	@Test
	@Transactional
	public void test(){
		System.out.println(categoryService.getCategory(1l));
//		System.out.println(categoryRepository.findById(1l).get());
	}

}
