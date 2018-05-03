<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title></title>
    <script src="/res/js/mui.min.js"></script>
    <link href="/res/css/mui.min.css" rel="stylesheet"/>
    <script type="text/javascript" charset="utf-8">
      	mui.init();
    </script>
    <style type="text/css">
    	#floater {
    float: left;
    height:10%;
    margin-bottom: -120px;
}

#content {
    clear: both;
    position: relative;
    height: auto;
}
#content {
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    margin: auto;
    height: 10%;
    width: 80%;
}

#title{
    position: relative;
    height: auto;	
}
    </style>
</head>
<body>
<form action="/wx/candicade/success" method="exam">
<div id="floater">  
    <select id="content" name="pid">
  <option value="">请选择试卷</option>
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="opel">Opel</option>
  <option value="audi">Audi</option>
</select>
<div>
	<input type="submit" value="提交" style="position: absolute;top:60%;left: 40%;"/>
</div>
</div>
</form>
</body>
</html>