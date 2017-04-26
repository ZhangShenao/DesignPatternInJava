package proxy.rmi;

import java.rmi.Naming;

/**
 * 
 * <p>Description:远程调用的客户端</p>
 * @author ZhangShenao
 * @date 2017年4月26日
 */
public class MyRemoteClient {
	public static void main(String[] args) throws Exception {
		//从注册表中获取远程对象
		MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/remoteImpl");
		System.out.println(myRemote.sayHello());
	}
}
