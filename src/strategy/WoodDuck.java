package strategy;

/**
 *
 * <p>Description:木头鸭子，不会叫也不会飞</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class WoodDuck extends Duck{
	/**
	 * 构造木头鸭子,不会飞也不会叫
	 */
	public WoodDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("我是木头鸭子");
	}

}
