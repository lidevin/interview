<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<style type="text/css">
body {
	background-color:#616263;
	min-height: 584px;
}
</style>
<script type="text/javascript">
	 $(function(){
		 Date.prototype.Format = function (fmt) { //author: meizz
			var o = {
			"M+": this.getMonth() + 1, //月份
			"d+": this.getDate(), //日
			"h+": this.getHours(), //小时
			"m+": this.getMinutes(), //分
			"s+": this.getSeconds(), //秒
			"S": this.getMilliseconds() //毫秒
			};
			if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
			for (var k in o)
			if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
			return fmt;
		}
		$("#time").attr("min", new Date().Format("yyyy-MM-ddThh:mm"));
		$("form").submit(function(){
			var str = $("#time").val().replace("T"," ");
			$("#startTime").val(str);
			alert($("#startTime").val());
			return true;
		});
	});
</script>
</head>

<body>
	<c:choose>
		<c:when test="${1 == add}">
			<script type="text/javascript">
				if (confirm("添加成功！\n确定要继续添加？") == false) {
					window.location.href = '/web/paper';
				}
			</script>
		</c:when>
		<c:when test="${0 == add}">
			<script type="text/javascript">
				if (confirm("添加失败！\n确定要重新添加？") == false) {
					window.location.href = '/web/paper';
				}
			</script>
		</c:when>
	</c:choose>
	<!-- MAIN -->
	<!--添加面试官弹框 start-->
	<div class="bombBox" id="addDoctorBomb">
		<div class="bombContent whiteBg addDoctorBomb"
			style="min-width: 400px; margin-top: -260px;">
			<div class="bombTit">
				新增试卷 <a class="fa fa-remove" href="/web/paper" target="main"></a>
			</div>
			<form action="/web/paper/add.do" method="get">
				<div class="pd20">
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"><span class="btn">试卷名：</span></span>
						<input class="form-control" type="text" name="type" required="required"
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
						<input class="form-control" type="number" name="singleCount" required="required"
							min="0" max="20" width="300px">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"><span class="btn">多选题个数：</span></span>
						<input class="form-control" type="number" name="multipleCount" required="required"
							min="0" max="20">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"><span class="btn">判断题个数：</span></span>
						<input class="form-control" type="number" name="judgeCount" required="required" min="0"
							max="20">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"><span class="btn">主观题个数：</span></span>
						<input class="form-control" type="number" name="subjectCount" required="required"
							min="0" max="20">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"><span class="btn">开始时间：</span></span>
						<input class="form-control" id="time" type="datetime-local" required="required"
						min="2018-06-30T00:00">
						<input type="hidden" id="startTime" name="startTime">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"><span class="btn">考试时长：</span></span>
						<input class="form-control" type="number" name="time" min="10" required="required"
							max="180" value="">
					</div>
				</div>
				<div class="pd20">
					<input type="submit" class="btn btn-primary wb100" value="添加">
				</div>
			</form>
		</div>
		<!-- <div class="bombMask"></div> -->
	</div>

</body>

</html>