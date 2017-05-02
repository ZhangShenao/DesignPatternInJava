package mvc;

/**
 * 
 * <p>Description:节拍观察者接口,在每个节拍都会收到通知</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public interface BeatObserver {
	/**
	 * 更新节拍
	 */
	public void updateBeat();
}
