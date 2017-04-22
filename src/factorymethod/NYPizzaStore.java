package factorymethod;

/**
 * 
 * <p>Description:  纽约Pizza店,具体的Pizza工厂</p>
 * @author ZhangShenao
 * @date 2017年4月21日 下午11:41:19
 */
public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
