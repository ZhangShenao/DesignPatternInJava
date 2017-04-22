package factorymethod;

/**
 * 
 * <p>Description: Pizza店,抽象的Pizza工厂,定义了抽象的工厂方法,由具体的工厂决定创建什么类型的Pizza</p>
 * <p>工厂方法模式,定义了一个创建对象的接口,但由子类决定要实例化的类是哪一个。工厂方法将类的实例化延迟到子类。</p>
 * @author ZhangShenao
 * @date 2017年4月21日 下午11:34:16
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.box();
		return pizza;
	}
	
	/**
	 * 抽象的工厂方法,用于创建Pizza,交给具体的Pizza工厂实现
	 * 面向接口编程,由子类决定创建什么类型的Pizza
	 */
	protected abstract Pizza createPizza(String type);
}
