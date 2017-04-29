package combining.observer;

/**
 * 
 * <p>Description:主题(可观察者接口)</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public interface QuackObservable {
	/**
	 * 注册观察者
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * 通知所有观察者
	 */
	public void notifyObservers();
}
