package proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * <p>Description:远程接口,必须继承Remote接口</p>
 * @author ZhangShenao
 * @date 2017年4月26日
 */
public interface MyRemote extends Remote{
	/**
	 * 远程方法,要抛出RemoteException异常
	 */
	public String sayHello() throws RemoteException;
}
