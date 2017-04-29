package combining.decorator;

/**
 * 
 * <p>Description:  稀有的红头鸭</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:55:58
 */
public class RedHeadDuck implements Quackable{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
