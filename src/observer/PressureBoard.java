package observer;

/**
 * 
 * <p>Description:显示气压的公告板</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class PressureBoard implements Observer,MessageBoard{
	/**
	 * 当前气压信息
	 */
	private float pressure;
	
	/**
	 * 维护主题对象
	 */
	private Subject weatherData;
	
	@Override
	public void display() {
		//显示气压信息
		System.err.println("当前气压: " + pressure);
	}

	@Override
	public void update(Message msg) {
		if (msg instanceof WeatherMessage){
			//获取更新的气压信息
			WeatherMessage  weatherMessage = (WeatherMessage)msg;
			this.pressure = weatherMessage.getPressure();
			
			//显示气压信息
			display();
		}
	}
	
	/**
	 * 在构造器中传入具体的主题对象，并将当前观察者对象注册到主题上
	 */
	public PressureBoard(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
}
