package combining.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * <p>Description:Flock用来管理一组Duck,采用了组合模式,组合和叶子元素一样实现了相同的接口</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public class Flock implements Quackable{
	/**
	 * 内部维护一个Observable辅助类的实例
	 */
	private Observable observable;
	
	public Flock() {
		observable = new Observable(this);
	}

	/**
	 * 使用List维护该组内的所有Duck
	 */
	private List<Quackable> ducks = new ArrayList<>();
	
	/**
	 * 向该组内添加Duck
	 */
	public void addDuck(Quackable duck){
		ducks.add(duck);
	}
	
	
	@Override
	public void quack() {
		//让该组内的所有Duck进行quack行为
		//这里也采用了迭代器模式
		Iterator<Quackable> iterator = ducks.listIterator();
		while (iterator.hasNext()){
			iterator.next().quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		//为该组内的所有鸭子注册观察者
		for (Quackable duck : ducks){
			duck.registerObserver(observer);
		}
	}
	
	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
