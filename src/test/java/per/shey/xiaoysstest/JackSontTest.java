package per.shey.xiaoysstest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackSontTest {

	@Test
	public void t1() throws Exception {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonGenerator jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(System.out,
					JsonEncoding.UTF8);

			// ����תJSON
			User user = new User("����", 23, "������");
			System.out.println("ObjectMapper��ʽ");
			objectMapper.writeValue(System.out, user);// ֱ�����������̨
			String userJsonStr = objectMapper.writeValueAsString(user);// �����ַ��������
			System.out.println(userJsonStr);
			System.out.println("JsonGenerator��ʽ");
			jsonGenerator.writeObject(user);
			System.out.println();

			// mapתJSON
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("one", new User("��", 12, "����"));
			map.put("two", new User("��", 22, "�人"));
			map.put("three", new User("��", 32, "����"));
			System.out.println("ObjectMapper��ʽ");
			objectMapper.writeValue(System.out, map);
			// JsonGenerator��ʽͬ��

			// listתJSON
			List<User> list = new ArrayList<User>();
			list.add(new User("��", 12, "����"));
			list.add(new User("��", 22, "�人"));
			list.add(new User("��", 32, "����"));
			System.out.println("ObjectMapper��ʽ");
			objectMapper.writeValue(System.out, list);
			// JsonGenerator��ʽͬ��

			// JSONתjava����
			String json = "{\"name\":\"����\",\"age\":23,\"address\":\"������\"}";
			User zhang = objectMapper.readValue(json, User.class);
			System.out.println(zhang.getName() + "\n" + zhang.getAge() + "\n" + zhang.getAddress());

			// JSONתlist
			String listJson = "[{\"name\":\"����\",\"age\":21,\"address\":\"����\"},"
					+ "{\"name\":\"����\",\"age\":11,\"address\":\"�人\"},"
					+ "{\"name\":\"����\",\"age\":31,\"address\":\"����\"}]";
			JavaType javaType1 = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, User.class);
			List<User> userList = (List<User>) objectMapper.readValue(listJson, javaType1);
			for (User user1 : userList) {
				System.out.println(user1.getName() + "\t" + user1.getAge() + "\t" + user1.getAddress());
			}

			// JSONתmap
			String mapJson = "{\"one\":{\"name\":\"����\",\"age\":21,\"address\":\"����\"},"
					+ "\"two\":{\"name\":\"����\",\"age\":11,\"address\":\"�人\"},"
					+ "\"three\":{\"name\":\"����\",\"age\":31,\"address\":\"����\"}}";
			JavaType javaType2 = objectMapper.getTypeFactory().constructParametricType(HashMap.class, String.class,
					User.class);
			Map<String, User> userMap = (Map<String, User>) objectMapper.readValue(mapJson, javaType2);
			User one = userMap.get("one");
			User two = userMap.get("two");
			User three = userMap.get("three");
			System.out.println(one.getName() + "\t" + one.getAge() + "\t" + one.getAddress());
			System.out.println(two.getName() + "\t" + two.getAge() + "\t" + two.getAddress());
			System.out.println(three.getName() + "\t" + three.getAge() + "\t" + three.getAddress());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
