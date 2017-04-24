package adapter;

/**
 * 
 * <p>Description:真实的火鸡</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class RealTurcky implements Turcky{

	@Override
	public void fly() {
		System.out.println("火鸡飞行");
	}

	@Override
	public void gobble() {
		System.out.println("火鸡咕咕叫");
	}

}
