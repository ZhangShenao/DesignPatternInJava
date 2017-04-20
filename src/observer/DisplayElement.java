package observer;

/**
 * 
 * <p>Description: 消息公告板抽象父类，用于显示消息公告</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public abstract class DisplayElement implements Observer{
	/**
	 * 内部维护主题对象的引用
	 */
	protected Subject weatherData;
	
	/**
	 * 创建公告板实例,并将自己注册到主题对象中
	 */
	public DisplayElement(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	/**
	 * 显示消息公告
	 */
	protected abstract void display();
}
