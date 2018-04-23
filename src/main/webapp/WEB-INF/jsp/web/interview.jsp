<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
    <title>面试官列表</title>
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <!-- VENDOR CSS -->
    <link rel="stylesheet" href="/res/css/bootstrap.min.css">
    <link rel="stylesheet" href="/res/css/font-awesome.min.css">
    <link rel="stylesheet" href="/res/css/style.css">
    <link rel="stylesheet" href="/res/css/chartist-custom.css">
    <!-- MAIN CSS -->
    <link rel="stylesheet" href="/res/css/main.css">

    <link rel="stylesheet" href="/res/css/demo.css">
  
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
    <script src="/res/js/layer.js"></script><link rel="stylesheet" href="/res/css/layer.css" id="layuicss-layer">
 


</head>
<body>



<div class="main">
    <!-- MAIN CONTENT -->
    <div class="main-content">
        <div class="container-fluid">
            <div class="">
                <ul class="tabBtn clearfix" style="width: 50%; margin: auto;">
                    <li class="on">面试官列表</li>
                
                </ul>
                <ul class="tabBox panel mt10">
                    <li class="on">
                        <div class="pd10 grayBg2">
                            <div class="fublBox mr10"><span>姓名：</span>
                                <input type="text" id="search-true-name" class="form-control form-itmeB" placeholder="">
                            </div>
                            <button type="button" class="btn btn-primary" id="search-doctor">查询</button>
                            <a href="/web/interview/add"><button type="button" class="btn btn-primary r doctorAddBtn" >添加面试官</button></a>
                            
                        </div>
                        <div class="pd10">
                            <table class="table drugsTable ftc" id="userList">
                                <thead>
                                <tr>
                                    <th>编号</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>年龄</th>
                                    <th>电话</th>
                                    <th>部门</th>
                                    <th>职位</th>
                                    <th>入职时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody><tr><td>3</td><td>面试官1</td><td>女</td><td>22</td><td>13578534321</td><td>面试1</td><td>面试官1</td><td>2018-04-14 14:32:10</td><td><a  href="/web/interview/edit"><button type="button" uid="3" class="btn btn-success btn-sm doctorEditBtn">编辑</button></a> <button type="button" uid="3" class="btn btn-default btn-sm deleteBtn">删除</button></td></tr></tbody>
                            </table>
                        </div>
                        <div class="paging mt20 mb20 ftc" id="userListPage">  </div>
                    </li>
                    
                </ul>
            </div>
        </div>
    </div>
    <!-- END MAIN CONTENT -->
</div>



</body></html>