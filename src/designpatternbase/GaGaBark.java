package designpatternbase;

/**
 * 
 * <p>Description:具体的鸣叫行为，嘎嘎叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class GaGaBark implements IBarkBehavior{

	@Override
	public void bark() {
		System.out.println("嘎嘎叫");
	}

}
