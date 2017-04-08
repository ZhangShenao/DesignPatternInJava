package observer;

/**
 * 
 * <p>Description: 观察者模式的主题接口,为一对多关系中一的一方,当内部状态发生改变时会通知所有注册的观察者</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public interface Subject {
	/**
	 * 注册一个观察者
	 */
	public void registerObserver(Observer o);
	
	/**
	 * 删除一个观察者
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 当状态变化时,通知所有观察者
	 */
	public void notifyAllObservers(Message msg);
}
