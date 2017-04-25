package iterator;

import java.util.Iterator;

/**
 * 
 * <p>Description:晚餐餐厅的菜单</p>
 * @author ZhangShenao
 * @date 2017年4月13日
 */
public class DinerMenu implements Menu{
	/**
	 * 使用数组保存菜单项
	 */
	private MenuItem[] menuItems;
	
	/**
	 * 菜单项的最大数量
	 */
	public static final int MAX_ITEM_NUM = 6;
	
	/**
	 * 当前菜单项的索引
	 */
	private int menuItemIndex = 0;
	
	/**
	 * 构造晚餐餐厅的菜单
	 */
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEM_NUM];
		addItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
			addItem("BLT",
				"Bacon with lettuce & tomato on whole wheat", false, 2.99);
			addItem("Soup of the day",
				"Soup of the day, with a side of potato salad", false, 3.29);
			addItem("Hotdog",
				"A hot dog, with saurkraut, relish, onions, topped with cheese",
				false, 3.05);
			addItem("Steamed Veggies and Brown Rice",
				"Steamed vegetables over brown rice", true, 3.99);
			addItem("Pasta",
				"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
				true, 3.89);
	}
	
	/**
	 * 添加新的菜单项
	 */
	public void addItem(String name, String description, boolean vegetarian,
			double price){
		//判断是否还可以添加新的菜单项
		if (menuItemIndex < 0 || menuItemIndex >= MAX_ITEM_NUM){
			System.out.println("菜单项已达到最大数目,无法继续添加");
			return;
		}
		menuItems[menuItemIndex++] = new MenuItem(name, description, vegetarian, price);
	}
	
	/**
	 * 获取晚餐菜单的迭代器
	 */
	public Iterator<MenuItem> iterator() {
		return new DinerMenuIterator(menuItems);
	}

}
