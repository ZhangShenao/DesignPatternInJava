package mvc;

/**
 * 
 * <p>Description:HeartModel模型的接口,用于保存心跳的信息</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public interface HeartModelInterface {
	/**
	 * 获取当前心率
	 */
	int getHeartRate();
	
	/**
	 * 注册BeatObserver
	 */
	void registerObserver(BeatObserver o);
	
	/**
	 * 删除BeatObserver
	 */
	void removeObserver(BeatObserver o);
	
	/**
	 * 注册BPMObserver
	 */
	void registerObserver(BPMObserver o);
	
	/**
	 * 删除BPMObserver
	 */
	void removeObserver(BPMObserver o);
}
