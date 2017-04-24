package command;

/**
 * 
 * <p>Description:打开卧室灯的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		//撤销命令,关闭电灯
		light.off();
	}
}
