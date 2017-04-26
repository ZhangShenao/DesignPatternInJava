package proxy.remoteproxy;

import java.rmi.Naming;

import proxy.GumballMachineMonitor;


/**
 * 
 * <p>Description:使用远程代理,实现控制访问远程对象</p>
 * @author ZhangShenao
 * @date 2017年4月26日
 */
public class GumballMachineTestDrive {
	public static void main(String[] args) throws Exception {
		//从注册表中获取对象
		for (int i = 1;i < 4;i++){
			GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/gumballMachineRemote" + i);
			GumballMachineMonitor gumballMachineMonitor = new GumballMachineMonitor(gumballMachineRemote);
			gumballMachineMonitor.printInfo();
		} 
	}
}
