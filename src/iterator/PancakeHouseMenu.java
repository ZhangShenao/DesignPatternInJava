package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * <p>Description: 煎饼屋的菜单实现</p>
 * @author ZhangShenao
 * @date 2017年4月13日
 */
public class PancakeHouseMenu implements Menu{
	/**
	 * 使用ArrayList保存菜单项
	 */
	private ArrayList<MenuItem> menuItems;
	
	/**
	 * 创建煎饼屋的菜单
	 */
	public PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
	 
			addItem("Regular Pancake Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
	 
			addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries, and blueberry syrup",
				true,
				3.49);
	 
			addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.59);
	}
	
	/**
	 * 添加新的菜单项
	 */
	public void addItem(String name, String description, boolean vegetarian,
			double price){
		menuItems.add(new MenuItem(name, description, vegetarian, price));
	}
	
	/**
	 * 获取煎饼屋菜单的迭代器
	 */
	public Iterator<MenuItem> iterator() {
		//直接返回ArrayList的迭代器
		return menuItems.iterator();
	}

}
