package decorator;

/**
 * 
 * <p>Description:具体的饮料——浓缩咖啡</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class Espresso extends Beverage{
	public Espresso(){
		despcription = "Espresso";
	}
	@Override
	public String getDescription() {
		return despcription;
	}

	@Override
	public double getCost() {
		//直接返回不加调料的饮料价格
		return 1.99;
	}

}
