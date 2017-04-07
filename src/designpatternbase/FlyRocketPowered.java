package designpatternbase;

/**
 * 
 * <p>Description: 具体的飞行行为，使用火箭助飞</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class FlyRocketPowered implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("点火起飞");
	}

}
