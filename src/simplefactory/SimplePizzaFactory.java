package simplefactory;

/**
 * 
 * <p>Description:简单的Pizza工厂</p>
 * @author ZhangShenao
 * @date 2017年4月21日
 */
public class SimplePizzaFactory {
	/**
	 * 创建具体的Pizza对象,所有客户都要使用这个方法实例化Pizza对象
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
