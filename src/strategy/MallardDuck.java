package strategy;

/**
 *
 * <p>Description: 绿头鸭，会飞，会嘎嘎叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class MallardDuck extends Duck{
	/**
	 * 构造绿头鸭,具有飞行行为和呱呱叫行为
	 */
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("我是真实的绿头鸭");
	}

}
