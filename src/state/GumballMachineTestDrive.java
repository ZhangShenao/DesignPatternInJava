package state;

/**
 * 
 * <p>Description:状态模式,允许对象在内部状态改变时改变他的行为,对象看起来好像修改了它的类。(提供了封装状态的技巧)</p>
 * @author ZhangShenao
 * @date 2017年4月26日
 */
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
