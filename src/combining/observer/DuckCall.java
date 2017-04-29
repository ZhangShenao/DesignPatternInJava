package combining.observer;

/**
 * 
 * <p>Description:  鸭鸣器</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:55:58
 */
public class DuckCall implements Quackable{
	/**
	 * 内部维护一个Observable辅助类的实例
	 */
	private Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		//鸭鸣器模仿鸭子的叫声
		System.out.println("Kwak");
		
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
		return "DuckCall";
	}
}
