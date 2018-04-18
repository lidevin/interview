package com.lwy.test;

public class Test3 {

	public static void main(String[] args) {
		//	uri:/
		//	uri:/web
		//	uri:/web/
		String uri = "/";
		
		if(uri.matches("^/wx.*")) {//微信端
			System.out.println("微信");
		}else {
			if("/".equals(uri)) {
				
			}else if(uri.matches("^/web/?")) {//代表登录界面，放行
				
				System.out.println("web放行");
				return ;
			}else {
				System.out.println("判断是否登录");
				//判断是否登录
			}
		}
	}
}
