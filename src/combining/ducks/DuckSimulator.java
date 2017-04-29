package combining.ducks;

/**
 * 
 * <p>Description:  鸭子模拟器</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:59:36
 */
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		duckSimulator.simulate();
	}
	
	public void simulate(){
		Quackable mallardDuck = new MallardDuck();
		Quackable redHeadDuck = new RedHeadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		
		System.out.println("Duck Simulator:");
		
		simulate(mallardDuck);
		simulate(redHeadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
	}
	
	private void simulate(Quackable quackable){
		quackable.quack();
	}
}
