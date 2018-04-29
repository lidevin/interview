<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑面试官</title>
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
#info {
	color: red;
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
					return ;
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
		<c:when test="${1 == edit}">
			<script type="text/javascript">
					alert("编辑成功！\n1秒后返回！");
					setTimeout('window.location="/web/interview"',500);
					/* setTimeout('window.location="/web/interview"',1000); */
				</script>
		</c:when>
		<c:when test="${0 == edit}">
			<script type="text/javascript">
					if(!confirm("编辑失败！是否重新编辑？")){
						window.location.href='/web/interview/edit?id=${interview.id}';
					}
				</script>
		</c:when>
	</c:choose>
	<c:if test="${empty departments}">
		<script type="text/javascript">
			/* 异步加载部门*/
			$.get("/web/departments", function(data){
				var temp = "${interviewer.department}";
				$.each(data, function (index, item) {
					var content = data[index].content;
					if(content != temp)
						$("#department").append("<option value='" + content + "'>" + content + "</option>");
				}); 
			},"JSON");
		</script>
	</c:if>
	<c:if test="${empty positions}">
		<script type="text/javascript">
			/* 异步加载类型*/
			$.get("/web/positions", function(data) {
				var temp = "${interviewer.position}";
				$.each(data, function(index, item) {
					var content = data[index].content;
					if(content != temp)
						$("#position").append("<option value='" + content + "'>" + content + "</option>");
				});
			}, "JSON");
		</script>
	</c:if>
	<!--编辑面试官弹框 start-->
	<form action="/web/interview/edit.do" method="get">
		<div class="bombBox" id="addDoctorBomb">
			<input type="hidden" value="${interviewer.id }" name="id">
			<div class="bombContent whiteBg addDoctorBomb"
				style="min-width: 500px;">
				<div class="bombTit">
					编辑面试官 <a class="fa fa-remove" href="/web/interview" target="main"></a>
				</div>
				<div class="pd20">
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">姓名：</span>
						</span> <input class="form-control" type="text"
							value="${interviewer.name }" name="name" required="required"
							placeholder="请填写姓名">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">用户名：</span>
						</span> <input class="form-control" type="text" id="nickname" autoComplete="off"
							value="${interviewer.nickname }" name="nickname"
							required="required" placeholder="请填写用户名">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span id="info">用户名由字母数字下划线组成，长度需大于5</span>
						</span>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">密码：</span>
						</span> <input class="form-control" type="password"
							value="${interviewer.pwd }" readonly="readonly" name="pwd"
							required="required" placeholder="请填写密码">
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">性别：</span>
						</span> <select class="form-control" name="sex">
							<c:choose>
								<c:when test="${interviewer.sex eq '男'}">
									<option value="男">男</option>
									<option value="女">女</option>
								</c:when>
								<c:otherwise>
									<option value="女">女</option>
									<option value="男">男</option>
								</c:otherwise>
							</c:choose>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">部门：</span>
						</span> <select class="form-control" id="department" name="department">
							<option value="${interviewer.department }">${interviewer.department }</option>
							<c:forEach items="${departments }" var="department">
								<c:if test="${interviewer.department != department.content}">
									<option value="${department.content }">${department.content }</option>
								</c:if>
							</c:forEach>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">职位：</span>
						</span> <select class="form-control" id="position" name="position">
							<option value="${interviewer.position }">${interviewer.position }</option>
							<c:forEach items="${positions }" var="position">
								<c:if test="${position.content != interviewer.position}">
									<option value="${position.content }">${position.content }</option>
								</c:if>
							</c:forEach>
						</select>
					</div>
					<div class="input-group listSeaForm mt10 wb100">
						<span class="input-group-btn"> <span class="btn">入职时间：</span>
						</span> <input class="form-control" type="date"
							value="${interviewer.timeStr }" name="time" required="required"
							placeholder="请填写入职时间">
					</div>
				</div>
				<div class="pd20">
					<input type="submit" class="btn btn-primary wb100" value="编辑">
				</div>
			</div>
			<div class="bombMask"></div>
		</div>
	</form>
</body>

</html>