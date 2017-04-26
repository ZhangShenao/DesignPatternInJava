package state;

/**
 * 
 * <p>Description:  已投币状态</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午8:04:47
 */
public class HasQuarterState extends AbstractState{
	public HasQuarterState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		System.out.println("您已投完硬币,无需再投");
	}

	@Override
	public void ejectQuarter() {
		//转换到未投硬币状态
		System.out.println("您退出了硬币");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		
	}

	@Override
	public void turnCrank() {
		//转换到售出糖果状态
		System.out.println("购买糖果成功,请等待分发糖果");
		gumballMachine.setState(gumballMachine.getSoldState());
		
	}

	@Override
	public void dispense() {
		System.out.println("请先转动曲柄");
	}
	
	@Override
	public String toString() {
		return "已投入硬币";
	}

}
