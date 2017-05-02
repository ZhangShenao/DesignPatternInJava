package mvc;

/**
 * 
 * <p>Description:控制器接口,对视图来说,控制器是策略</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public interface ControllerInterface {
	/**
	 * 开启节拍器
	 */
	public void start();
	
	/**
	 * 关闭节拍器
	 */
	public void stop();
	
	/**
	 * 增加BPM
	 */
	public void increaseBPM();
	
	/**
	 * 减小BPM
	 */
	public void decreaseBPM();
	
	/**
	 * 设定BPM的值
	 */
	public void setBPM(int bpm);
}
