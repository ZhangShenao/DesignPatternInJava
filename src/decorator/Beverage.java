package decorator;

/**
 * 
 * <p>Description: 饮料,装饰者和被装饰者的公共父类</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public abstract class Beverage {
	/**
	 * 饮料的描述信息
	 */
	protected String despcription;
	
	/**
	 * 获取饮料的描述信息
	 */
	public abstract String getDescription();
	
	/**
	 * 计算饮料的价格
	 */
	public abstract double getCost();
}
