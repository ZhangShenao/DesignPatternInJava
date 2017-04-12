package template;

/**
 * 
 * <p>Description: 模板方法的抽象父类 </p>
 * @author ZhangShenao
 * @date 2017年4月12日 下午8:31:22
 */
public abstract class CaffeineBeverge {
	/**
	 * 冲泡咖啡因饮料
	 * 模板方法,在父类中定义了一个算法框架,其中某些具体的步骤由子类去实现
	 */
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()){
			addCondiments();
		}
	}
	/**
	 * 将水煮沸
	 * 所有子类都要复用的方法,在抽象父类中定义,并阻止子类重写
	 */
	private final void boilWater(){
		System.out.println("将水煮沸");
	}
	
	/**
	 * 将泡好的饮料倒进杯子中
	 * 所有子类都要复用的方法,在抽象父类中定义,并阻止子类重写
	 */
	private final void pourInCup(){
		System.out.println("将准备好的饮料倒进杯子中");
	}
	
	/**
	 * 浸泡
	 * 抽象方法,交给具体的子类去重写
	 */
	protected abstract void brew();
	
	/**
	 * 放入调料
	 * 抽象方法,交给具体的子类去重写
	 */
	protected abstract void addCondiments();
	
	/**
	 * 客户是否要加调料
	 * 钩子方法,在抽象父类中提供默认的实现,由子类决定要不要重写
	 * 当模板方法的算法中的某个部分是可选的时,可以使用钩子
	 */
	protected boolean customerWantsCondiments(){
		return true;
	}
}
