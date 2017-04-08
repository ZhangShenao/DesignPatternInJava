package jdkobserver;

import java.util.Observer;

/**
 * 
 * <p>Description:使用JDK内置的观察者框架,Observer为观察者,Observable为可观察者(主题)</p>
 * <p>Observable是一个类,并没有实现接口,因此无法自定义实现</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class WeatherStation {
	public static void main(String[] args) {
		//创建主题类(天气信息类)
		WeatherData weatherData = new WeatherData();
		
		//创建具体的观察者
		Observer temperatureBoard = new TempratureBoard(weatherData);
		Observer humidityBoard = new HumidityBoard(weatherData);
		Observer pressureBoard = new PressureBoard(weatherData);
		
//		System.out.println("观察者数量: " + weatherData.countObservers());
		
		//更新天气信息,观察者会立即收到通知并自动更新
		weatherData.weatherChanged(23.0F, 100.0F, 98.1F);
		weatherData.weatherChanged(22.5F, 101.9F, 232.2F);
		weatherData.weatherChanged(21.6F, 106.8F, 98.3F);
	}
}
