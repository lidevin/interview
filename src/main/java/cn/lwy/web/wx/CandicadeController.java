package cn.lwy.web.wx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CandicadeController {

    /**
     * 候选人登陆验证
     * */
    @RequestMapping("/wx/candicade_login.do")
    public String login(){
        return "redirect:/wx/二维码识别页面";
    }
    @RequestMapping("/wx/quit.do")
    public String quit(){
        return "redirect:/wx/candicade_login.jsp";
    }
}
