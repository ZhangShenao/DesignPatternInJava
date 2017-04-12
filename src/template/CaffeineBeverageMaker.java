package template;

/**
 * 
 * <p>Description:  使用模板方法模式,冲泡咖啡因饮料</p>
 * <p>模板方法模式,在一个类中定义一个算法的骨架,将其中的某些步骤延迟到子类中实现。
 * 模板方法模式使得子类可以在不改变算法结构的情况下,重新定义算法中的某些步骤</p>
 * @author ZhangShenao
 * @date 2017年4月12日 下午8:46:04
 */
public class CaffeineBeverageMaker {
	public static void main(String[] args) {
		//冲泡茶叶
		/*CaffeineBeverge tea = new Tea();
		tea.prepareRecipe();*/
		
		//冲泡咖啡
		CaffeineBeverge coffee = new Coffee();
		coffee.prepareRecipe();
	}
}
