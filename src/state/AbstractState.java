package state;

/**
 * 
 * <p>Description:  抽象状态,内部维护了一个糖果机的引用,让子类复用代码</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午7:58:39
 */
public abstract class AbstractState implements State{
	protected GumballMachine gumballMachine;

	public AbstractState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
}
