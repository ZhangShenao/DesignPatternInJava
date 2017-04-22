package factorymethod;

/**
 * 
 * <p>Description:  芝加哥Pizza店,具体的Pizza工厂</p>
 * @author ZhangShenao
 * @date 2017年4月21日 下午11:39:12
 */
public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
    	if (item.equals("cheese")) {
        		return new ChicagoStyleCheesePizza();
    	} else if (item.equals("veggie")) {
    	    	return new ChicagoStyleVeggiePizza();
    	} else if (item.equals("clam")) {
    	    	return new ChicagoStyleClamPizza();
    	} else if (item.equals("pepperoni")) {
        		return new ChicagoStylePepperoniPizza();
    	} else return null;
	}
}
