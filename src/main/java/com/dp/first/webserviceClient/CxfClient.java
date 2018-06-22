package com.dp.first.webserviceClient;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class CxfClient {

	
	public static void cl2() {
		// 鍒涘缓鍔ㄦ�佸鎴风
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://172.20.8.36:2333/twhr/soap/user?wsdl");
		// 闇�瑕佸瘑鐮佺殑鎯呭喌闇�瑕佸姞涓婄敤鎴峰悕鍜屽瘑鐮�
		// client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,
		// PASS_WORD));
		Object[] objects = new Object[0];
		try {
			// invoke("鏂规硶鍚�",鍙傛暟1,鍙傛暟2,鍙傛暟3....);
			objects = client.invoke("insertDept", "Leftso","1");
			System.out.println("杩斿洖鏁版嵁:" + objects[0]);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		cl2();
	}
}
