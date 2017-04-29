package combining.composite;

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
	
	/**
	 * 模拟器开始工作
	 */
	public void simulate(AbstractDuckFactory duckFactory){
		//使用工厂创建一组鸭子的产品族
		Quackable redHeadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		//利用适配器,将Goose类适配成Quackable接口
		Quackable gooseAdapter = new GooseAdapter(new Goose());
		
		//创建一个鸭群作为主群
		Flock flockOfDucks = new Flock();
		
		//将各种鸭子加入主群中
		flockOfDucks.addDuck(redHeadDuck);
		flockOfDucks.addDuck(duckCall);
		flockOfDucks.addDuck(rubberDuck);
		flockOfDucks.addDuck(gooseAdapter);
		
		//创建一个绿头鸭群
		Flock flockOfMallards = new Flock();
		
		//将绿头鸭加入到绿头鸭群中
		for (int i = 0;i < 5;i++){
			flockOfMallards.addDuck(duckFactory.createMallardDuck());
		}
		
		//将绿头鸭群加入到主群中
		flockOfDucks.addDuck(flockOfMallards);
		
		//测试一整群
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);
		
		//单独测试绿头鸭群
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);
		
		//获取鸭子总共quack的次数
		System.out.println("\nThe ducks quacked " + 
		                   QuackCounter.getQuackCount() + 
		                   " times");
		
	}
	
	/**
	 * 模拟鸭子quack叫的行为
	 */
	private void simulate(Quackable quackable){
		quackable.quack();
	}
}
