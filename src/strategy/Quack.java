package strategy;

/**
 * 
 * <p>Description:具体的鸣叫行为，呱呱叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class Quack implements IQuackBehavior{

	@Override
	public void bark() {
		System.out.println("呱呱叫");
	}

}
