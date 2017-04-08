package jdkobserver;

import java.util.Observable;

/**
 * 
 * <p>Description: 使用JDK提供的观察者模式框架,继承Observable类实现一个主题(可观察者)</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class WeatherData extends Observable{
	/**
	 * 内部维护气象信息
	 */
	private WeatherMessage weatherMessage;
	
	/**
	 * 当天气信息变化时，通知所有观察者
	 */
	public void weatherChanged(float temperature,float humidity,float pressure){
		this.weatherMessage = new WeatherMessage(temperature, humidity, pressure);
		
		//设置为状态已修改,这样观察者会自动收到通知
		setChanged();
		
		//通知所有观察者,并将更新后的数据传递过去
		notifyObservers(weatherMessage);
	}
}
