package decorator;

/**
 * 
 * <p>Description:具体的调料类——牛奶</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class Milk extends CondimentDecorator{

	public Milk(String description, Beverage beverage, double cost) {
		super(description, beverage, cost);
	}

}
