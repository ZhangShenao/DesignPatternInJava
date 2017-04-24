package adapter;

/**
 * 
 * <p>Description:适配器模式,将已有的接口转换成客户期望的另外一个接口。适配器让原本接口互不相容的类可以合作无间(对象适配器)</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class AdapterClient {
	public static void main(String[] args) {
		//创建真实的鸭子对象,是客户端需要的
		System.out.println("-----------------------------------");
		System.out.println("真实的鸭子");
		Duck realDuck = new RealDuck();
		realDuck.fly();
		realDuck.quack();
		
		//创建真实的火鸡对象
		System.out.println("-----------------------------------");
		System.out.println("真实的火鸡");
		Turcky realTurcky = new RealTurcky();
		realTurcky.fly();
		realTurcky.gobble();
		
		//创建火鸡适配器,将火鸡对象转换成鸭子对象,以满足客户的需要,客户并不知道他到底是鸭子还是火鸡
		System.out.println("-----------------------------------");
		System.out.println("火鸡的适配器");
		Duck turckyAdapter = new TurckyAdapter(realTurcky);
		turckyAdapter.fly();
		turckyAdapter.quack();
	}
}
