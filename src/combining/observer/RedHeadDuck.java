package combining.observer;

/**
 * 
 * <p>Description:  稀有的红头鸭</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:55:58
 */
public class RedHeadDuck implements Quackable{
	/**
	 * 内部维护一个Observable辅助类的实例
	 */
	private Observable observable;
	
	public RedHeadDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Quack");
		
		//鸭子quack叫时,通知观察者
		notifyObservers();
	}
	
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
		return "RedHeadDuck";
	}

}
