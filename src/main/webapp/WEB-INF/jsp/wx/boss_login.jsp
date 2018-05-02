<!DOCTYPE html>
<!-- saved from url=(0038)https://weicewang.com/user/login/index -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
<title>面试官登录</title>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/login.css">
<script charset="utf-8" src="./js/v.js"></script><script src="./js/hm.js"></script><script type="text/javascript" src="./js/jquery.min.js"></script>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?0538f9972c403d3b64610b7788402696";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
</head>
<body>

<div id="box">
	<div class="loginbox">
		<div class="col-xs-12 topbiaoti" style="padding-bottom:10px;text-align:center; ">面试官登录</div>
		<form action="/wx/boss_login.do" name="form1" id="form1" method="post">
			<div class="col-xs-12">
				<div class="input-group dlsrbox">
					<span class="input-group-addon" style="padding: 0px 12px;"> 
						<img src="./img/log-zh.png" style="width:18px;height:18px;">
					</span> 
					<input type="text" name="logname" class="form-control" placeholder="请输入账号" maxlength="20">
				</div>
			</div>
			<div class="col-xs-12">
				<div class="input-group dlsrbox">
					<span class="input-group-addon" style="padding: 0px 12px;"> 
						<img src="./img/log-key.png" style="width:18px;height:18px;">
					</span> 
					<input type="password" name="logpw" class="form-control" placeholder="请输入密码" maxlength="20">
				</div>
			</div>
			<div class="col-xs-12 dengluanniu " style="margin-top: 30px;">
				<button class="btn btn-jkl col-xs-12" style="line-height: 30px;" id="btn_sub">面试官登录</button>
			</div>
		</form>
		<div class="col-xs-12 cjwt" style="color:#999;">
			[ <a href="./candicade_login.jsp"><span>面试者登录</span></a> ] &nbsp;
			[ <a href=" "><span>忘记密码</span></a> ] &nbsp; 
			
		</div>
	</div>
	<div class="copyright text-center" style="margin:20px auto;">Copyright © 2012-2017 &nbsp; All Rights Reserved</div>
</div>




<script>
	//点击提交
	$("#btn_sub").click(function(){	
		if(document.form1.logname.value.length > 2 || document.form1.logpw.value.length > 5 ){
			document.form1.submit();
		}else{
			alert('账号或密码有误，请重新输入！');
			return false;
		}
	});

	//回车事件
	$(document).keydown(function (event) {
		if (event.keyCode == 13) {			//捕获回车事件
			$("#btn_sub").trigger("click");	//模拟点击登录
		}
    });
</script></body></html>