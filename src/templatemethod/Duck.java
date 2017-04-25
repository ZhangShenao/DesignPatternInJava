package templatemethod;

/**
 * 
 * <p>Description:  鸭子类,实现了Comparable,使用weight属性进行排序</p>
 * @author ZhangShenao
 * @date 2017年4月12日 下午9:41:44
 */
public class Duck implements Comparable<Duck>{
	/**
	 * 鸭子的姓名
	 */
	private String name;
	
	/**
	 * 鸭子的体重
	 */
	private double weight;
	
	public Duck(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Duck o) {
		return (weight > o.weight)? 1 : ((weight == o.weight) ? 0 : -1);
	}

}
