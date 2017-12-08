package per.shey.xiaoyss.bean;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RnData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Code")   
	private String Code;
	
	@JsonProperty("Message")   
	private String Message;
	
	@JsonProperty("Data")   
	private Object Data;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Object getData() {
		return Data;
	}
	public void setData(Object data) {
		Data = data;
	}
	public RnData(String code, String message, Object data) {
		super();
		Code = code;
		Message = message;
		Data = data;
	}
	public RnData() {
		super();
	}
	
	
}
