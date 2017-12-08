package per.shey.xiaoyss.service;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import per.shey.xiaoyss.bean.RnData;
import per.shey.xiaoyss.pojo.Users;
import per.shey.xiaoyss.utils.Result;
import per.shey.xiaoysstest.User;

@Service
public class UsersService{
	
	@Value("${WEB_SERVICE_URL}")
	private String url;
	@Value("${WEB_SOAPACTION}")
	private String soapaction;
	
	private org.apache.axis.client.Service axisService;
	private Call call;
	private ObjectMapper objectMapper;
	public UsersService() {
		axisService = new org.apache.axis.client.Service();
		try {
			call = (Call) axisService.createCall();
			call.setTargetEndpointAddress(url);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 锟斤拷锟斤拷准锟斤拷锟斤拷锟酵ｏ拷
			call.setUseSOAPAction(true);
			objectMapper = new ObjectMapper();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	public Result login(String username, String password) {
		try {	
			call.setOperationName(new QName(soapaction, "login"));
			call.addParameter(new QName(soapaction, "username"), 
					org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName(soapaction, "password"), 
					org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.setSOAPActionURI(soapaction + "login");
			String json = (String)call.invoke(new Object[] { username, password });
			RnData data = objectMapper.readValue(json, RnData.class);
			@SuppressWarnings("unused")
			Users users = (Users)data.getData();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return Result.OK(null);
	}
}
