package strategy;

/**
 * 
 * <p>Description:模型，不会飞，会吱吱叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class ModelDuck extends Duck{
	
	/**
	 * 构造模型鸭子,不会飞,会吱吱叫
	 */
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("我是模型鸭子");
	}

}
