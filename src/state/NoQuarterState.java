package state;

/**
 * 
 * <p>Description:  未投入硬币的状态</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午7:56:16
 */
public class NoQuarterState extends AbstractState{
	public NoQuarterState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		//转换到已投硬币状态
		System.out.println("您投入了硬币,请转动曲柄");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("您还未投入硬币,无法退还硬币");
	}

	@Override
	public void turnCrank() {
		System.out.println("您还未投入硬币,无法转动曲柄");
	}

	@Override
	public void dispense() {
		System.out.println("您还未投入硬币,无法分发糖果");
	}
	
	@Override
	public String toString() {
		return "未投入硬币";
	}

}
