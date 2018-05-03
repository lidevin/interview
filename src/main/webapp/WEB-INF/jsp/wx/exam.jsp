<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="lwy" uri="http://lwy.cn/common/" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台</title>
<link rel="stylesheet" href="/res/css/bootstrap.min.css">
<link rel="stylesheet" href="/res/css/user.css">
<script type="text/javascript" src="/res/js/jquery.min.js"></script>
<script type="text/javascript" src="/res/js/ats-func.js"></script>

<link rel="stylesheet" href="/res/css/bootstrap.min.css">
<link rel="stylesheet" href="/res/css/user.css">
<script type="text/javascript" src="/res/js/jquery.min.js"></script>
<style type="text/css">
	.select-ul{
		width:100px;height: auto;
		position: absolute;
		left: -16px;top:58px;
		z-index: 1111;
		background: #fff;
		color: #ccc;
		border:1px solid #ccc;
		border-bottom: 0;
		/*border-top: 0;*/
		display: none;
		box-sizing: border-box;
		box-shadow: 0px 0px 8px #ccc;
	}
	.select-li{
		width: 98px!important;height: 30px;
		line-height: 30px;
		border-bottom:1px solid #ccc;
		/*background: #1bb0db;*/
		cursor: pointer;
		box-sizing: border-box;
	}
	.select-a{
		display: block;
		width: 100%;height: 100%;
		text-align: center;
		line-height: 30px;
		font-size: 14px;
		color: #666;
	}
	.select-a:hover{
		background:#1bb0db;
		color: #fff;
		/*border: 1px solid #1bb0db;*/
	}
</style>
</head>
<body>

<nav>
	<div class="container" style="width: 1100px;">
		<ol class="leftlm">
			<li style="margin:18px 0px 0px -43px; ">
				<a href=" " title="后台主页">
					<img src="/res/img/home.png" style=" width:20px; height:20px;  ">
				</a>
			</li>
			<li class="text-center navtext">
				<a href=" ">
					<span style="vertical-align: middle; font-size: 16px; padding:0px 5px;">
						admin					</span>
				</a>
			</li>
		</ol>
		<ol class="rightlm">
			<li class="text-right" style="width:150px; ">
								
							
				<!-- <a href="/user/control" target="_blank" title="系统设置">
					<img src="/res/img/setting.png" style="width:20px; height:20px; margin-top:18px; margin-left:20px;">
				</a> -->
								<a href=" " title="退出系统" onclick="return confirm(&#39;您真的要退出系统吗？&#39;);">
					<img src="/res/img/quit.png" style="width:20px; height:20px; margin-top:18px; margin-left:20px;">
				</a>
			</li>
			<li class="text-center navtext">
				<!-- <a href="#" onclick="openWin('/user/qbank', 1100, 600, 1);"> -->
				<a href="./题库管理.html">
					<span style="vertical-align: middle; font-size: 16px;">题库管理</span>
				</a>
			</li>
			<li class="text-center navtext">
				<a href="./exam.jsp">
					<span style="vertical-align: middle; font-size: 16px;">已有考试</span>
				</a>
			</li>
			<li class="text-center navtext">
				<a href="./新建考试.html" onclick=" ">
					<span style="vertical-align: middle; font-size: 16px;">新建考试</span>
				</a>
			</li>
		</ol>
	</div>
</nav>
<script type="text/javascript">
	$(".select-menu").hover(function(){
		$(".select-ul").show();
	},function(){
		$(".select-ul").hide();
	});
</script>




	<div class="lastdiv"></div>

	<div class="main">

		<div class="tips">
			<b>当前位置</b>：已有考试 -&gt; 项目列表
			
		</div>

		<div class="tablearea">

		<table width="100%" border="0" cellspacing="3" cellpadding="3">
			<tbody><tr bgcolor="#dddddd" style="font-weight:bold;">
				<td nowrap="">编号</td>
				<td nowrap="" rowspan="2">试卷名</td>
				<td nowrap="">总人数</td>
				<td nowrap="">总分数</td>
				<td nowrap="">考试中</td>
				<td nowrap="">已完成</td>
				<td nowrap="" style="text-align:center;">操作</td>
			</tr>
			</tbody><tbody class="tbodyarea">
							<tr>
					<td>1</td>
					<td nowrap="">测试										</td>
					<td nowrap="true">2018-04-24 08:57</td>
					<td nowrap="">2</td>
					<td nowrap="">0</td>
					<td nowrap="">1</td>
					<td nowrap="">1</td>
					<td nowrap="" style="text-align:center;">
						
						[ <a href="./成绩.html">成绩</a> ]
                        					</td>
				</tr>
						</tbody>
		</table>

		</div>
		<div style="margin:10px 2px;">
			<div style="float:left; color:#999;">共 1 个考试项目，当前 1 / 1 页
			</div>
						<div style="float:right; color:#999;">
				上一页　				<select id="page" style="color: black;">
										<option selected="" value="1">&nbsp;第 1 页</option>
									</select>
				　下一页			</div>
					</div>

	</div>
<br><br>

<script>
	//onclick事件
	$("#btn_sub").click(function(){
		openWin('/user/proj/crea_step_1', 1000, 610, 1);
	});
</script>

<script>
	//改变页码
	$("#page").change(function(){
		var page = $('#page').val();
		location.href="/user/proj/gets/" + page;
	});
</script>
</body></html>