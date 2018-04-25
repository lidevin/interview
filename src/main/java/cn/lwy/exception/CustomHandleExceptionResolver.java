package cn.lwy.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomHandleExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		// 定义异常信息
		String msg = "";
		// 判断异常类型
		if (exception instanceof GeneralException) {
			// 如果是自定义异常，读取异常信息
			msg = ((GeneralException)exception).getMsg();
		} else {
			// 如果是运行时异常，则取错误堆栈，从堆栈中获取异常信息
			msg = "未知异常";
		}
		// 把错误信息发给相关人员,邮件,短信等方式
		// 返回错误页面，给用户友好页面显示错误信息
		ModelAndView modelAndView = new ModelAndView();
		request.getSession().setAttribute("errorMsg", msg);
		modelAndView.setViewName("redirect:/error/error.jsp");
		return modelAndView;
	}
}