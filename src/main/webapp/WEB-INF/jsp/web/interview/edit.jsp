<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<title>编辑面试官</title>

		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<!-- VENDOR CSS -->
		<link rel="stylesheet" href="/res/css/bootstrap.min.css">
		<link rel="stylesheet" href="/res/css/font-awesome.min.css">
		<link rel="stylesheet" href="/res/css/style.css">
		<link rel="stylesheet" href="/res/css/chartist-custom.css">

		<link rel="stylesheet" href="/res/css/main.css">
		<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
		<link rel="stylesheet" href="/res/css/demo.css">
		<!-- public -->
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

	</head>

	<body>

		<!--添加面试官弹框 start-->
		<div class="bombBox" id="addDoctorBomb">
			<div class="bombContent whiteBg addDoctorBomb" style="min-width: 500px;">
				<div class="bombTit">编辑面试官
					<a class="fa fa-remove" href="/web/interview" target="main"></a>
				</div>
				<div class="pd20">
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">姓名：</span>
						</span>
						<input class="form-control" type="text" value="" id="true_name" placeholder="请填写姓名">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">性别：</span>
						</span>
						<select class="form-control" id="department_id">
							<option value="1">男</option>
							<option value="2">女</option>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">部门：</span>
						</span>
						<select class="form-control" id="department_id">
							<option value="">请选择部门</option>
							<option value="1">HR</option>
							<option value="2">部门2</option>
							<option value="3">部门3</option>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">职位：</span>
						</span>
						<select class="form-control" id="rank">
							<option value="0">-请选择职位-</option>
							<option value="1">经理</option>
							<option value="2">副经理</option>
							<option value="3">普通员工</option>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">手机号：</span>
						</span>
						<input class="form-control" type="number" id="user_name" value="" placeholder="请输入手机号">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">年龄：</span>
						</span>
						<input class="form-control" type="number" id="a-age" min="1" max="150" value="">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">入职时间：</span>
						</span>
						<input class="form-control" type="date" value="" id="true_name" placeholder="请填写入职时间">
					</div>
				</div>
				<div class="pd20">
					<button type="button" class="btn btn-primary wb100" id="addUser">保存</button>
				</div>
			</div>
			<div class="bombMask"></div>
		</div>

	</body>

</html>