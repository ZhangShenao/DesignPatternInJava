package adapter;

/**
 * 
 * <p>Description: 真实的鸭子</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class RealDuck implements Duck{

	@Override
	public void fly() {
		System.out.println("鸭子飞行");
	}

	@Override
	public void gagaBark() {
		System.out.println("鸭子嘎嘎叫");
	}

}
