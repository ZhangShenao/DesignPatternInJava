package designpatternbase;

/**
 * 
 * <p>Description:具体的鸣叫行为，吱吱叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class ZhiZhiBark implements IBarkBehavior{

	@Override
	public void bark() {
		System.out.println("吱吱叫");
	}

}
