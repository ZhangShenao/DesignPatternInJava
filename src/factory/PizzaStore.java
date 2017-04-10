package factory;

/**
 * 
 * <p>Description: pizza店,抽象父类,使用工厂方法模式</p>
 * <p>工厂方法模式定义类一个创建对象的接口,但由子类决定要创建的对象是哪一个。工厂方法将类的实例化延迟的子类</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public abstract class PizzaStore {
	/**
	 * 创建具体pizza的工厂方法,交给不同的子类去实现,在父类中只面向接口(抽象类)编程,可以实现解耦
	 * @param type pizza的类型
	 */
	protected abstract Pizza createPizza(String type);
	
	/**
	 * 提供给客户端订购pizza的方法
	 * @param type pizza的类型
	 */
	public Pizza orderPizza(String type){
		//根据不同的子类,生成不同的pizza类型,实现解耦
		Pizza pizza = createPizza(type);
		return pizza;
	}
}
