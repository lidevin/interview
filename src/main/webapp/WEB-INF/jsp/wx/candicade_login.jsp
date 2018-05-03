<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- saved from url=(0031)https://www.weicewang.com/login -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">


<title>面试者登录</title>
<link href="/res/css/mobile.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/res/js/jquery.min.js"></script>
</head>
<body>
<div class="proj_name" style="font-size:18px; line-height: 1.6em; ">面试者登录</div>
<!-- include header -->

<div style="margin: 20px auto 15px auto; width: 95%; max-width: 500px; ">
	<div class="test_name" style="color: #999;">
		提示：请输入面试者账号和密码	</div>
</div>	

<div class="ques_info" style="margin: 15px auto 15px auto; width: 95%; max-width: 500px; ">
	<form method="post" name="form1" id="form1" action="/wx/candicade_login.do">
	<input type="hidden" name="projid" value="">
	<input type="hidden" name="p_loginmode" value="0">
	<table width="95%" border="0" cellspacing="5" cellpadding="5" align="center" style="margin-top:10px;">
	<tbody><tr>
		<td  style="width:82px;font-weight:bold;">登录账号：</td>
		<td><input type="text" id="candid" name="candid" maxlength="17" value="" style="width:90%;" placeholder="10位账号"></td>
	</tr>
	<tr>
		<td  style="width:82px;font-weight:bold;">登录密码：</td>
		<td><input type="password" id="testcode" name="testcode" maxlength="6" value="" style="width:90%;" placeholder="6位密码"></td>
	</tr>
	</tbody></table>
	</form>
</div>
 
<div class="btn_area" style="margin: 20px auto 0px auto; width: 95%; max-width: 500px; ">
	<div class="btn" id="btn_sub" style="width:100%; ">面试者登录</div><div class="col-xs-12 cjwt" style="color:#999;">
			[ <a href="./boss_login.jsp"><span>面试官登录</span></a> ] &nbsp;
			[ <a href=" "><span>忘记密码</span></a> ] &nbsp; 
			[ <a target="_blank" href="./register.html"><span>注册</span></a> ] 
		</div>

</div>





<script>
	$("#btn_sub").click(function(){	
		if($('#candid').val().length != 10){
			alert('[ 登录账号 ] 输入有误，请重新输入！');
			return false;
		}
		if($('#testcode').val().length != 6){
			alert('[ 登录密码 ] 输入有误，请重新输入！');
			return false;
		}
		$('#form1').submit()
	});
	//自动填空
	$('#candid').blur(function(){//如果失到焦点
		var thevalue = document.form1.candid.value;  
		var t1 = '';
		var t2 = ''; 
		thevalue = thevalue.replace(/(^\s*)|(\s*$)/g, ""); //删除两端空格

		//如果长度为 17，并且有减号符号
		if((thevalue.length == 17) && (thevalue.indexOf("-") == 10)){
			t1 = thevalue.substring(0,10);
			t2 = thevalue.substring(11,17);
			$('#candid').val(t1);
			$('#testcode').val(t2);
		}
	});
</script>
</body></html>