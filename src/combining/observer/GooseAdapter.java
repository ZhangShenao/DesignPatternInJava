package combining.observer;

/**
 * 
 * <p>Description:  Goose类的适配器,将Goose类转换为Quackable接口</p>
 * <p>适配器类要实现目标接口</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午8:06:27
 */
public class GooseAdapter implements Quackable{
	/**
	 * 内部维护一个Observable辅助类的实例
	 */
	private Observable observable;
	
	public GooseAdapter() {
		observable = new Observable(this);
	}
	
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
		
		//鸭子quack叫时,通知观察者
		notifyObservers();
	}
	
	//将所有主题的行为委托给辅助类的实例进行
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		return "GooseAdapter";
	}

}
