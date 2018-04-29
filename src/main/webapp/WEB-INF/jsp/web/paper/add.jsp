<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>新增试卷</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet" href="/res/css/bootstrap.min.css">
<link rel="stylesheet" href="/res/css/font-awesome.min.css">

<link rel="stylesheet" href="/res/css/chartist-custom.css">

<link rel="stylesheet" href="/res/css/main.css">
<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
<link rel="stylesheet" href="/res/css/demo.css">
<!-- public -->
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

	<!-- WRAPPER -->
	<!-- MAIN -->
	<div class="main">
		<!-- MAIN CONTENT -->
		<div class="main-content">
			<div class="container-fluid">
				<div class=""></div>
			</div>
		</div>
		<!-- END MAIN CONTENT -->
	</div>
	<!--添加面试官弹框 start-->
	<div class="bombBox" id="addDoctorBomb">
		<div class="bombContent whiteBg addDoctorBomb"
			style="min-width: 500px; margin-top: -350px;">
			<div class="bombTit">
				新增试卷 <a class="fa fa-remove" href="/web/paper" target="main"></a>
			</div>
			<div class="pd20">
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"><span class="btn">试卷标题：</span></span>
					<input class="form-control" type="text" value="" id="true_name"
						width="200px">
				</div>
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"> <span class="btn">难度等级：</span>
					</span> <select class="form-control" name="difficult">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
				</div>
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"><span class="btn">单选题个数：</span></span>
					<input class="form-control" type="number" value="" min="0" max="20"
						width="300px">
				</div>
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"><span class="btn">多选题个数：</span></span>
					<input class="form-control" type="text" value="" min="0" max="20">
				</div>
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"><span class="btn">判断题个数：</span></span>
					<input class="form-control" type="text" value="" min="0" max="20">
				</div>
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"><span class="btn">主观题个数：</span></span>
					<input class="form-control" type="text" value="" min="0" max="20">
				</div>
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"><span class="btn">开始时间：</span></span>
					<input class="form-control" type="datetime-local" value="" min="0"
						max="50">
				</div>
				<div class="input-group listSeaForm mt10 wb100">
					<span class="input-group-btn"><span class="btn">考试时长：</span></span>
					<input class="form-control" type="number" id="a-age" min="10"
						max="180" value="">
				</div>
			</div>
			<div class="pd20">
				<button type="button" class="btn btn-primary wb100" id="addUser">添加</button>
			</div>
		</div>
		<div class="bombMask"></div>
	</div>

</body>

</html>