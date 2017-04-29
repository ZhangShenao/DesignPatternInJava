package combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * 
 * <p>Description:处理主题(可观察者)的辅助类</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public class Observable implements QuackObservable {
	/**
	 * 使用ArrayList保存所有观察者
	 */
	private ArrayList<Observer> observers = new ArrayList<>();
	
	/**
	 * 被观察的对象
	 */
	private QuackObservable duck;
	
	/**
	 * 在构造器中传入被观察的对象
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			
			//通知观察者是哪个Duck在quack
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
