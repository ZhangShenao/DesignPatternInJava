package jdkobserver;

import java.util.Observable;

/**
 * 
 * <p>Description:气象预测公告板</p>
 * @author ZhangShenao
 * @date 2017年4月20日
 */
public class ForecastDisplay extends DisplayElement{
	private float currentPressure = 29.92f;  //当前气压
	private float lastPressure;		//上一次观测到的气压
	
	public ForecastDisplay(Observable weatherData) {
		super(weatherData);
	}
	

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object obj) {
		if (obj instanceof WeatherMessage){
			WeatherMessage weatherMessage = (WeatherMessage)obj;
			lastPressure = currentPressure;
			currentPressure = weatherMessage.getPressure();
			display();
		}else {
			throw new RuntimeException("Message类型不正确");
		}
	}

}
