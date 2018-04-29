package cn.lwy.exception;
/**
 * 异常类
 */
public class GeneralException extends Exception{

	private static final long serialVersionUID = 8902541220040684412L;

	/**
	 * code:
	 *   400   登录异常代码
	 */
	private int code;
	private String msg;
	
	public GeneralException() {
	}
	public GeneralException(String msg) {
		this.msg = msg;
	}
	public GeneralException(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
