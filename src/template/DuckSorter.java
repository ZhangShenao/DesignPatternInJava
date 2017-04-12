package template;

import java.util.Arrays;

/**
 * 
 * <p>Description:  Arrays.sort()方法,使用了广义的模板方法模式,对实现了Comparable接口的类进行排序,排序方式依赖具体的类</p>
 * @author ZhangShenao
 * @date 2017年4月12日 下午9:44:31
 */
public class DuckSorter {
	public static void main(String[] args) {
		Duck[] ducks = {new Duck("Daffy", 8),new Duck("Dewey", 2),
				new Duck("Howard",7), new Duck("Louie", 2),new Duck("Donald", 10)
				,new Duck("Huey", 2)};
		System.out.println("排序前");
		display(ducks);
		Arrays.sort(ducks, null);
		System.out.println("排序后");
		display(ducks);
	}
	
	private static void display(Duck[] ducks){
		if (null == ducks || ducks.length == 0){
			return;
		}
		for (Duck duck : ducks){
			System.out.println(duck);
		}
	}
}
