package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * <p>Description:咖啡店菜单</p>
 * @author ZhangShenao
 * @date 2017年4月25日
 */
public class CafeMenu implements Menu{
	/**
	 * 使用Map保存菜单项
	 */
	private Map<String,MenuItem> menuItems;
	
	/**
	 * 构造咖啡厅菜单
	 */
	public CafeMenu() {
		menuItems = new HashMap<>();
		addItem("Veggie Burger and Air Fries",
			"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
			true, 3.99);
		addItem("Soup of the day",
			"A cup of the soup of the day, with a side salad",
			false, 3.69);
		addItem("Burrito",
			"A large burrito, with whole pinto beans, salsa, guacamole",
			true, 4.29);
	}
	
	/**
	 * 添加菜单项
	 */
	public void addItem(String name, String description, 
            boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	
	@Override
	public Iterator<MenuItem> iterator() {
		//直接返回Map值集合的迭代器
		return menuItems.values().iterator();
	}

}
