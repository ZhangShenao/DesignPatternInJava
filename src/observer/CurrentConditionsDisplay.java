package observer;

/**
 * 
 * <p>Description:显示当前天气状况的公告板</p>
 * @author ZhangShenao
 * @date 2017年4月20日
 */
public class CurrentConditionsDisplay extends DisplayElement{
	/**
	 * 温度
	 */
	private float temperature;
	
	/**
	 * 湿度
	 */
	private float humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		super(weatherData);
	}

	@Override
	public void display() {
		System.err.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Message msg) {
		if (msg instanceof WeatherMessage){
			WeatherMessage weatherMessage = (WeatherMessage)msg;
			this.temperature = weatherMessage.getTemperature();
			this.humidity = weatherMessage.getHumidity();
			display();
		}else {
			throw new RuntimeException("Message类型不正确");
		}
	}

}
