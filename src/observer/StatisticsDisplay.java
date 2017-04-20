package observer;

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
	
	public StatisticsDisplay(Subject weatherData) {
		super(weatherData);
	}

	@Override
	public void update(Message msg) {
		if (msg instanceof WeatherMessage){
			WeatherMessage weatherMessage = (WeatherMessage)msg;
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
		}else {
			throw new RuntimeException("Message类型不正确");
		}
	}

	@Override
	public void display() {
		System.err.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

}
