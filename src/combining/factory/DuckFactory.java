package combining.factory;

/**
 * 
 * <p>Description:普通的Duck工厂,用于创建未被装饰的Duck产品族</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public class DuckFactory extends AbstractDuckFactory{

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
