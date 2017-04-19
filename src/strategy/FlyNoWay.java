package strategy;

/**
 * 
 * <p>Description: 具体的飞行行为，无法飞行</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class FlyNoWay implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("不会飞...");
	}

}
