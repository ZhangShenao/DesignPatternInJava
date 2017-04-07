package designpatternbase;

/**
 *
 * <p>Description: 真实的鸭子，会飞，会嘎嘎叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class RealDuck extends Duck{

	public RealDuck(IFlyBehavior flyBehavior, IBarkBehavior barkBehavior) {
		super(flyBehavior, barkBehavior);
	}

	@Override
	public void display() {
		System.out.println("我是真实的鸭子");
	}

}
