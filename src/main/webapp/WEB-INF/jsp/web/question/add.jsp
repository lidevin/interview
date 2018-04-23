<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<title>添加题目</title>

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
		<script>
			$(function(){
				$("#choice_select").change(function(){
					$("#choice_ul li").addClass("hidden");
					$("#choice_ul li:nth-child(" + $(this).val() +")").removeClass("hidden");
				});
			});
		</script>
	</head>
	<body>
		<!--添加面试官弹框 start-->
		<div class="bombBox" id="addDoctorBomb">
			<div class="bombContent whiteBg addDoctorBomb" style="min-width: 400px;">
				<div class="bombTit">添加题目	<a class="fa fa-remove" href="/web/question" target="main"></a></div>
				<div class="pd20">
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">标题：</span>
						</span>
						<input class="form-control" type="text" value="" id="true_name" placeholder="请填写标题">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
							<span class="btn">类型：</span>
						</span>
						<select class="form-control" id="choice_select">
							<option value="1">单选</option>
							<option value="2">多选</option>
							<option value="3">判断</option>
							<option value="4">主观</option>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
							<span class="btn">选项：(在左边设定答案)</span>
						</span>
					</div>
					<ul id="choice_ul">
						<li >
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="radio" name="choice"/>
								A 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="radio" name="choice"/>
								B 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="radio" name="choice"/>
								C 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="radio" name="choice"/>
								D 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
						</li>
						<li class="hidden">
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="checkbox" name="choice"/>
								A 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="checkbox" name="choice"/>
								B 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="checkbox" name="choice"/>
								C 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="checkbox" name="choice"/>
								D 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
						</li>
						<li class="hidden">
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="radio" name="choice"/>
								A 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
							<span class="btn">
								<input type="radio" name="choice"/>
								B 、 </span>
								</span>
								<input class="form-control" type="text" value="" placeholder="请填写选项">
							</div>
							
						</li>
						<li class="hidden">
							<div class="input-group listSeaForm mt10 wb100">
								<span class="input-group-btn">
								</span>
								<input class="form-control" type="text" value="" placeholder="请编辑答案">
							</div>
						</li>
					</ul>

					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">分数：</span>
						</span>
						<input class="form-control" type="number" id="a-age" min="1" max="150" value="">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">难度等级：</span>
						</span>
						<select class="form-control" id="department_id">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">类型：</span>
						</span>
						<!--从数据库查数据-->
						<select class="form-control" id="rank">
							<option value="">-请选择类型-</option>
							<option value="C++">C++</option>
							<option value="java">java</option>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn">
					<span class="btn">标签：</span>
						</span>
						<input class="form-control" type="text" value="" placeholder="编辑标签,多个用空格隔开">	
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