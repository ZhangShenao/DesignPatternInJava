package command;

/**
 * 
 * <p>Description:播放音响的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
 
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
	
	@Override
	public void undo() {
		//撤销命令,关闭音响
		stereo.off();
	}
}
