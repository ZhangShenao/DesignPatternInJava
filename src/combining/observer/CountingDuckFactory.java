package combining.observer;

/**
 * 
 * <p>Description:带计数功能的Duck工厂,创建的Duck产品族都被QuackCounter包装起来</p>
 * <p>使用工厂创建Duck,可以确保所有的Duck都被装饰过</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public class CountingDuckFactory extends AbstractDuckFactory{

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
