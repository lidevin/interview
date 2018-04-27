package com.lwy.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lwy.service.QuestionService;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration({"/spring/*.xml", "/conf/*.xml", "/mybatis/*.xml"})
public class TestQuestion {

//	@Autowired
	QuestionService qs;
	
	@Test
	public void test1() {
		System.out.println(qs);
	}
}
