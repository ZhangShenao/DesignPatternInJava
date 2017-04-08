package jdkobserver;

/**
 * 
 * <p>Description: 天气信息</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class WeatherMessage implements Message{
	/**
	 * 温度
	 */
	private float temperature;
	
	/**
	 * 湿度
	 */
	private float humidity;
	
	/**
	 * 气压
	 */
	private float pressure;

	public WeatherMessage(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	
}
