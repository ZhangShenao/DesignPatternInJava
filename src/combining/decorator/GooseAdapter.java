package combining.decorator;

/**
 * 
 * <p>Description:  Goose类的适配器,将Goose类转换为Quackable接口</p>
 * <p>适配器类要实现目标接口</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午8:06:27
 */
public class GooseAdapter implements Quackable{
	private Goose goose;
	
	/**
	 * 在构造器中传入被适配的对象
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		//委托被适配的对象实现目标方法
		goose.honk();
	}

}
