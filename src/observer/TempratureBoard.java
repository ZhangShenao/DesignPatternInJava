package observer;

/**
 * 
 * <p>Description:显示温度的公告板</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class TempratureBoard implements Observer,MessageBoard{
	/**
	 * 当前温度信息
	 */
	private float temperature;
	
	/**
	 * 维护主题对象
	 */
	private Subject weatherData;
	
	@Override
	public void display() {
		//显示温度信息
		System.err.println("当前温度: " + temperature);
	}

	@Override
	public void update(Message msg) {
		if (msg instanceof WeatherMessage){
			//获取更新的温度信息
			WeatherMessage  weatherMessage = (WeatherMessage)msg;
			this.temperature = weatherMessage.getTemperature();
			
			//显示温度信息
			display();
		}
	}
	
	/**
	 * 在构造器中传入具体的主题对象，并将当前观察者对象注册到主题上
	 */
	public TempratureBoard(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
}
