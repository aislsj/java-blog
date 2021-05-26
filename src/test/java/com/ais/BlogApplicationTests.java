package com.ais;

import com.ais.dao.LableRepository;
import com.ais.dao.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
class BlogApplicationTests {
	@Autowired
	private CategoryRepository categoryRepository;
	@Test
	void contextLoads() {
	}

	private LableRepository lableRepository;


	@Test
	public void test2(){
		System.out.println(lableRepository);
	}

	@Test
	@Transactional
	public void test(){
		System.out.println(categoryRepository);
	}

}
