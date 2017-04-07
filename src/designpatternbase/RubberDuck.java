package designpatternbase;

/**
 * 
 * <p>Description:橡皮鸭子，不会飞，会吱吱叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class RubberDuck extends Duck{

	public RubberDuck(IFlyBehavior flyBehavior, IBarkBehavior barkBehavior) {
		super(flyBehavior, barkBehavior);
	}

	@Override
	public void display() {
		System.out.println("我是橡皮鸭子");
	}

}
