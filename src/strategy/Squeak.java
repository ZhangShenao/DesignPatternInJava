package strategy;

/**
 * 
 * <p>Description:具体的鸣叫行为，吱吱叫</p>
 * @author ZhangShenao
 * @date 2017年4月7日
 */
public class Squeak implements IQuackBehavior{

	@Override
	public void bark() {
		System.out.println("吱吱叫");
	}
}
