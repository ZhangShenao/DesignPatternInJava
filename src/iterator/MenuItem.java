package iterator;

/**
 * 
 * <p>Description:菜单项</p>
 * @author ZhangShenao
 * @date 2017年4月13日
 */
public class MenuItem {
	/**
	 * 菜单项名称
	 */
	private String name;
	
	/**
	 * 菜单项描述
	 */
	private String description;
	
	/**
	 * 是否为素食菜单项
	 */
	private boolean vegetarian;
	
	/**
	 * 菜单项价格
	 */
	private double price;

	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}
	
	
	
}
