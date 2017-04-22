package abstractfactory;

/**
 * 
 * <p>Description:  Pizza的抽象父类,所有具体的Pizza都继承该类</p>
 * @author ZhangShenao
 * @date 2017年4月22日 上午7:50:34
 */
public abstract class Pizza {
	/**
	 * 名称
	 */
	protected String name;
	
	/**
	 * 面团
	 */
	protected Dough dough;
	
	/**
	 * 酱料
	 */
	protected Sauce sauce;
	
	/**
	 * 蔬菜
	 */
	protected Veggies veggies[];
	
	/**
	 * 芝士
	 */
	protected Cheese cheese;
	
	/**
	 * 香肠
	 */
	protected Pepperoni pepperoni;
	
	/**
	 * 蛤蜊
	 */
	protected Clams clam;
	
	/**
	 * 准备Pizza原料的方法,通过具体的原料工厂创建原料,交给子类实现
	 */
	public abstract void prepare();
	
	/**
	 * 烘焙
	 */
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	/**
	 * 切片
	 */
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	/**
	 * 装盒
	 */
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	
	/**
	 * 打印Pizza原料信息
	 */
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
