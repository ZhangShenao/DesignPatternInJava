package combining.observer;

/**
 * 
 * <p>Description:  橡皮鸭</p>
 * @author ZhangShenao
 * @date 2017年4月29日 上午7:55:58
 */
public class RubberDuck implements Quackable{
private Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		//橡皮鸭的叫声是吱吱叫
		System.out.println("Squeak");
		
		//鸭子quack叫时,通知观察者
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		return "RubberDuck";
	}

}
