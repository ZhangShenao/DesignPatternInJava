package proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * <p>Description:远程对象,实现远程接口,并继承UnicastRemoteObject</p>
 * @author ZhangShenao
 * @date 2017年4月26日
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	
	/**
	 * 远程对象必须创建构造器,并声明抛出RemoteException异常
	 */
	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello() throws RemoteException {
		return "Hello Server!!";
	}
	
	public static void main(String[] args) throws Exception {
		//创建远程对象
		MyRemoteImpl remoteImpl = new MyRemoteImpl();
		
		//将远程对象绑定到注册表中
		Naming.rebind("rmi://127.0.0.1/remoteImpl", remoteImpl);
	}

}
