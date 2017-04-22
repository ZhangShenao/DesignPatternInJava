package abstractfactory;

/**
 * 
 * <p>Description: 生产Pizza原料的抽象工厂接口,用于创建一个产品族,由具体的工厂决定创建哪个产品族。
 * 工厂的每个方法用于创建产品族中的一个产品 </p>
 * @author ZhangShenao
 * @date 2017年4月22日 上午7:45:15
 */
public interface PizzaIngredientFactory {
	/**
	 * 生产面团
	 */
	public Dough createDough();
	
	/**
	 * 生产酱料
	 */
	public Sauce createSauce();
	
	/**
	 * 生产芝士
	 */
	public Cheese createCheese();
	
	/**
	 * 生产蔬菜
	 */
	public Veggies[] createVeggies();
	
	/**
	 * 生产香肠
	 */
	public Pepperoni createPepperoni();
	
	/**
	 * 生产蛤蜊
	 */
	public Clams createClam();
 
}
