package decorator;

/**
 * 
 * <p>Description:具体的调料类——摩卡</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class Mocha extends CondimentDecorator{

	public Mocha(String description, Beverage beverage, double cost) {
		super(description, beverage, cost);
	}
}
