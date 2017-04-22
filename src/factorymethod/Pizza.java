package factorymethod;

import java.util.ArrayList;

/**
 * 
 * <p>Description:  抽象的Pizza父类,所有具体的Pizza都继承此类</p>
 * @author ZhangShenao
 * @date 2017年4月21日 下午11:30:15
 */
public abstract class Pizza {
	/**
	 * Pizza名称
	 */
	protected String name;
	
	/**
	 * 面团类型
	 */
	protected String dough;
	
	/**
	 * 酱料类型
	 */
	protected String sauce;
	
	/**
	 * 所有的配料
	 */
	protected ArrayList<String> toppings = new ArrayList<>();
	
	/**
	 * 准备原料
	 */
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}
	
	/**
	 * 烘焙
	 */
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	/**
	 * 切片
	 */
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	/**
	 * 装盒
	 */
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * 打印Pizza的原料信息
	 */
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String )toppings.get(i) + "\n");
		}
		return display.toString();
	}
}
