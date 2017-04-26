package proxy.remoteproxy;

import java.io.Serializable;

/**
 * 
 * <p>Description: 状态接口,所有具体的状态都要实现该接口 </p>
 * <p>由于该接口类型作为了远程方法的返回值,因此需要继承Serializable</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午7:53:29
 */
public interface State extends Serializable{
	/**
	 * 投入硬币
	 */
	public void insertQuarter();
	
	/**
	 * 退出硬币
	 */
	public void ejectQuarter();
	
	/**
	 * 转动曲柄
	 */
	public void turnCrank();
	
	/**
	 * 分发糖果
	 */
	public void dispense();
}
