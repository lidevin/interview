<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<title>试卷题目列表</title>

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
		<style>
			tbody tr:nth-child(odd) {
				background-color: #F3F3F3;
			}
		</style>
	</head>
	<body>
	
<!-- 	.fa-step-backward:before {
	content: "\f048"
}

.fa-fast-backward:before {
	content: "\f049"
}

.fa-backward:before {
	content: "\f04a"
} -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<div class="">
						<ul class="tabBtn clearfix" style="width: 50%; margin: auto;">
							<li class="on">试卷题目列表</li>
						</ul>
						<ul class="tabBtn clearfix" style="width: 30%; ">
							<li class="li-menu"><a href="/web/paper"
										class="menu" target="main"> <i class="fa fa-backward"></i> <span>返回</span></a>
									</li>
						</ul>
						<ul class="tabBox panel mt10">
							<li class="on">
								<div class="pd10 grayBg2">
									<!-- <a href="/web/paper/addqst"><button type="button" class="btn btn-primary r doctorAddBtn">添加试题</button></a> -->
								</div>
								<div class="pd10">
									<table class="table drugsTable ftc" id="userList">
										<thead>
											<tr>
												<th>编号</th>
												<th>题型</th>
												<th>标题</th>
												<th>分数</th>
												<th>难度等级</th>
												<th>标签</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${questions }" var="qst">
												<tr>
													<td>${qst.id }</td>
													<td>${qst.title }</td>
													<td>
														<c:choose>
															<c:when test="${1 == qst.qsttype }">
																单选题
															</c:when>
															<c:when test="${2 == qst.qsttype }">
																多选题
															</c:when>
															<c:when test="${3 == qst.qsttype }">
																判断题
															</c:when>
															<c:when test="${4 == qst.qsttype }">
																主观题
															</c:when>
														</c:choose>
													</td>
													<td>${qst.score }</td>
													<td>${qst.difficult }</td>
													<td>${qst.tags }</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<div class="paging mt20 mb20 ftc" id="userListPage"> </div>
							</li>

						</ul>
					</div>
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		</div>

	</body>

</html>