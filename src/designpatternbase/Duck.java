package designpatternbase;

/**
 * 
 * <p>Description: 鸭子父类</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public abstract class Duck {
	/**
	 * 飞行行为成员，让子类继承
	 * 面向接口编程
	 */
	protected IFlyBehavior flyBehavior;
	
	/**
	 * 鸣叫行为成员,让子类继承
	 * 面向接口编程
	 */
	protected IBarkBehavior barkBehavior;
	
	/**
	 * 在构造器中指定具体的行为
	 * 让子类重写构造器
	 */
	public Duck(IFlyBehavior flyBehavior, IBarkBehavior barkBehavior) {
		this.flyBehavior = flyBehavior;
		this.barkBehavior = barkBehavior;
	}
	
	/**
	 * 设置具体的飞行行为
	 */
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	/**
	 * 设置具体的鸣叫行为
	 */
	public void setBarkBehavior(IBarkBehavior barkBehavior) {
		this.barkBehavior = barkBehavior;
	}
	
	/**
	 * 鸭子的飞行方法，委托给飞行行为成员去实现
	 */
	public void performFly(){
		flyBehavior.fly();
	}
	
	/**
	 * 鸭子的鸣叫方法，委托给鸣叫行为成员去实现
	 */
	public void performBark(){
		barkBehavior.bark();
	}
	
	/**
	 * 展示自己的方法，交给子类去具体实现
	 */
	public abstract void display();
}
