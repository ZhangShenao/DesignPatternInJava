package jdkobserver;

import java.util.Observable;

/**
 * 
 * <p>Description:显示当前天气状况的公告板</p>
 * @author ZhangShenao
 * @date 2017年4月20日
 */
public class CurrentConditionsDisplay extends DisplayElement{
	private float temperature;	//温度
	private float humidity;		//湿度
	
	public CurrentConditionsDisplay(Observable weatherData) {
		super(weatherData);
	}

	@Override
	public void display() {
		System.err.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object obj) {
		if (obj instanceof WeatherMessage){
			WeatherMessage weatherMessage = (WeatherMessage)obj;
			this.temperature = weatherMessage.getTemperature();
			this.humidity = weatherMessage.getHumidity();
			display();
		}else {
			throw new RuntimeException("Message类型不正确");
		}
	}

}
