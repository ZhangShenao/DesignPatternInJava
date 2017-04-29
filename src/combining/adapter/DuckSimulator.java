package combining.adapter;

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
		
		//利用适配器,将Goose类适配成Quackable接口
		Quackable gooseAdapter = new GooseAdapter(new Goose());
		
		System.out.println("Duck Simulator:");
		
		simulate(mallardDuck);
		simulate(redHeadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseAdapter);
	}
	
	private void simulate(Quackable quackable){
		quackable.quack();
	}
}
