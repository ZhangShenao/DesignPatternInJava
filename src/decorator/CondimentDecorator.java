package decorator;


/**
 * 
 * <p>Description: 调料,装饰者的父类</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class CondimentDecorator extends Beverage{
	/**
	 * 内部保存被装饰的对象
	 */
	protected Beverage beverage;
	
	/**
	 * 具体调料的价格
	 */
	protected double cost;
	
	/**
	 * 在构造器中传入具体调料的描述、价格和被装饰的对象
	 * @param description
	 * @param beverage
	 * @param cost
	 */
	public CondimentDecorator(String description,Beverage beverage, double cost) {
		this.despcription = description;
		this.beverage = beverage;
		this.cost = cost;
	}

	@Override
	public String getDescription() {
		//返回具体饮料的描述信息+调料的描述信息
		return beverage.getDescription() + "," + despcription;
	}

	@Override
	public double getCost() {
		//返回具体饮料的价格+调料的价格
		return cost + beverage.getCost();
	}
}
