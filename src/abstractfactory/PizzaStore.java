package abstractfactory;

/**
 * 
 * <p>Description:  抽象Pizza点父类</p>
 * @author ZhangShenao
 * @date 2017年4月22日 上午7:57:19
 */
public abstract class PizzaStore {
 
	protected abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
