package iterator;

import java.util.Iterator;

/**
 * 
 * <p>Description: 晚餐餐厅菜单的迭代器,实现Iterator接口</p>
 * @author ZhangShenao
 * @date 2017年4月13日
 */
public class DinerMenuIterator implements Iterator<MenuItem>{
	/**
	 * 使用数组保存菜单项
	 */
	private MenuItem[] menuItems;
	
	/**
	 * 当前菜单项的索引
	 */
	private int menuItemIndex = 0;
	
	/**
	 * 在构造器中传入待遍历的菜单项数组
	 */
	public DinerMenuIterator(MenuItem[] menuItems){
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		return menuItemIndex < menuItems.length && menuItems[menuItemIndex] != null;
	}

	@Override
	public MenuItem next() {
		return menuItems[menuItemIndex++];
	}

	@Override
	public void remove() {
		if (menuItemIndex <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (menuItems[menuItemIndex - 1] != null) {
			for (int i = menuItemIndex - 1; i < (menuItems.length - 1); i++) {
				menuItems[i] = menuItems[i + 1];
			}
			menuItems[menuItems.length - 1] = null;
		}
	}

}
