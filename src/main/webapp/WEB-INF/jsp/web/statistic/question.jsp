<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="lwy" uri="http://lwy.cn/common/"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>题目分析</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet" href="/res/css/bootstrap.min.css">
<link rel="stylesheet" href="/res/css/font-awesome.min.css">

<link rel="stylesheet" href="/res/css/chartist-custom.css">
<!-- MAIN CSS -->
<link rel="stylesheet" href="/res/css/main.css">

<link rel="stylesheet" href="/res/css/demo.css">

<link rel="stylesheet" href="/res/css/public.css">

<link rel="stylesheet" type="text/css"
	href="/res/css/jquery.datetimepicker.css">

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

</head>
<body>
	<div class="main">
		<!-- MAIN CONTENT -->
		<div class="main-content">
			<div class="container-fluid">
				<div class="">
					<ul class="tabBtn clearfix" style="width: 50%; margin: auto;">
						<li class="on">题目分析</li>
					</ul>
					<ul class="tabBox panel mt10">
						<li class="on">
							<div class="pd10 grayBg2">
								<form action="/web/statistic/question" method="get">
									<div class="fublBox mr10">
										<span>题目标题：</span> <input type="text" value="${title }"
											name="query" class="form-control form-itmeB" placeholder="">
									</div>
									<input type="submit" class="btn btn-primary" value="查询">
								</form>
							</div>
							<div class="pd10">
								<table class="table drugsTable ftc" id="userList">
									<thead>
										<tr>
											<th>编号</th>
											<th>标题</th>
											<th>分数</th>
											<th>难度等级</th>
											<th>标签</th>
											<th>类型</th>
											<th>正确率</th>
											<th>平均分</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${page.rows }" var="question">
											<tr>
												<td>${question.qst.id }</td>
												<td>${question.qst.title }</td>
												<td>${question.qst.score }</td>
												<td>${question.qst.difficult }</td>
												<td>${question.qst.tags }</td>
												<td>
													<c:choose>
														<c:when test="${1 == question.qst.qsttype}">
															单选题
														</c:when>
														<c:when test="${2 == question.qst.qsttype}">
															多选题
														</c:when>
														<c:when test="${3 == question.qst.qsttype}">
															判断题
														</c:when>
														<c:when test="${4 == question.qst.qsttype}">
															主观题
														</c:when>
													</c:choose>
												</td>
												<td>${question.accuracy }%</td>
												<td>${question.avgerage }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
							<div class="paging mt20 mb20 ftc">
								<lwy:page url="/web/statistic/question"></lwy:page>
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