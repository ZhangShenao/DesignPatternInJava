package jdkobserver;

import java.util.Observable;
import java.util.Observer;


/**
 * 
 * <p>Description: 消息公告板抽象父类，用于显示消息公告</p>
 * <p>使用JDK内置的观察者模式框架,观察者实现类实现Observer接口</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public abstract class DisplayElement implements Observer{
	/**
	 * 内部维护主题对象的引用
	 */
	protected Observable weatherData;
	
	/**
	 * 创建公告板实例,并将自己注册到主题对象中
	 */
	public DisplayElement(Observable weatherData){
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	/**
	 * 显示消息公告
	 */
	protected abstract void display();
}
