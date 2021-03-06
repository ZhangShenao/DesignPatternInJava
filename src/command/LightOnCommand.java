package command;

/**
 * 
 * <p>Description:打开电灯的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class LightOnCommand implements Command{
	/**
	 * 绑定命令的接收者
	 */
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		//撤销命令,关闭电灯
		light.off();
	}
}
