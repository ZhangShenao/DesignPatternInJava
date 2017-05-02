package mvc;

/**
 * 
 * <p>Description:BPM观察者接口,在BPM发生改变时收到通知</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public interface BPMObserver {
	/**
	 * 更新BPM
	 */
	public void updateBPM();
}	
