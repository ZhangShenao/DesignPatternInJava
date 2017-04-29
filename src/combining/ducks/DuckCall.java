package combining.ducks;

/**
 * 
 * <p>Description:  鸭鸣器</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:55:58
 */
public class DuckCall implements Quackable{

	@Override
	public void quack() {
		//鸭鸣器模仿鸭子的叫声
		System.out.println("Kwak");
	}

}
