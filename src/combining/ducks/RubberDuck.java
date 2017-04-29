package combining.ducks;

/**
 * 
 * <p>Description:  橡皮鸭</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:55:58
 */
public class RubberDuck implements Quackable{

	@Override
	public void quack() {
		//橡皮鸭的叫声是吱吱叫
		System.out.println("Squeak");
	}

}
