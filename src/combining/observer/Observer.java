package combining.observer;

/**
 * 
 * <p>Description:观察者接口,负责观察QuackObservable这一主题的变化情况</p>
 * @author ZhangShenao
 * @date 2017年4月29日
 */
public interface Observer {
	public void update(QuackObservable duck);
}
