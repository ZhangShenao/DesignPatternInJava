package state;

/**
 * 
 * <p>Description:  售出糖果状态</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午8:04:47
 */
public class SoldState extends AbstractState{
	public SoldState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		System.out.println("当前正在出售糖果,请稍后再投入硬币");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("当前正在出售糖果,无法退还硬币");
	}

	@Override
	public void turnCrank() {
		System.out.println("当前正在出售糖果,无法转动曲柄");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		
		//如果还有糖果,则转换到未投入硬币状态
		if (gumballMachine.getGumballNum() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		
		//如果没有剩余糖果,则转换到糖果售罄状态
		else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	@Override
	public String toString() {
		return "售出糖果";
	}

}
