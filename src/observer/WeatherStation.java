package observer;

/**
 * 
 * <p>Description:气象站,使用观察者模式,WeatherData为主题类,具体的公告板为观察者,当WeatherData内部的天气数据发生变化时会通知所有的公告板</p>
 * <p>观察者模式:定义了对象之间的一对多依赖,当一个对象的状态发生改变时,它的所有依赖者都会收到通知并自动更新</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class WeatherStation {
	public static void main(String[] args) {
		//创建主题类(天气信息类)
		WeatherData weatherData = new WeatherData();
		
		//创建具体的观察者
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		//更新天气信息,观察者会立即收到通知并自动更新
		weatherData.measurementsChanged(23.0F, 100.0F, 98.1F);
		weatherData.measurementsChanged(22.5F, 101.9F, 232.2F);
		weatherData.measurementsChanged(21.6F, 106.8F, 98.3F);
	}
}
