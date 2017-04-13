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
		addMenuItem("薄煎饼早餐", "薄煎饼,清蛋和吐司", true, 2.99);
		addMenuItem("薄煎饼早餐例餐", "薄煎饼带煎蛋,香肠", false, 2.99);
		addMenuItem("蓝莓薄煎饼", "新鲜蓝莓和蓝莓糖浆做成的薄煎饼", true, 3.49);
		addMenuItem("松饼", "松饼,可以选择蓝莓和草莓", true, 3.59);
	}
	
	/**
	 * 添加新的菜单项
	 */
	public void addMenuItem(String name, String description, boolean vegetarian,
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
