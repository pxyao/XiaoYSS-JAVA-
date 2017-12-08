package per.shey.xiaoysstest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.types.Token;
import org.junit.Test;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import per.shey.xiaoyss.bean.RnData;
import per.shey.xiaoyss.pojo.Users;

public class ASMXServiceTest {
	String url = "http://localhost:4745/UserLogin.asmx";

	String soapaction = "http://xiaoyss.top/";

	Service service = new Service();
	@Test
	public void testLogin() throws Exception {
		try {
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(url);
			call.setOperationName(new QName(soapaction, "login")); // ����Ҫ�����ĸ�����
			call.addParameter(new QName(soapaction, "username"), // ����Ҫ���ݵĲ���
					org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName(soapaction, "password"), // ����Ҫ���ݵĲ���
					org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
			// call.setReturnType(new
			// QName(soapaction,"getWeatherbyCityName"),Vector.class);
			call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// ����׼�����ͣ�
			call.setUseSOAPAction(true);
			call.setSOAPActionURI(soapaction + "login");

			String str = (String)call.invoke(new Object[] { "ad", "ad" });// ���÷��������ݲ���
			System.out.println(str);
			String json = "{\"name\":\"����\",\"age\":23,\"address\":\"������\"}";
			System.out.println(json);
			ObjectMapper objectMapper = new ObjectMapper();
			User user = objectMapper.readValue(json, User.class);
			System.out.println(user.getName());
			RnData rnData = objectMapper.readValue(str, RnData.class);
			System.out.println(rnData.getData());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void testFindAll() throws Exception {
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress(url);
		call.setOperationName(new QName(soapaction, "findAll")); // ����Ҫ�����ĸ�����
		call.addParameter(new QName(soapaction, "token"), // ����Ҫ���ݵĲ���
				org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
		call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// ����׼�����ͣ�
		call.setUseSOAPAction(true);
		call.setSOAPActionURI(soapaction + "findAll");

		String str = (String)call.invoke(new Object[] { "151ec88e78594beea14d1c951b01bdd3" });// ���÷��������ݲ���
		System.out.println(str);
		ObjectMapper objectMapper = new ObjectMapper();
		RnData rnData = objectMapper.readValue(str, RnData.class);
		System.out.println(rnData.toString());
		System.out.println(rnData.getData());
		objectMapper.getTypeFactory().constructParametricType(ArrayList.class, RnData.class);   
		
		JavaType javaType1 = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, Users.class);
//		List<Users> list = objectMapper.readValue(rnData.getData(), javaType1);
		
	}
	
	
	@Test
	public void tt2() throws Exception {
		QName qn = new QName("RnData");
		Call call = (Call) service.createCall();
		call.registerTypeMapping(RnData.class, qn, new BeanSerializerFactory(RnData.class, qn),
				new BeanDeserializerFactory(RnData.class, qn));
		call.setOperationName(new QName(soapaction, "login"));
		call.setTargetEndpointAddress(url);
		call.setUseSOAPAction(true);
		call.setSOAPActionURI(soapaction + "login");// ����SOAPAction
		call.setReturnClass(RnData.class);
		call.addParameter(new QName(soapaction, "arg0"), XMLType.XSD_STRING, ParameterMode.IN);
		call.addParameter(new QName(soapaction, "arg1"), XMLType.XSD_STRING, ParameterMode.IN);
		call.invoke(new Object[] { "arg0", "arg0" });

	}
}
