package proxy.remoteproxy;

/**
 * 
 * <p>Description:  抽象状态,内部维护了一个糖果机的引用,让子类复用代码</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午7:58:39
 */
public abstract class AbstractState implements State{
	private static final long serialVersionUID = 1L;
	
	//内部的gumballMachine实例无需序列化,声明为transient
	protected transient GumballMachine gumballMachine;

	public AbstractState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
}
