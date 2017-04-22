package simplefactory;

import java.util.ArrayList;

/**
 * 
 * <p>Description:Pizza的抽象父类</p>
 * @author ZhangShenao
 * @date 2017年4月21日
 */
public abstract class Pizza {
	/**
	 * Pizza的名称
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

	public String getName() {
		return name;
	}
	
	/**
	 * 准备
	 */
	public void prepare() {
		System.out.println("Preparing " + name);
	}
	
	/**
	 * 烘烤
	 */
	public void bake() {
		System.out.println("Baking " + name);
	}
	
	/**
	 * 切片
	 */
	public void cut() {
		System.out.println("Cutting " + name);
	}
	
	/**
	 * 装盒
	 */
	public void box() {
		System.out.println("Boxing " + name);
	}
	
	/**
	 * 打印Pizza的名称和原料
	 */
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append(toppings.get(i) + "\n");
		}
		return display.toString();
	}
}

