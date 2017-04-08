package observer;

/**
 * 
 * <p>Description:显示湿度的公告板</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class HumidityBoard implements Observer,MessageBoard{
	/**
	 * 当前湿度信息
	 */
	private float humidity;
	
	/**
	 * 维护主题对象
	 */
	private Subject weatherData;
	
	@Override
	public void display() {
		//显示湿度信息
		System.err.println("当前湿度: " + humidity);
	}

	@Override
	public void update(Message msg) {
		if (msg instanceof WeatherMessage){
			//获取更新的湿度信息
			WeatherMessage  weatherMessage = (WeatherMessage)msg;
			this.humidity = weatherMessage.getHumidity();
			
			//显示湿度信息
			display();
		}
	}
	
	/**
	 * 在构造器中传入具体的主题对象，并将当前观察者对象注册到主题上
	 */
	public HumidityBoard(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
}
