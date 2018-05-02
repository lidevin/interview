package cn.lwy.web.wx;

import cn.lwy.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @Value("${COOKIE.HRNAME}")
    private String cookieUserName;

    @Value("${COOKIE.PWD}")
    private String cookiePwd;

    @Value("${SESSION.USER}")
    private String sessionUserName;

    /**
    * 登陆验证
    * */
    @RequestMapping("/wx/boss_login.do")
    public String login(){
        return "redirect:/wx/boss_index";
    }
    /**
     * 退出登陆
     * */
    @RequestMapping("/wx/quit")
    public String quit(){

        return "redirect:/wx/boss_login";
    }
}
