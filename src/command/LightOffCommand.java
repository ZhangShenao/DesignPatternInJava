package command;

/**
 * 
 * <p>Description: 关闭电灯的具体命令,实现Command接口</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class LightOffCommand implements Command{
	/**
	 * 内部保存命令接收者实例
	 */
	private Light light;
	
	/**
	 * 在构造器中传入命令的接收者
	 */
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		//调用接收者的具体行为,执行命令
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}