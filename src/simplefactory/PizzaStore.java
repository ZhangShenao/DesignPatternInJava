package simplefactory;

public class PizzaStore {
	private SimplePizzaFactory factory;
	
	/**
	 * 在构造器中传入Pizza工厂实例
	 */
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		//使用Pizza工厂创建Pizza
		Pizza pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		System.out.println(pizzaStore.orderPizza("cheese"));
	}

}
