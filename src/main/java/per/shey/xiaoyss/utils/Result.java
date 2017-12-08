package per.shey.xiaoyss.utils;

public class Result {
	private int code;
	private String message;
	private Object Data;
	
	/**
	 * 返回成功
	 * @param object
	 * @return
	 */
	public static Result OK(Object object){
		return new Result(200,"成功",object);
	}
	/**
	 * 返回失败信息
	 * @param message
	 * @return
	 */
	public static Result FallNoCode(String message){
		return new Result(message);
	}
	/**
	 * 返回失败代码和信息
	 * @param code
	 * @param message
	 * @return
	 */
	public static Result Fall(int code,String message){
		return new Result(code,message,null);
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	public Result(int code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		Data = data;
	}
	
	public Result(String message) {
		super();
		this.message = message;
	}

	public Result() {
		super();
	}
	
}
