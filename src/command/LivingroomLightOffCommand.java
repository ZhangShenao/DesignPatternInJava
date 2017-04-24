package command;

/**
 * 
 * <p>Description:关闭卧室灯的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class LivingroomLightOffCommand implements Command {
	private Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
	
	@Override
	public void undo() {
		//撤销命令,打开电灯
		light.on();
	}
}
