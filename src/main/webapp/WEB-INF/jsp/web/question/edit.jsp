<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<title>编辑题目</title>

		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<!-- VENDOR CSS -->
		<link rel="stylesheet" href="/res/css/bootstrap.min.css">
		<link rel="stylesheet" href="/res/css/font-awesome.min.css">
		
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
		<style type="text/css">
			intput{
				autoComplete:off;
			}
		</style>
		<script>
			$(function(){
				var answer = "${question.answer}";
				var qsttype = "${question.qsttype}";
				var kid = "${question.kid}";
				$("#a1"+answer[0]).attr("checked", "checked");//填写
				$("#a3"+answer[0]).attr("checked", "checked");
				for(t in answer){
					$("#a2" + answer[t]).attr("checked", "checked");
				}
				$("#choice_ul li:nth-child(" + qsttype +")").removeClass("hidden");
				
				$("input").focus(function(){
					$(this).css("border-color","#00A0F0");
				});
				$("input").blur(function(){
					$(this).css("border-color","#CCC");
				});
				
				$("#choice_select").change(function(){
					$("#choice_ul li").addClass("hidden");
					$("#choice_ul li:nth-child(" + $(this).val() +")").removeClass("hidden");
				});
				/* 异步加载类型*/
				$.get("/web/kind", function(data){
					$.each(data, function (index, item) {
						  var id = data[index].id;
						  if(id != kid){
							  $("#kid").append("<option value='" + id + "'>" + data[index].kind + "</option>");
						  }
		              }); 
				}, "JSON");
				/*表单提交验证*/
				$("form").submit(function(){
					return true;
					if(!check($("#tags"))){
						return false;
					}
					var i = $("#choice_select").val();
					if(i == 1){
						if(!check($("#c11")) || !check($("#c12")) || !check($("#c13")) || !check($("#c14"))){
							return false;
						}
					}else if(i == 2){
						if(!check($("#c21")) || !check($("#c22")) || !check($("#c23")) || !check($("#c24"))){
							return false;
						}
					}else if(i == 3){
						if(!check($("#c31")) || !check($("#c32"))){
							return false;
						}
					}else if(i == 4){
						if(!check($("#c41"))) return false;
					}
					return true;
				});
				//验证非空
				function check(elem){
					if(elem.val().trim() == ""){
						elem.focus();
						return false;
					}
					return true;
				}
			});
		</script>
	</head>
	<body>
		<c:choose>
			<c:when test="${1 == edit}">
				<script type="text/javascript">
					alert("编辑成功！\n1秒后返回！");
					setTimeout('window.location="/web/question"',500);
					/* setTimeout('window.location="/web/question"',1000); */
				</script>
			</c:when>
			<c:when test="${0 == edit}">
				<script type="text/javascript">
					if(!confirm("编辑失败！是否重新编辑？")){
						window.location.href='/web/question/edit?id=${question.id}';
					}
				</script>
			</c:when>
		</c:choose>
		<!--添加弹框 start-->
		<div class="bombBox" id="addDoctorBomb">
			<div class="bombContent whiteBg addDoctorBomb" style="min-width: 400px;">
				<div class="bombTit">编辑题目信息	<a class="fa fa-remove" href="/web/question" target="main"></a></div>
				<form action="/web/question/edit.do" autoComplete="off" method="get">
					<input type="hidden" name="id" value="${question.id }"> 
					<div class="pd20">
						<div class="input-group listSeaForm mt10 wb100">
							<span class="input-group-btn">
						<span class="btn">标题：</span>
							</span>
							<input class="form-control" type="text" readonly="readonly" name="title" value="${question.title }" placeholder="请填写标题">
						</div>
						<div class="input-group listSeaForm mt10 wb100">
							<span class="input-group-btn">
								<span class="btn">题型：</span>
							</span>
							<select class="form-control" id="choice_select" name="qsttype">
								<c:choose>
									<c:when test="${1 == question.qsttype}">
										<option value="1">单选</option>
										<option value="2">多选</option>
										<option value="3">判断</option>
										<option value="4">主观</option>
									</c:when>
									<c:when test="${2 == question.qsttype}">
										<option value="2">多选</option>
										<option value="1">单选</option>
										<option value="3">判断</option>
										<option value="4">主观</option>
									</c:when>
										<c:when test="${3 == question.qsttype}">
										<option value="3">判断</option>
										<option value="1">单选</option>
										<option value="2">多选</option>
										<option value="4">主观</option>
									</c:when>
										<c:when test="${4 == question.qsttype}">
										<option value="4">主观</option>
										<option value="1">单选</option>
										<option value="2">多选</option>
										<option value="3">判断</option>
									</c:when>
								</c:choose>
								
							</select>
						</div>
						<div class="input-group listSeaForm mt10 wb100">
							<span class="input-group-btn">
								<span class="btn">选项：(在左边设定答案)</span>
							</span>
						</div>
						<ul id="choice_ul">
							<li class="hidden">
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="radio" id="a1A" name="answers1" value="A"/>
									A 、 </span>
									</span>
									<input class="form-control" id="c11" type="text" value="${question.choices[0].content }" name="choices1" placeholder="请编辑选项">
								</div>
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="radio" id="a1B" name="answers1" value="B"/>
									B 、 </span>
									</span>
									<input class="form-control" id="c12" type="text" value="${question.choices[1].content }" name="choices1" placeholder="请编辑选项">
								</div>
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="radio" id="a1C" name="answers1" value="C"/>
									C 、 </span>
									</span>
									<input class="form-control" id="c13" type="text" value="${question.choices[2].content }" name="choices1" placeholder="请编辑选项">
								</div>
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="radio" id="a1D" name="answers1" value="D"/>
									D 、 </span>
									</span>
									<input class="form-control" id="c14" type="text" value="${question.choices[3].content }" name="choices1" placeholder="请编辑选项">
								</div>
							</li>
							<li class="hidden">
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="checkbox" id="a2A" name="answers2" value="A"/>
									A 、 </span>
									</span>
									<input class="form-control" id="c21" type="text" value="${question.choices[0].content }" name="choices2" placeholder="请编辑选项">
								</div>
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="checkbox" id="a2B" name="answers2" value="B"/>
									B 、 </span>
									</span>
									<input class="form-control" id="c22" type="text" value="${question.choices[1].content }" name="choices2" placeholder="请编辑选项">
								</div>
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="checkbox" id="a2C" name="answers2" value="C"/>
									C 、 </span>
									</span>
									<input class="form-control" id="c23" type="text" value="${question.choices[2].content }" name="choices2" placeholder="请编辑选项">
								</div>
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="checkbox" id="a2D" name="answers2" value="D"/>
									D 、 </span>
									</span>
									<input class="form-control" id="c24" type="text" value="${question.choices[3].content }" name="choices2" placeholder="请编辑选项">
								</div>
							</li>
							<li class="hidden">
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="radio" id="a3A" name="answers3" value="A"/>
									A 、 </span>
									</span>
									<input class="form-control" id="c31" type="text" value="${question.choices[0].content }" name="choices3" placeholder="请编辑选项">
								</div>
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
								<span class="btn">
									<input type="radio" id="a3B" name="answers3" value="B"/>
									B 、 </span>
									</span>
									<input class="form-control" id="c32" type="text" value="${question.choices[1].content }" name="choices3" placeholder="请编辑选项">
								</div>
							</li>
							<li class="hidden">
								<div class="input-group listSeaForm mt10 wb100">
									<span class="input-group-btn">
									</span>
									<input class="form-control" id="c41" type="text" value="${question.answer}" name="answers4" placeholder="请编辑答案">
								</div>
							</li>
						</ul>
						<div class="input-group listSeaForm mt10 wb100">
							<span class="input-group-btn">
						<span class="btn">难度等级：</span>
							</span>
							<select class="form-control" name="difficult">
								<c:choose>
									<c:when test="${1 == question.difficult}">
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
									</c:when>
									<c:when test="${2 == question.difficult}">
										<option value="2">2</option>
										<option value="1">1</option>
										<option value="3">3</option>
										<option value="4">4</option>
										<option value="5">5</option>
									</c:when>
									<c:when test="${3 == question.difficult}">
										<option value="3">3</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="4">4</option>
										<option value="5">5</option>
									</c:when>
									<c:when test="${4 == question.difficult}">
										<option value="4">4</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="5">5</option>
									</c:when>
									<c:when test="${5 == question.difficult}">
										<option value="5">5</option>
										<option value="1">1</option>
										<option value="2">2</option>
										<option value="3">3</option>
										<option value="4">4</option>
									</c:when>
								</c:choose>
							</select>
						</div>
						<div class="input-group listSeaForm mt10 wb100">
							<span class="input-group-btn">
						<span class="btn">类别：</span>
							</span>
							<!--从数据库查数据-->
							<select class="form-control" id="kid" name="kid">
								<option value="${question.kid}">${question.kind}</option>
							</select>
						</div>
						<div class="input-group listSeaForm mt10 wb100">
							<span class="input-group-btn">
						<span class="btn">标签：</span>
							</span>
							<input class="form-control" id="tags" type="text" name="tags" value="${question.tags}" placeholder="编辑标签,多个用空格隔开">	
						</div>
					</div>
					<div class="pd20">
						<input type="submit" class="btn btn-primary wb100" value="编辑">
					</div>
				</form>
			</div>
			<div class="bombMask"></div>
		</div>

	</body>

</html>