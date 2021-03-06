package command;

/**
 * 
 * <p>Description:关闭电灯的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class LightOffCommand implements Command{
	/**
	 * 绑定命令的接收者
	 */
	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		//撤销命令,打开电灯
		light.on();
	}
}
