package designpatternbase;

/**
 * 
 * <p>Description: 鸭子模拟器，用于产生各种鸭子</p>
 * <p>使用了策略模式,定义了算法族,分别封装起来,让他们之间可以互相替换。此模式让算法的变化独立于使用算法的客户。</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class DuckSimulator {
	public static void main(String[] args) {
		//创建真实的鸭子
		/*Duck duck = new RealDuck(new FlyWithWings(), new GaGaBark());
		duck.display();
		duck.performBark();
		duck.performFly();*/
		
		//创建橡皮鸭子
		/*Duck duck = new RubberDuck(new FlyNoWay(), new ZhiZhiBark());
		duck.display();
		duck.performBark();
		duck.performFly();*/
		
		//创建木头鸭子
		Duck duck = new WoodDuck(new FlyNoWay(), new BarkNoWay());
		duck.display();
		
		//木头鸭子本来不会飞
		duck.performFly();
		
		//给木头鸭子安装火箭助力系统，木头鸭子就能飞了
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
}
