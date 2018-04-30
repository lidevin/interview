<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="lwy" uri="http://lwy.cn/common/" %>
<!DOCTYPE html>
<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<title>面试官列表</title>

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

		<link rel="stylesheet" type="text/css" href="/res/css/jquery.datetimepicker.css">

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

		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<div class="">
						<ul class="tabBtn clearfix" style="width: 50%; margin: auto;">
							<li class="on">试卷列表</li>
						</ul>
						<ul class="tabBox panel mt10">
							<li class="on">
								<div class="pd10 grayBg2">
									<form action="/web/paper" method="get">
										<div class="fublBox mr10"><span>类型：</span>
											<input type="text" class="form-control form-itmeB" name="name" placeholder="">
										</div>
										<input class="btn btn-primary" type="submit" value="查询">
										<a href="/web/paper/add"><button type="button" class="btn btn-primary r">添加试卷</button></a>
									</form>
								</div>
								<div class="pd10">
									<table class="table drugsTable ftc" id="userList">
										<thead>
											<tr>
												<th>编号</th>
												<th>试卷名</th>
												<th>单选题个数</th>
												<th>多选题个数</th>
												<th>判断题个数</th>
												<th>主观题个数</th>
												<th>难度等级</th>
												<th>总分数</th>
												<th>考试时间</th>
												<th>时长(m)</th>
												<th>题目信息</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${page.rows }" var="paper" varStatus="status">
												<tr>
													<td>${paper.id }</td>
													<td>${paper.type }</td>
													<td>${paper.singleCount }</td>
													<td>${paper.multipleCount }</td>
													<td>${paper.judgeCount }</td>
													<td>${paper.subjectCount }</td>
													<td>${paper.difficult }</td>
													<td>${paper.score }</td>
													<td>${paper.startTimeStr }</td>
													<td>${paper.time }</td>
													<td>
														<a href="/web/paper/qst?id=${paper.id }"><button type="button" class="btn btn-success btn-sm">题目详情</button></a> </td>
													<td>
														<a href="/web/paper/del.do?id=${paper.id }"><button type="button" class="btn btn-success btn-sm">删除</button></a>
													</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<div class="paging mt20 mb20 ftc">
									<lwy:page url="/web/paper"></lwy:page>
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