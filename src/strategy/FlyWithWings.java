package strategy;

/**
 * 
 * <p>Description: 具体的飞行行为，使用翅膀飞行</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class FlyWithWings implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("扇动翅膀自由翱翔");
	}

}
