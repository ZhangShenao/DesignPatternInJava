package proxy.remoteproxy;

/**
 * 
 * <p>Description:  糖果售罄状态</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午8:04:47
 */
public class SoldOutState extends AbstractState{
	private static final long serialVersionUID = 1L;
	public SoldOutState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		System.out.println("当前糖果已售罄,请使用其他糖果机");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("当前糖果已售罄,请使用其他糖果机");
	}

	@Override
	public void turnCrank() {
		System.out.println("当前糖果已售罄,请使用其他糖果机");
	}

	@Override
	public void dispense() {
		System.out.println("当前糖果已售罄,请使用其他糖果机");
	}
	
	@Override
	public String toString() {
		return "糖果售罄";
	}

}
