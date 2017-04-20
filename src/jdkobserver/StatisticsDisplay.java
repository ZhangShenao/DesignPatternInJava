package jdkobserver;

import java.util.Observable;

/**
 * 
 * <p>Description:气象统计布告板</p>
 * @author ZhangShenao
 * @date 2017年4月20日
 */
public class StatisticsDisplay extends DisplayElement{
	private float maxTemp = 0.0f;	//最高温度
	private float minTemp = 200;	//最低温度
	private float tempSum= 0.0f;	//温度总和
	private int numReadings = 0;		//记录的温度数
	
	public StatisticsDisplay(Observable weatherData) {
		super(weatherData);
	}

	
	@Override
	public void display() {
		System.err.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void update(Observable o, Object obj) {
		if (obj instanceof WeatherMessage){
			WeatherMessage weatherMessage = (WeatherMessage)obj;
			float temperature = weatherMessage.getTemperature();
			++numReadings;
			tempSum += temperature;
			if (temperature > maxTemp){
				maxTemp = temperature;
			}
			if (temperature < minTemp){
				minTemp = temperature;
			}
			display();
		}
	}

}
