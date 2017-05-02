package mvc;

/**
 * 
 * <p>Description:BeatModel节拍器的接口,主要工作是控制节拍</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public interface BeatModelInterface {
	/**
	 * BeatModel被初始化后调用
	 */
	public void initialize();
	
	/**
	 * 打开节拍器
	 */
	public void on();
	
	/**
	 * 关闭 节拍器
	 */
	public void off();
	
	/**
	 * 设定BPM
	 */
	public void setBPM(int bpm);
	
	/**
	 * 获取当前BPM值,返回0表示节拍器处于关闭状态
	 */
	public int getBPM();
	
	//有两种观察者:BeatObserver会在每个节拍都收到通知,BPMObserver只会在BPM改变时收到通知
	
	/**
	 * 注册BeanObserver
	 */
	public void registerObserver(BeatObserver o);
	
	/**
	 * 删除BeanObserver
	 */
	public void removeObserver(BeatObserver o);
	
	/**
	 * 注册BPMObserver
	 */
	public void registerObserver(BPMObserver o);
	
	/**
	 * 删除BPMObserver
	 */
	public void removeObserver(BPMObserver o);
}
