package command;

/**
 * 
 * <p>Description:打开车库门的具体命令,实现Command接口</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class GarageDoorOpenCommand implements Command{
	/**
	 * 内部保存命令接收者实例
	 */
	private GarageDoor garageDoor;
	
	/**
	 * 在构造器中传入命令的接收者
	 */
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		//调用命令接收者的具体行为执行命令
		garageDoor.open();
	}

}
