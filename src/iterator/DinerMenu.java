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
		addMenuItem("素食BLT", "培根、生菜、西红柿和面包", false, 2.99);
		addMenuItem("BLT", "培根、生菜和西红柿", false, 2.59);
		addMenuItem("例汤", "一碗例汤配土豆沙拉", true, 1.99);
		addMenuItem("热狗", "热狗、酸菜和土豆芝士", false, 3.99);
		addMenuItem("清蒸时蔬加糙米", "清蒸的时蔬配糙米", true, 1.59);
	}
	
	/**
	 * 添加新的菜单项
	 */
	public void addMenuItem(String name, String description, boolean vegetarian,
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
