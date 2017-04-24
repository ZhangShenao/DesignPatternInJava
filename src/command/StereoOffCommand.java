package command;

/**
 * 
 * <p>Description:关闭音响的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		//撤销命令,打开音响
		stereo.on();
	}
}
