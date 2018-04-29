<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="lwy" uri="http://lwy.cn/common/" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>题目列表</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<!-- VENDOR CSS -->
		<link rel="stylesheet" href="/res/css/bootstrap.min.css">
		<link rel="stylesheet" href="/res/css/font-awesome.min.css">
		<link rel="stylesheet" href="/res/css/chartist-custom.css">
		<!-- MAIN CSS -->
		<link rel="stylesheet" href="/res/css/main.css">
		<link rel="stylesheet" href="/res/css/demo.css">
		<link rel="stylesheet" href="/res/css/public.css">
        <script type="text/javascript" src="/res/js/pageNav.js"></script>
		<script src="/res/js/jquery.min.js"></script>
		<script src="/res/js/bootstrap.min.js"></script>
		<script src="/res/js/jquery.slimscroll.min.js"></script>
		<script src="/res/js/jquery.easypiechart.min.js"></script>
		<script src="/res/js/chartist.min.js"></script>
		<script src="/res/js/klorofil-common.js"></script>
		<script src="/res/js/jquery.datetimepicker.js"></script>
		<script src="/res/js/public.js"></script>
		<script src="/res/js/check.form.js"></script>
		<script src="/res/js/layer.js"></script>
		<link rel="stylesheet" href="/res/css/layer.css" id="layuicss-layer">
		<style type="text/css">
			table tbody tr:nth-child(odd) {
				background-color: #F3F3F3;
			}
		</style>
	</head>
	<body>
		<c:choose>
			<c:when test="${del == 1}">
				<script type="text/javascript">
					alert("删除成功！");
				</script>
			</c:when>
			<c:when test="${del == 0}">
				<script type="text/javascript">
					alert("删除失败！");
				</script>
			</c:when>
		</c:choose>
		
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<div class="">
						<ul class="tabBtn clearfix" style="width: 50%; margin: auto;">
							<li class="on">题目列表</li>
						</ul>
						<ul class="tabBox panel mt10">
							<li class="on">
								<div class="pd10 grayBg2">
									<form action="/web/question" method="get">
										<div class="fublBox mr10"><span>题目标题：</span>
										<input type="text" name="title" class="form-control form-itmeB" value="${title }">
										</div>
										<input type="submit" class="btn btn-primary" value="查询">
										<!-- <button type="button" class="btn btn-primary">查询</button> -->
										<a href="/web/question/add"><button type="button" class="btn btn-primary r">添加试题</button></a>
									</form>
								</div>
								<div class="pd10">
									<table class="table drugsTable ftc" id="userList">
										<thead >
											<tr>
												<th>编号</th>
												<th>标题</th>
												<th>分数</th>
												<th>难度等级</th>
												<th>标签</th>
												<th>类型</th>
												<th>答案</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${page.rows }" var="question" varStatus="status">
												<tr>
													<td>${question.id }</td>
													<td>${question.title }</td>
													<td>${question.score }</td>
													<td>${question.difficult }</td>
													<td>${question.kind }</td>
													<td>${question.tags }</td>
													<td>${question.answer }</td>
													<td><a href="/web/question/edit?id=${question.id }"><button type="button" class="btn btn-success btn-sm">编辑</button></a> <a href="/web/question/del.do?id=${question.id }"><button type="button" class="btn btn-default btn-sm deleteBtn">删除</button></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<div class="paging mt20 mb20 ftc" id="userListPage">
									<lwy:page url="/web/question"></lwy:page>
								</div>
							</li>
						</ul>
					</div>
					
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		</div>
	</body>

</html>