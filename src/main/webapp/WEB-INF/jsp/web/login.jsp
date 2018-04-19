<%@page import="org.springframework.web.servlet.DispatcherServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<c:if test="${not empty USERNAME}">
		<%response.sendRedirect("/web/index.html");	%>
	</c:if>
	<h1>登录</h1>
	<form action="${pageContext.request.contextPath }/web/login.do"
		method="post">
		用户名：<input type="text" name="name"><br> 
		密码：<input type="password" name="pwd"><br>
		<c:if test="${not empty errMsg}">
			<label style="color:red;">${errMsg }</label><br>
		</c:if>
		<input type="submit" value="登录">
	</form>
</body>
</html>