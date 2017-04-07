package designpatternbase;

/**
 *
 * <p>Description:木头鸭子，不会叫也不会飞</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class WoodDuck extends Duck{

	public WoodDuck(IFlyBehavior flyBehavior, IBarkBehavior barkBehavior) {
		super(flyBehavior, barkBehavior);
	}

	@Override
	public void display() {
		System.out.println("我是木头鸭子");
	}

}
