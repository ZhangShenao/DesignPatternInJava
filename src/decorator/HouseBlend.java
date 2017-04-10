package decorator;

/**
 * 
 * <p>Description:具体的饮料——综合咖啡</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class HouseBlend extends Beverage{
	public HouseBlend(){
		despcription = "HouseBlend";
	}
	@Override
	public String getDescription() {
		return despcription;
	}

	@Override
	public double getCost() {
		//直接返回不加调料的饮料价格
		return .89;
	}

}
