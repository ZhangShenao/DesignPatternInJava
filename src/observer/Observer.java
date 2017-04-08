package observer;

/**
 * 
 * <p>Description: 观察者模式的观察者接口,所有具体的观察者都要实现此接口,主题类面向观察者接口编程</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public interface Observer {
	/**
	 * 当主题数据改变时,观察者更新自身数据
	 */
	public void update(Message msg);
}
