package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <p>Description: 气象信息，实现主题接口，当气象信息发生改变时，通知所有公告板进行更新</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class WeatherData implements Subject{
	/**
	 * 内部维护气象信息
	 */
	private WeatherMessage weatherMessage;
	
	/**
	 * 保存所有注册的观察者
	 */
	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void registerObserver(Observer o) {
		if (null != o){
			observers.add(o);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyAllObservers(Message msg) {
		if (null != observers && observers.size() > 0){
			for (Observer observer : observers){
				observer.update(msg);
			}
		}
	}
	
	/**
	 * 观测到的气象信息发生变化时，通知所有观察者
	 */
	public void measurementsChanged(float temperature,float humidity,float pressure){
		this.weatherMessage = new WeatherMessage(temperature, humidity, pressure);
		notifyAllObservers(weatherMessage);
	}
}
