package jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 * <p>Description:显示气压的公告板</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class PressureBoard implements Observer,MessageBoard{
	/**
	 * 当前气压信息
	 */
	private float pressure;
	
	/**
	 * 维护主题对象
	 */
	private Observable weatherData;
	
	@Override
	public void display() {
		//显示气压信息
		System.err.println("当前气压: " + pressure);
	}

	/**
	 * 在构造器中传入具体的主题对象，并将当前观察者对象注册到主题上
	 */
	public PressureBoard(Observable weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof WeatherMessage){
			//获取更新的气压信息
			WeatherMessage  weatherMessage = (WeatherMessage)arg;
			this.pressure = weatherMessage.getPressure();
			
			//显示气压信息
			display();
		}
	}
	
}
