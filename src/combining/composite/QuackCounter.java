package combining.composite;

/**
 * 
 * <p>Description:Quack接口的装饰者,用于增加记录quack次数的行为</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public class QuackCounter implements Quackable{
	/**
	 * 记录总共的quack次数
	 */
	private static int count = 0;
	
	/**
	 * 被装饰的对象
	 */
	private Quackable duck;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		//委托被装饰的对象实现quack行为,并增加计数行为
		duck.quack();
		++count;
	}
	
	/**
	 * 获取总共的quack次数
	 */
	public static int getQuackCount(){
		return count;
	}
}
