<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport"
          content="initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=0,width=device-width"/>
    <meta name="format-detection" content="telephone=no"/>
    <meta name="format-detection" content="email=no"/>
    <meta name="format-detection" content="address=no;">
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta name="apple-mobile-web-app-status-bar-style" content="default"/>
    <script type="text/javascript" charset="utf-8">
        var timeTrak = {
            starttime : new Date().getTime(),//开始位置时间
            load_time : 0,//页面加载完位置
            cdn_time : 0,
            bp_time : "", //白屏时间
            sp_time : "", //首屏时间
            cz_time : "", //可操作时间
            pagetype : "resume",
            city : "",//城市
            net_speed : "", 
            net_type : "",//网络类型
            template_type : "mini",//模板类型
            connection : navigator.connection||navigator.mozConnection||navigator.webkitConnection||{type:'unknown'},
            gettime:function(){return (new Date().getTime());}
        };
        document.addEventListener("DOMContentLoaded",function(e){
            timeTrak.cz_time = timeTrak.gettime() - timeTrak.starttime;
        });
        window.addEventListener("load",function(){
            timeTrak.load_time = timeTrak.gettime() - timeTrak.starttime;
            timeTrak.imgLoad && timeTrak.imgLoad();
        });
    </script>
    <script>
        (function(d,e){var i=d.document;var a=i.documentElement;var j=0;var c;var f=e.flexible||(e.flexible={});var b=d.navigator.appVersion.match(/iphone/gi);var h=d.devicePixelRatio;if(b){if(h>=3&&(!j||j>=3)){j=3}else{if(h>=2&&(!j||j>=2)){j=2}else{j=1}}}else{j=1}a.setAttribute("data-dpr",j);if(i.readyState==="complete"){i.body.style.fontSize=12+"px"}else{i.addEventListener("DOMContentLoaded",function(){i.body.style.fontSize=12+"px"},false)}function g(){var l=a.getBoundingClientRect().width;var m=l/10;a.style.fontSize=m+"px";f.rem=d.rem=m}var k="onorientationchange" in window?"orientationchange":"resize";d.addEventListener(k,function(){clearTimeout(c);c=setTimeout(g,300)},false);d.addEventListener("pageshow",function(l){if(l.persisted){clearTimeout(c);c=setTimeout(g,300)}},false);g();f.dpr=d.dpr=j;f.refreshRem=g;f.rem2px=function(m){var l=parseFloat(m)*this.rem;if(typeof m==="string"&&m.match(/rem$/)){l+="px"}return l};f.px2rem=function(m){var l=parseFloat(m)/this.rem;if(typeof m==="string"&&m.match(/px$/)){l+="rem"}return l}})(window,window["lib"]||(window["lib"]={}));
    </script>
    
    <title>注册</title>
    <link rel="stylesheet" href='/res/css/mresume_v20171228181422_3.css'/>
    <link rel="stylesheet" href='/res/css/m3_v20180226154553_3.css'/>
    <script type="text/javascript" charset="utf-8">
    var validateMobileMode = "1";
    </script>
</head>
<body class="bg_bd">
<script type="text/javascript">
    timeTrak.bp_time = timeTrak.gettime() - timeTrak.starttime;
</script>
<input type="hidden" id="hidresume" name="hidresume" value="0"/>
<input type="hidden" id="hidareaidVal" name="areaidVal" value=""/>
<input type="hidden" id="secondlevelcateid" name="secondlevelcateid" value="13607"/>
<input type="hidden" id="hidareaid" name="hid" value="0"/>
<input type="hidden" id="Pic" name="Pic">
<input type="hidden" id="postfrom" name="postfrom" value="">
<input type="hidden" id="valicode" name="valicode" value="">
<div class="body_div">
        <div class="r_tle">
        请填写信息！
    </div>
        <div id="rsm_create" class="wuly_post">
        <ul class="ulwrap">
            
            <li>
                <div class="rc_th">
                    <span>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名</span>
                </div>
                <div class="rc_td">
                    <input type="text" id="txtUserName" name="name" class="inp_txt " value="">
                </div>
            </li>
            <li>
                <div class="rc_th">
                    <span>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别</span><i>*</i>
                </div>
                <div class="rc_td">
                    <div class="rc_go ">
                                            <label class="sexpan c_o">
                            <input type="radio" class="inp_rad ir_che" name="sexType" value="0" checked="checked">
                            男
                        </label>
                        <label class="sexpan">
                            <input type="radio" class="inp_rad" name="sexType" value="1">
                            女
                        </label>
                                        </div>
                </div>
            </li>

            <li>
                <div class="rc_th">
                    <span>出生年份</span>
                </div>
                <div class="rc_td">
                    <div class="rc_go">
                        <span class="fl must" message="请选择您的出生年份">请选择</span>
                        <select class="sel_txt2 sw3" id="year" message="请选择您的出生年份">
                        </select>
                        <i class="arrow"></i>
                    </div>
                </div>
            </li>

            <li id="education">
                <div class="rc_th">
                    <span>最高学历</span>
                </div>
                <div class="rc_td">
                    <div class="rc_go">
                        <span class="fl must" message="请选择最高学历">请选择</span>
                        <select class="sel_txt2 sw3" id="selEducation" message="请选择最高学历">
                            <option value='-1' disabled="disabled">请选择最高学历</option>
                            <option value='1'>高中以下</option><option value='2'>高中</option><option value='3'>中专/技校</option><option value='4'>大专</option><option value='5'>本科</option><option value='6'>硕士</option><option value='7'>博士</option><option value='8'>MBA/EMBA</option>
                        </select>
                        <i class="arrow"></i>
                    </div>
                </div>
            </li>
			<li>
                <div class="rc_th">
                    <span>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;校</span>
                </div>
                <div class="rc_td">
                    <input type="text" id="txtUserName" name="name" class="inp_txt " value="">
                </div>
            </li>
			<li>
                <div class="rc_th">
                    <span>专&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业</span>
                </div>
                <div class="rc_td">
                    <input type="text" id="txtUserName" name="name" class="inp_txt " value="">
                </div>
            </li>
            <li style="position: relative;">
                <div class="rc_th">
                    <span>工作经验</span>
                </div>
                <div class="rc_td">
                    <div class="rc_go">
                        <span class="fl must" message="请选择您的工作经验">请选择</span>
                        <select class="sel_txt2 sw3" id="selWorked" message="请选择您的工作经验">
                            <option value='-1' disabled="disabled">请选择您的工作经验</option>
                            <option value='0'>无经验</option><option value='1'>1-3年</option><option value='2'>3-5年</option><option value='3'>5-10年</option><option value='4'>10年以上</option><option value='5'>应届生</option><option value='6'>1年以下</option>
                        </select>
                        <i class="arrow"></i>
                    </div>
                </div>
            </li>
            </ul>
            
	                  <ul class="ulwrap">
	            <li class="tel">
	                <div class="rc_th">
	                    <span>手机号码</span>
	                </div>
	                <div class="rc_td">
	                    <input type="tel" maxlength="11" class="telNum" placeholder="输入手机号码"  id="phone" value="">
	                </div>
	            </li>
	            
           </ul>
	                   
           <div class="oper_btn">
                       <input class="td_btn" type="button" value="立即申请" ontouchend="clickLog('from=wjl_toudi_lianmeng');return false;">
                     </div>
    </div>
</div>



<script>  timeTrak.sp_time = timeTrak.gettime() - timeTrak.starttime; </script>
<script src="js/pcuc_3.js" type="text/javascript"></script>
<!-- js部分 start-->
<!-- for rd start-->
<!-- 1. ____json4fe页面变量定义 -->
<script type="text/javascript">
    var ____json4fe = {}; // $pageModel.pageJson
</script>
<!-- 2. ____global全局变量定义 -->
<script type="text/javascript">
    var ____global = {}; // 所有RD向FE传递的变量请定义在此处，但请不要在此处定义函数！
    ____global.infoid = "33845853759407";
    ____global.year = "请选择";
    ____global.isLogin = false;
    ____global.fromUrl = "";
    ____global.itype = "0";
    ____global.error_num = 0;
    ____global.timeout = 0;
    ____global.tid = "13607";
    ____global.areaid = "0";
    ____global.isShowCode = 0;
    ____global.url = "";
    ____global.clickCount = 0;
    ____global.opObj = '';
    ____global.opStr = '';
    ____global.iqas_mcresult = eval('');
    ____global.provinceId = "";
    ____global.provinceName = "";
    ____global.cityName = "";
    ____global.isUnion = true;
    ____global.source_from = "";
    ____global.source_id = "18";
    ____global.targetareaid = "1142";
    ____global.userResumepic = "";
    ____global.user58pic = "";
</script>
<!-- 3. _trackURL统计变量定义 -->
<script type="text/javascript">
	    	var _trackURL = "{'cate':'9225','area':'','pagetype':'jianli_post','page':'fillout_micro_nologin_lianmeng','GA_pageview':'/m/jianli_post/fillout_micro_nologin_lianmeng/'}";
    </script>
<!-- for rd end -->
<!-- for fe start -->
<script type="text/javascript">var ____loadCfg = ['job', 'resume', 'post'];</script>
<!-- 1. 基础库 -->
<script type="text/javascript" src="js/esl_zepto.min_3.js"></script>
<!-- 2. boot文件 -->
<script type="text/javascript" src="js/boot_job_v20180418162256_3.js"></script>
<!-- 3. 加载模块 -->
<script type="text/javascript">
    require(['pkg/job/job_resume_post_micro']);
</script>
<!-- 4. 埋点js -->
<script type="text/javascript" src="js/referrer_m_3.js" async></script>
<!--5.passport 后置登录-->
<script type="text/javascript" src="js/passportmobilelogin_v20171226161048_3.js"></script>
<!-- for fe end -->
<!-- js部分 end -->
<!-- 用于展示model中数据-->
</body>
</html>