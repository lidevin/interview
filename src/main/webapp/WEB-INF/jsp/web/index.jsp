<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>面试系统</title>

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
<style>
.brand {
	height: 60px !important;
}

.brand img {
	width: 60px;
	line-height: 60px;
}

.brand div {
	margin-top: -5px;
	float: right;
	width: 160px;
	height: 60px;
	font-size: 10px;
}

.brand div span {
	margin-bottom: 13px;
	display: block;
	margin-left: 0px !important;
	height: 10px !important;
	font-size: 15px;
}

.container-fluid {
	color: #FFFFFF;
	font-size: 20px;
	line-height: 60px;
	text-align: center;
	background-image: url(/res/img/timg.jpg);
}

.statistic li:first-child {
	margin-top: 10px;
	margin-bottom: 20px;
}

.statistic li {
	margin-left: 50px;
}

.statistic li a:hover i {
	color: #3287B2;
}

.statistic li a:hover span {
	color: #FFFFFF;
}

.statistic li a {
	color: #AEB7C2;
}
#show{
	position: fixed;
	margin-left: 248px;
	margin-top: -150px;
	border: 0px;
}
#show button{
	background-color: #00AAFF;
	border-radius: 50%;
	border: 0px;
	outline: none;
}

</style>
<script>
	$(function() {
		$(".statistic").toggleClass("hidden");
		$(".statistic-li").click(function() {
			$(".statistic-li i").toggleClass("fa-folder-o");
			$(".statistic-li i").toggleClass("fa-folder-open-o");
			$(".statistic").toggleClass("hidden");
		});
	});
</script>
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<img src="/res/img/def.jpg" style="display: inline-block;">
				<div>
					<span>用户名：<label>admin</label></span> <span>角色：<label>系统管理员</label></span>
				</div>
			</div>
			<div class="container-fluid">
				<span>H&nbsp;&nbsp;R&nbsp;&nbsp;系&nbsp;&nbsp;统&nbsp;&nbsp;后&nbsp;&nbsp;台&nbsp;&nbsp;管&nbsp;&nbsp;理</span>
			</div>
		</nav>
		<!-- LEFT SIDEBAR -->
		<div id="sidebar-nav" class="sidebar" style="margin-top: 60px;">
			<div class="slimScrollDiv"
				style="position: relative; overflow: hidden; width: auto; height: 95%;">
				<div class="sidebar-scroll"
					style="overflow: hidden; width: auto; height: 95%;">
					<nav>
						<ul class="nav" id="menu-nav">
							<li class="li-menu"><a href="/web/question" class="menu"
								target="main"> <i class="fa fa-files-o"></i> <span>题库信息</span>
							</a></li>
							<li class="li-menu"><a href="/web/interview" class="menu"
								target="main"> <i class="fa fa-files-o"></i><span>面试官信息</span>
							</a></li>
							<li class="li-menu"><a href="/web/paper" class="menu"
								target="main"> <i class="fa fa-files-o"></i><span>试卷信息</span>
							</a></li>
							<li class="li-menu statistic-li"><a
								class="menu" target="main" style="cursor: pointer;"> <i class="fa fa-folder-o"></i><span>统计分析</span>
							</a></li>
							<li class="li-menu">
								<ul class="statistic">
									<li class="li-menu"><a href="/web/statistic/paper"
										class="menu" target="main"> <i class="fa fa-file-o"></i> <span>试卷分析</span>
									</a></li>
									<li class="li-menu"><a href="/web/statistic/question"
										class="menu" target="main"> <i class="fa fa-file-o"></i> <span>题目统计</span></a>
									</li>
								</ul>
							</li>

							<li class="li-menu"><a href="/web/quit" class="menu"> <i class="fa fa-sign-out"></i> <span>退&nbsp;&nbsp;出</span></a>
							</li>
						</ul>
						<div id="show" >
							<button type="button" class="btn-toggle-fullwidth"><i class="fa fa-toggle-left"></i></button>
						</div>
					</nav>
				</div>
				<div class="slimScrollBar"
					style="background: rgb(0, 0, 0); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px; height: 1040px;"></div>
				<div class="slimScrollRail"
					style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div>
			</div>
		</div>
		<!-- END LEFT SIDEBAR -->
		<!--主体右部分-->
		<iframe src="/web/content" class="main" name="main" id="main"	frameborder="0" scrolling="yes" onload="this.height=100" height="100" style="min-height: 500px;"></iframe>
	</div>
	
	<script type="text/javascript">
		//iframe高度自适应
		 $(function(){
			 $("#main").load(function(){
				var iframe = document.getElementById("main");
				try {
					var bHeight = iframe.contentWindow.document.body.scrollHeight;
					var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
					iframe.height = Math.max(bHeight, dHeight);
				} catch (ex) {	alert("ex" + iframe.height);				}
			 });
		 });
		//左侧导航
		$(document).on(
		'click',
		'#menu-nav li a',
		function(data) {
			$(this).addClass('active').closest('li').siblings('li')
					.find('a').removeClass('active');
		});
	</script>
	<!-- END WRAPPER -->
	<!-- <div class="layui-layer-move"></div> -->
</body>
</html>