package combining.observer;

/**
 * 
 * <p>Description:鸭子科学家,具体的观察者</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
