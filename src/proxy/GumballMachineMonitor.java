package proxy;

import java.rmi.RemoteException;

import proxy.remoteproxy.GumballMachineRemote;

/**
 * 
 * <p>Description:  糖果机的监视器</p>
 * @author ZhangShenao
 * @date 2017年4月26日 下午11:01:16
 */
public class GumballMachineMonitor {
	private GumballMachineRemote gumballMachineRemote;

	public GumballMachineMonitor(GumballMachineRemote gumballMachineRemote) {
		this.gumballMachineRemote = gumballMachineRemote;
	}
	
	/**
	 * 打印对糖果机的监控信息
	 */
	public void printInfo() throws RemoteException{
		System.out.println("位置: " + gumballMachineRemote.getLocation() + ",剩余糖果数:" + gumballMachineRemote.getGumballNum() 
				+ ",当前状态:" + gumballMachineRemote.getState());
	}
	
}
