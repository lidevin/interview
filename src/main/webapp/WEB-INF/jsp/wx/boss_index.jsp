<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="/res/css/bootstrap.min.css">
<link rel="stylesheet" href="/res/css/user.css">
<script type="text/javascript" src="/res/js/jquery.min.js"></script>
<script type="text/javascript" src="/res/js/ats-func.js"></script>
<link rel="stylesheet" href="/res/css/bootstrap.min.css">
<link rel="stylesheet" href="/res/css/user.css">
<link rel="stylesheet" href="/res/css/iconfont.css">
<script src="/res/js/echarts.min.js"></script>
<title>后台</title>
<title>后台</title>
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
				<a href="exam.jsp"  >
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





<style>
	.main-box0{
		width:100%;height: 406px;
		padding-bottom: 30px;
	}
	.main-top0{
		width:100%;height: 45px;
		border-bottom: 1px solid #eee;
	}
	.main-top-list0{
		height: 45px;
		line-height: 45px;
		font-size: 14px;
		color:#666;
		padding:0 10px;
		float: left;
		margin-right: 15px;
		cursor: pointer;
	}
	.main-hover0{
		color:#55aed7;
		border-bottom: 2px solid #55aed7;
	}
	.main-content0{
		width: 100%;height: auto;
		overflow: hidden;
	}
	.main-list-box0{
		width: 100%;height: auto;
		overflow: hidden;
	}
	.main-list0{
		width: 100%;height: 56px;
		border-bottom: 1px solid #eee;
		line-height: 56px;
		font-size: 14px;
		color: #888;
		padding:0 30px 0 20px;
		box-sizing: border-box;
	}
	.main-list0:hover{
		color: #55aed7;
		cursor:pointer;
	}
	.main-list-left-icon{
		width:30px;
		height: 56px;
		line-height: 56px;
		float: left;
	}
	.main-list-left0{
		width: 600px;height: 56px;
		float: left;
		white-space: nowrap;
		overflow: hidden;
		text-overflow: ellipsis;
	}
	.main-list-right0{
		color:#666;
		float: right;
		text-align: right;
	}
	.main-draw{
		margin-top: 30px;
	}
	.main-top-list0:hover{
		color: #55aed7;
	}
	.main-lead{
		width: 100%;height: 90px;
		background: #f6f6f6;
		border-radius: 4px;
		box-sizing: border-box;
		margin:32px auto 0;
	}
	.main-lead-left{
		width:128px;
		height: 90px;
		line-height: 90px;
		text-align: center;
		font-style: 16px;
		float: left;
		background: #f0f0f0;
		font-weight: bold;
	}
	.main-lead-list{
		display:block;
		width:165px;height: 90px;
		float: left;
		border-left: 1px solid #ededed;
		box-sizing: border-box;
		overflow: hidden;
		color:#666;
	}
	.main-lead-list:hover{
		color:#55aed7;
		cursor: pointer;
	}
	.main-lead-img{
		display: block;
		width:30px;height: 30px;
		margin:30px 15px 0 15px;
		float: left;
	}
	.main-icon{
		width:60px;height: 90px;
		float: left;
		text-align: center;
	}
	.main-lead-box{
		width:104px;height: 90px;
		float: right;
	}
	.main-lead-title{
		font-size: 12px;
		line-height: 90px;
	}
	.main-lead-p{
		font-size: 12px;
		color: #666;
		line-height: 20px;
	}

	/* 
	  URL为项目内调用字体的路径 
	*/  
	@font-face {font-family: "iconfont";  
	  src: url('iconfont.eot?t=1491967237541'); /* IE9*/  
	  src: url('iconfont.eot?t=1491967237541#iefix') format('embedded-opentype'), /* IE6-IE8 */  
	  url('/css/font/iconfont.woff?t=1491967237541') format('woff'),  /* chrome, firefox */  
	  url('/css/font/iconfont.ttf?t=1491967237541') format('truetype'), /* chrome, firefox, opera, Safari, Android, iOS 4.2+*/  
	  url('iconfont.svg?t=1491967237541#iconfont') format('svg'); /* iOS 4.1- */  
	}  
	  
	.iconfont {  
	  font-family:"iconfont" !important;  
	  font-size:23px;  
	  font-style:normal;  
	  -webkit-font-smoothing: antialiased;  
	  -moz-osx-font-smoothing: grayscale;  
	  line-height: 90px;
	}  

	.icon-wxbsousuotuiguang:before { content: "\e620"; } 

</style>


	<div class="lastdiv"></div>

	<div class="main">

		<div style="height:30px;">
		</div>

		<!-- 蓝色 #1bb0db 橙色 #FE9A11 绿色 #5ecc22 -->

		<div class="tablearea" style="width:260px;/* height:500px; */float:left; border:0px;">
			<div style="margin-top:0px; padding-left: 0px; ">
				<b>提示</b>：您现在有 <a href=" ">1</a> 个考试项目
				
			</div>
		</div>

		<div class="tablearea" style="width:800px; /*height:500px;*/float:right; border:0px; padding:5px;">
		
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tbody><tr bgcolor="#fff" style=" height: 72px; color:#fff;"> 
					<td width="24.75%" id="cont_proj" class="color_orgnge" style="text-align:center; background-color: rgb(255, 155, 18); ">
						<span style="font-size:24px;">1</span> <br>个项目
					</td>
					<td width="24.75%" id="cont_cand" class="color_orgnge" style="text-align:center; background-color: rgb(255, 155, 18); ">
						<span style="font-size:24px;">1</span> <br>名考生
					</td>
					<td width="1%" style="text-align:center; background-color: #fff; ">
					</td>
					<td width="24.75%" id="cont_test" class="color_green" style="text-align:center;background-color: rgb(95, 205, 35);">
						<span style="font-size:24px;">0</span> <br>个科目
					</td>
					<td width="24.75%" id="cont_ques" class="color_green" style="text-align:center;background-color: rgb(95, 205, 35);">
						<span style="font-size:24px;">0</span> <br>道试题
					</td>
				</tr>
			</tbody></table>
			<br>
			<div class="main-box0">
				<div class="main-top0">
					<div class="main-top-list0 main-hover0">数据统计</div>
					
				</div>
				<div class="main-content0">
					<div class="main-list-box0">
						<div class="main-draw">
							<div id="day" style="height: 360px; width: 370px; float: left; -webkit-tap-highlight-color: transparent; user-select: none; position: relative; background: transparent;" _echarts_instance_="ec_1524531970797"><div style="position: relative; overflow: hidden; width: 370px; height: 360px; padding: 0px; margin: 0px; border-width: 0px; cursor: default;"><canvas width="370" height="360" data-zr-dom-id="zr_0" style="position: absolute; left: 0px; top: 0px; width: 370px; height: 360px; user-select: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); padding: 0px; margin: 0px; border-width: 0px;"></canvas></div><div style="position: absolute; display: block; border-style: solid; white-space: nowrap; z-index: 9999999; transition: left 0.4s cubic-bezier(0.23, 1, 0.32, 1), top 0.4s cubic-bezier(0.23, 1, 0.32, 1); background-color: rgba(50, 50, 50, 0.701961); border-width: 0px; border-color: rgb(51, 51, 51); border-radius: 4px; color: rgb(255, 255, 255); font-style: normal; font-variant: normal; font-weight: normal; font-stretch: normal; font-size: 14px; font-family: &quot;Microsoft YaHei&quot;; line-height: 21px; padding: 5px; left: 91px; top: 127px;">2018-4-24 03<br>考量：0</div></div>
							<div id="month" style="height: 360px; width: 370px; float: right; -webkit-tap-highlight-color: transparent; user-select: none; position: relative; background: transparent;" _echarts_instance_="ec_1524531970798"><div style="position: relative; overflow: hidden; width: 370px; height: 360px; padding: 0px; margin: 0px; border-width: 0px;"><canvas width="370" height="360" data-zr-dom-id="zr_0" style="position: absolute; left: 0px; top: 0px; width: 370px; height: 360px; user-select: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); padding: 0px; margin: 0px; border-width: 0px;"></canvas></div><div></div></div>
						</div>
					</div>
					<div class="main-list-box0" style="display: none;">
						<div class="main-lead">
							<div class="main-lead-left">新手入门</div>
							<a href="http://v.youku.com/v_show/id_XMzM3NDY3MDM5Mg==.html" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-shipin"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">快速视频入门</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100105" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-daoru1"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">试题导入说明</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100106" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-shuxingB"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">项目属性介绍</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100107" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-zhifu"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">微测支付介绍</div>
								</div>
							</a>
						</div>
						<div class="main-lead">
							<div class="main-lead-left">常见问题</div>
							<a href="https://www.weicewang.com/home/article/100108" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-jiaojuan"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">交卷显示分值</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100109" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-iconfont-iconmaineditkaobei"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">题库组卷规则</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100110" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-jiankong"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">视频监控考试</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100111" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-daochu1"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">导出作答明细</div>
								</div>
							</a>
						</div>
						<div class="main-lead">
							<div class="main-lead-left">典型案例</div>
							<a href="https://www.weicewang.com/home/article/100112" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i style="font-size:28px;" class="iconfont icon-xiaoyuan"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">校园招聘考试</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100113" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-cop"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">企业培训考核</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100114" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-jingsaiguanli"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">在线知识竞赛</div>
								</div>
							</a>
							<a href="https://www.weicewang.com/home/article/100115" target="_blank" class="main-lead-list">
								<div class="main-icon">
									<i class="iconfont icon-peixun"></i> 
								</div>
								<div class="main-lead-box">
									<div class="main-lead-title">在线编程考试</div>
								</div>
							</a>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>





<script>

	//新建项目
    $("#btn_proj").click(function(){
		openWin('/user/proj/crea_step_1', 1000, 610, 1);
	});

	//在线帮助
	$(".help").click(function(){			 	
		var showflg = $('#showhelp').css("display");
		if(showflg == 'none'){
			$("#showhelp").show(0);
			return false;
		}
		if(showflg != 'none'){
			$("#showhelp").hide(0);
			return false;
		}		 
	});

</script>
<script type="text/javascript">
	var date = new Date();
	var month = date.getMonth()+1;
	var year = date.getUTCFullYear();
	function getLastDay(year,month)   
	{   
	 var new_year = year;  //取当前的年份   
	 var new_month = month++;//取下一个月的第一天，方便计算（最后一天不固定）   
	 if(month>12)      //如果当前大于12月，则年份转到下一年   
	 {   
	 new_month -=12;    //月份减   
	 new_year++;      //年份增   
	 }   
	 var new_date = new Date(new_year,new_month,1);        //取当年当月中的第一天   
	 return (new Date(new_date.getTime()-1000*60*60*24)).getDate();//获取当月最后一天日期   
	} 

	var len = getLastDay(year,month);
	var arr= [];
	for(var i = 0;i<len;i++){
		arr.push(i+1);
	}
//图表1
	var myChart = echarts.init(document.getElementById('day'));
	var colors = ['#5793f3'];
	var option = {
		title:{
			text:'当日实际考量：1 人',
			textStyle:{
	        //字体大小
	　　　　 fontSize:14
	    }
	},
	    color: colors,
	    tooltip: {
	        trigger: 'axis',
	        axisPointer: {
	            type: 'cross'
	        },
	        animation:false,
            formatter: function (params) {
                return [date.getFullYear(),date.getMonth()+1,date.getDate()].join('-') + ' ' + params[0].axisValue + '<br />考量：' + params[0].value;
            }
	    },
	    toolbox:{
			show:true,
			feature:{
				magicType:{type:['line','bar']},
				saveAsImage:{}
			}
		},
	    grid: {
	        top: 60,
	        bottom: 50,
	    },
	    xAxis:  {
           	type: 'category',
            name: '小时',
            data: ['00','01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20','21','21','22','23'],
           	boundaryGap: false,
			axisLabel: {
			    interval: 1
			},
			axisLine: {
                onZero: false
            },
			axisPointer:{
				label:{
					backgroundColor: '#c7c5c5',
	                borderColor: '#aaa',
					formatter:function(params){
						return [date.getFullYear(),date.getMonth()+1,date.getDate()].join('-') + ' ' + params.value;
					}
				}
			}
       	},
       	yAxis: {
           	type: 'value',
           	name: '考量',
           	axisLabel: {
            	formatter: '{value}'
           	},
           	axisPointer: {
				snap: true,
				label:{
					backgroundColor: '#c7c5c5',
	                borderColor: '#aaa',
					formatter:function(params){
						return parseInt(params.value)+'人';
					}
				}
           	},
       	},
	   	series: [
            {
               name:'考量',
               type:'line',
               smooth: true,
               data: [0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
            }
        ]
	};
	myChart.setOption(option);
	//图表2
	var myChart = echarts.init(document.getElementById('month'));
	var colors = ['#5793f3', '#d14a61', '#675bba'];
	var option = {
		title:{
			text:'当月实际考量：1 人',
			textStyle:{
	        //字体大小
	　　　　 fontSize:14
	    	}
		},
	    color: colors,
	    tooltip: {
	        trigger: 'axis',
	        axisPointer: {
	            type: 'cross'
	        },
	        animation:false,
            formatter: function (params) {
                return [date.getFullYear(),date.getMonth()+1,params[0].axisValue].join('-') + '<br />考量：' + params[0].value;
            }
	    },
	    toolbox:{
			show:true,
			feature:{
				magicType:{type:['line','bar']},
				saveAsImage:{}
			}
		},
	    grid: {
	        top: 60,
	        bottom: 50,
	    },
	    xAxis:  {
           	type: 'category',
            name:'日期',
            data: arr,
           	boundaryGap: false,
			axisLabel: {
			    interval: 2
			},
			axisLine: {
                onZero: false
            },
			axisPointer:{
				label:{
					backgroundColor: '#c7c5c5',
	                borderColor: '#aaa',
					formatter:function(params){
						return [date.getFullYear(),date.getMonth()+1,params.value].join('-');
					}
				}
			}
       },
       yAxis: {
           	type: 'value',
           	name: '考量',
           	axisLabel: {
            	formatter: '{value} '
           	},
           	axisPointer: {
				snap: true,
				label:{
					backgroundColor: '#c7c5c5',
	                borderColor: '#aaa',
					formatter:function(params){
						return parseInt(params.value)+'人';
					}
				}
           	}
       },
	   series: [
	           {
	               name:'考量',
	               type:'line',
	               smooth: true,
	               data: [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0]
	           }
	       ]
	};
	myChart.setOption(option);



	// 类型切换
	$(".main-top-list0").on("click",function(){
		var index0 = $(this).index();
		$(this).addClass("main-hover0").siblings(".main-top-list0").removeClass("main-hover0");
		$(".main-list-box0").eq(index0).show().siblings(".main-list-box0").hide();
	});
</script></body></html>