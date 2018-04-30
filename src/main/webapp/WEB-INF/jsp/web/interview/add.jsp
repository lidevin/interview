<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加面试官</title>
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
<style>
	#info{
		color:red;
		font-size: 13px;
	}
</style>
<script type="text/javascript">
		$(function(){
			//验证用户名
			var flag = false;
			$("#nickname").on("input", function(){
				var name = $("#nickname").val();
				if(name == ""){
					$("#info").html("用户名由字母数字下划线组成，长度需大于5");
					$("#info").css("color", "red");
					return ;
				}
				var m = /[a-zA-Z]+[a-z_A-Z0-9]+/;
				if(!m.test(name)){
					$("#info").html("必须以字母开头");
					$("#info").css("color", "red");
					return;
				}
				if(name.length < 5) {
					$("#info").html("用户名由字母数字下划线组成，长度需大于5");
					$("#info").css("color", "red");
					return;
				}
				$.get("/web/interview/check?name="+name,function(date){
					if(date.code == 0){//可用
						flag = true;
						$("#info").html(date.msg);
						$("#info").css("color", "green");
					}else{//不可用
						flag = false;
						$("#info").html(date.msg);
						$("#info").css("color", "red");
					}
				},"JSON"); 
			});
			$("form").submit(function(){
				if(!falg){
					$("#info").html("用户名不合规范");
					$("#info").css("color", "red");
				}
				return flag;
			});
		});
</script>
</head>
<body>
	<c:choose>
		<c:when test="${1 == add}">
			<script type="text/javascript">
					if(confirm("添加成功！\n确定要继续添加？") == false){
						window.location.href='/web/interview';
					}
				</script>
		</c:when>
		<c:when test="${0 == add}">
			<script type="text/javascript">
					if(confirm("添加失败！\n确定要重新添加？") == false){
						window.location.href='/web/interview';
					}
				</script>
		</c:when>
	</c:choose>
	<c:if test="${empty departments}">
		<script type="text/javascript">
			/* 异步加载部门*/
			$.get("/web/departments", function(data){
				$.each(data, function (index, item) {
					var content = data[index].content;
					$("#department").append("<option value='" + content + "'>" + content + "</option>");
				}); 
			},"JSON");
		</script>
	</c:if>
	<c:if test="${empty positions}">
		<script type="text/javascript">
			/* 异步加载类型*/
			$.get("/web/positions", function(data) {
				$.each(data, function(index, item) {
					var content = data[index].content;
					$("#position").append("<option value='" + content + "'>" + content + "</option>");
				});
			}, "JSON");
		</script>
	</c:if> 
	<!--添加面试官弹框 start-->
	<form action="/web/interview/add.do" method="get">
		<div class="bombBox" id="addDoctorBomb">
			<div class="bombContent whiteBg addDoctorBomb"
				style="min-width: 500px;">
				<div class="bombTit">
					添加面试官 <a class="fa fa-remove" href="/web/interview" target="main"></a>
				</div>
				<div class="pd20">
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">姓名：</span>
						</span> <input class="form-control" type="text" name="name" required="required"
							placeholder="请填写姓名">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">用户名：</span>
						</span> <input class="form-control" type="text" autocomplete="off" id="nickname" name="nickname" required="required"
							placeholder="请填写用户名">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span id="info">用户名由字母数字下划线组成，长度大于5</span>
						</span>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">密码：</span>
						</span> <input class="form-control" type="password" name="pwd" required="required"
							placeholder="请填写密码">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">性别：</span>
						</span> <select class="form-control" name="sex">
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">部门：</span>
						</span> <select class="form-control" id="department" name="department">
							<c:forEach items="${departments }" var="department" >
								<option value="${department.content }">${department.content }</option>
							</c:forEach>
							<!-- <option value="1">人事部</option>
							<option value="2">市场部</option>
							<option value="3">销售部</option> -->
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">职位：</span>
						</span> <select class="form-control" id="position" name="position">
							<c:forEach items="${positions }" var="position" >
								<option value="${position.content }">${position.content }</option>
							</c:forEach>
							<!-- <option value="0">-请选择职位-</option>
							<option value="1">经理</option>
							<option value="2">副经理</option>
							<option value="3">普通员工</option> -->
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">入职时间：</span>
						</span> <input class="form-control" type="date" value="" name="time" required="required"
							placeholder="请填写入职时间">
					</div>
				</div>
				<div class="pd20">
					<input type="submit" class="btn btn-primary wb100" value="添加">
				</div>
			</div>
			<div class="bombMask"></div>
		</div>
	</form>
</body>

</html>