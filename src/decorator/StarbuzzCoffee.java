package decorator;

/**
 * 
 * <p>Description:装饰者设计模式,动态地将责任附加到对象身上,若要扩展 功能,装饰者提供了比继承更有弹性的替代方案</p>
 * <p>装饰者可以在被装饰者行为的前/后增加新的行为,实现扩展</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		//创建一杯普通的浓缩咖啡
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription());
		System.out.println(espresso.getCost());
		
		//创建一杯综合咖啡
		Beverage beverage = new HouseBlend();
		
		//加摩卡
		beverage = new Mocha("Mocha",beverage,0.2);
		
		//加牛奶
		beverage = new Milk("Milk",beverage,0.3);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.getCost());
	}
}
