package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * <p>Description: 餐厅女服务员,可以展示餐厅所有的菜单</p>
 * <p>迭代器模式,提供一中方法顺序访问一个聚合对象中的各个元素,而又不暴露其内部的实现</p>
 * @author ZhangShenao
 * @date 2017年4月13日
 */
public class Waitress {
	/**
	 * 保存餐厅的所有餐单
	 */
	private List<Menu> allMenus = new ArrayList<>();
	
	public Waitress(Menu... menus){
		for (Menu menu : menus){
			allMenus.add(menu);
		}
	}
	
	/**
	 * 添加餐单
	 */
	public void addMenus(Menu ... menus){
		for (Menu menu : menus){
			allMenus.add(menu);
		}
	}
	
	/**
	 * 展示所有的餐单
	 */
	public void displayMenus(){
		for (Menu menu : allMenus){
			//使用迭代器模式,遍历所有菜单
			Iterator<MenuItem> iterator = menu.iterator();
			while (iterator.hasNext()){
				MenuItem next = iterator.next();
				System.out.println(next);
			}
		}
	}
	
	public static void main(String[] args) {
		Waitress waitress = new Waitress();
		waitress.addMenus(new PancakeHouseMenu(),new DinerMenu());
		waitress.displayMenus();
	}
}
