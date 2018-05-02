package com.lwy.wx;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxConsts;
import com.soecode.wxtools.api.WxService;
import com.soecode.wxtools.bean.WxUserList.WxUser;
import com.soecode.wxtools.bean.WxUserList.WxUser.WxUserGet;
import com.soecode.wxtools.bean.result.WxOAuth2AccessTokenResult;
import com.soecode.wxtools.bean.result.WxUserListResult;
import com.soecode.wxtools.exception.WxErrorException;

public class UserInfo {
	private IService iService = new WxService();
	private String Openid = null;
	private String Access_token = null;
	private String Code = null;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	private void getAccessToken(){
	try {
        WxOAuth2AccessTokenResult result = iService.oauth2ToGetAccessToken(Code);
        this.Access_token = result.getAccess_token();
        this.Openid = result.getOpenid();
        System.out.println(result.getAccess_token());
        System.out.println(result.getOpenid());
    } catch (WxErrorException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
	}
	private void getUserInfo(){
		 try {
		        WxUser user = iService.oauth2ToGetUserInfo(Access_token, new WxUserGet(Openid, WxConsts.LANG_CHINA));
		        System.out.println(user.toString());
		    } catch (WxErrorException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
	}
	public void doing(){
		getAccessToken();
		getUserInfo();
	}
}
