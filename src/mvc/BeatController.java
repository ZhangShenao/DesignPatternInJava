package mvc;
 
/**
 * 
 * <p>Description:节拍控制器</p>
 * @author ZhangShenao
 * @date 2017年5月2日
 */
public class BeatController implements ControllerInterface {
	//控制器持有视图和模型的引用
	private BeatModelInterface model;
	private DJView view;
   
	/**
	 * 创建控制器,并传入模型,由控制器创建视图
	 */
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}
	
	/**
	 * 用户点击界面的start按钮
	 */
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
	
	/**
	 * 用户点击界面的stop按钮
	 */
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	/**
	 * 用户点击界面的增大BPM按钮
	 */
	public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
	}
    
	/**
	 * 用户点击界面的减小BPM按钮
	 */
	public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
  	}
  
	/**
	 * 用户点击界面的获取BPM按钮
	 */
 	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
