package cn.lwy.web.wx;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxConfig;
import com.soecode.wxtools.api.WxConsts;
import com.soecode.wxtools.api.WxService;
import com.soecode.wxtools.bean.WxMenu;
import com.soecode.wxtools.bean.WxMenu.WxMenuButton;
import com.soecode.wxtools.exception.WxErrorException;

public class Menu {
	IService iService = new WxService();
	/**
	 * 创建菜单栏
	 * */
	public void createMenu(){
		WxMenu menu = new WxMenu();
		List<WxMenuButton> btnList = new ArrayList<>();
		String appid = WxConfig.getInstance().getAppId();
		String candicadeUrl = "http://11095cfa.nat123.cc/wx/clogin";//候选人重定向网址
		String interviewerUrl = "http://11095cfa.nat123.cc/wx/ilogin";//面试官重定向网址
		
		//需要对网址进行URLEncode编码
		String REDIRECT_URI = null;
		try {
			REDIRECT_URI = java.net.URLEncoder.encode(candicadeUrl,"utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//需要对网址进行URLEncode编码
		System.out.println(REDIRECT_URI);
		String SCOPE = "snsapi_userinfo";//获取用户openid
		String access = "https://open.weixin.qq.com/connect/oauth2/authorize?appid="+appid+"&redirect_uri="+REDIRECT_URI+"&response_type=code&scope="+SCOPE+"&state=STATE#wechat_redirect";
		//设置候选人菜单，跳转到候选人登陆页面
		WxMenuButton candicade = new WxMenuButton();
		candicade.setType(WxConsts.BUTTON_VIEW);
		candicade.setUrl(access);
		candicade.setName("我是候选人");
		
		
		//设置面试官菜单，跳转到面试官登陆页面
		WxMenuButton interviewer = new WxMenuButton();
		interviewer.setType(WxConsts.BUTTON_VIEW);
		interviewer.setUrl(interviewerUrl);
		interviewer.setName("我是面试官");
		
		//放置按钮
		btnList.add(candicade);
		btnList.add(interviewer);
		//设置进菜单类
		menu.setButton(btnList);
		//调用API
		try {
			iService.createMenu(menu, false);
			System.out.println("创建成功");
		} catch (WxErrorException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}
	}
