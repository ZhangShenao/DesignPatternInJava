package state;

import java.util.Random;

/**
 * 
 * <p>Description:  已投币状态</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午8:04:47
 */
public class HasQuarterState extends AbstractState{
	/**
	 * 生成随机数,有十分之一的几率进入赢家状态
	 */
	private final Random random = new Random(System.currentTimeMillis());
	
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
		System.out.println("购买糖果成功,请等待分发糖果");
		gumballMachine.setCanDispense(true);
		
		//如果生成了随机数0,且剩余糖果足够,则转换到赢家状态
		if (random.nextInt(10) == 0 && gumballMachine.getGumballNum() > 1){
			gumballMachine.setState(gumballMachine.getWinnerState());
		}
		
		//否则转换到售出糖果状态
		else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		
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
