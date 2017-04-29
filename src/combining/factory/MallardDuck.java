package combining.factory;

/**
 * 
 * <p>Description:  标准的绿头鸭</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:55:58
 */
public class MallardDuck implements Quackable{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
