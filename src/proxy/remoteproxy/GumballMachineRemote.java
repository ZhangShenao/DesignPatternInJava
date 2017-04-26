package proxy.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * <p>Description: 远程接口,提供了对 GumballMachine进行监控的方法</p>
 * <p>远程接口要继承Remote接口</p>
 * @author ZhangShenao
 * @date 2017年4月26日 下午10:48:16
 */
public interface GumballMachineRemote extends Remote{
	//所有远程方法都要声明抛出RemoteException,且方法的返回值和参数必须是基本类型或实现了Serializable的类型
	
	/**
	 * 获取所在位置
	 */
	public String getLocation() throws RemoteException;
	
	/**
	 * 获取剩余糖果数
	 */
	public int getGumballNum() throws RemoteException;
	
	/**
	 * 获取当前状态
	 */
	public State getState() throws RemoteException;
}
