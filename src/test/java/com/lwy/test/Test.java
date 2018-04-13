package com.lwy.test;

import java.util.ArrayList;
import java.util.List;

import cn.lwy.pojo.Question;

public class Test {

	public static void main(String[] args) {
		Question q1 = new Question();
		q1.setId(1);
		Question q2 = new Question();
		q2.setId(2);
		Question q3 = new Question();
		q3.setId(3);
		
		
		List<Question> list = new ArrayList<Question>();
		list.add(q1);
		list.add(q2);
		list.add(q3);
		System.out.println(list.toArray().toString());
	}
}
