package combining.observer;

/**
 * 
 * <p>Description:抽象的Duck工厂,用于创建Duck产品族,具体的工厂子类会创建不同的产品族</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public abstract class AbstractDuckFactory {
	/**
	 * 创建标准的绿头鸭
	 */
	public abstract Quackable createMallardDuck();
	
	/**
	 * 创建稀有的红头鸭
	 */
	public abstract Quackable createRedheadDuck();
	
	/**
	 * 创建鸭鸣器
	 */
	public abstract Quackable createDuckCall();
	
	/**
	 * 创建橡皮鸭
	 */
	public abstract Quackable createRubberDuck();
}
