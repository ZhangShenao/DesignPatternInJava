package state;

/**
 * 
 * <p>Description: 糖果机,具有不同的状态,根据当前状态的不同,会表现出不同的行为。(Context类)</p>
 * @author ZhangShenao
 * @date 2017年4月26日 上午7:57:16
 */
public class GumballMachine {
	//糖果机具有的四个状态
	private State noQuarterState;	//未投币状态
	private State hasQuarterState;	//已投币状态
	private State soldState;		//售出糖果状态
	private State soldOutState;		//糖果售罄状态
	
	//新增的赢家状态
	private State winnerState;
	
	private State state;	//当前状态
	private int gumballNum = 0;		//糖果机内糖果的数量
	
	private boolean canDispense;	//是否可以分发糖果的标记
	
	/**
	 * 初始化糖果机,放入指定数量的糖果
	 */
	public GumballMachine(int gumballNum){
		//放入糖果
		this.gumballNum = gumballNum;
		
		//初始化各个状态
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		
		//设置当前状态
		if (gumballNum == 0){
			state = soldOutState;
		}
		else {
			state = noQuarterState;
		}
	}
	
	//针对糖果机的所有动作,都委托给当前状态实现
	/**
	 * 投入硬币
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	/**
	 * 退出硬币
	 */
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	/**
	 * 转动曲柄
	 */
	public void turnCrank() {
		state.turnCrank();
		if (canDispense){
			state.dispense();
		}
	}
	
	/**
	 * 放出糖果
	 */
	public void releaseBall(){
		System.out.println("从糖果机中出来了糖果!!");
		if (gumballNum > 0){
			gumballNum--;
		}
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getState() {
		return state;
	}

	public int getGumballNum() {
		return gumballNum;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	
	

	public boolean isCanDispense() {
		return canDispense;
	}

	public void setCanDispense(boolean canDispense) {
		this.canDispense = canDispense;
	}

	/**
	 * 打印当前糖果机的状态
	 */
	public String toString() {
		StringBuilder result = new StringBuilder("[ 糖果机-->");
		result.append("剩余糖果数: " + gumballNum);
		result.append(",当前状态: " + state);
		return result.append(" ]").toString();
	}
}
