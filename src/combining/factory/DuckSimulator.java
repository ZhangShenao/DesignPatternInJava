package combining.factory;

/**
 * 
 * <p>Description:  鸭子模拟器</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:59:36
 */
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		
		//创建具体的DuckFactory
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		duckSimulator.simulate(duckFactory);
	}
	
	public void simulate(AbstractDuckFactory duckFactory){
		//使用工厂创建一组鸭子的产品族
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redHeadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		//利用适配器,将Goose类适配成Quackable接口
		Quackable gooseAdapter = new GooseAdapter(new Goose());
		
		System.out.println("Duck Simulator:");
		
		simulate(mallardDuck);
		simulate(redHeadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseAdapter);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuackCount() + " times");
	}
	
	/**
	 * 模拟鸭子quack叫的行为
	 */
	private void simulate(Quackable quackable){
		quackable.quack();
	}
}
