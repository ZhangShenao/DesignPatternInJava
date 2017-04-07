package designpatternbase;

/**
 * 
 * <p>Description:具体的鸣叫行为，不会叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class BarkNoWay implements IBarkBehavior{

	@Override
	public void bark() {
		System.out.println("不会叫");
	}

}
