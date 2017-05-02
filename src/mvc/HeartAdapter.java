package mvc;

/**
 * 
 * <p>Description:HeartModelInterface接口的适配器,将HeartModelInterface接口转化为BeatModelInterface接口</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public class HeartAdapter implements BeatModelInterface {
	/**
	 * 被适配的对象
	 */
	private HeartModelInterface heart;
	
	/**
	 * 在构造器中传入被适配的对象
	 */
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}
	
    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
	public int getBPM() {
		return heart.getHeartRate();
	}
  
    public void setBPM(int bpm) {}
   
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}
    
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}
     
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}
  
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}
}
