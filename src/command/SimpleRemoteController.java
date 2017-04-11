package command;

/**
 * 
 * <p>Description:遥控器类,命令模式的调用者</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class SimpleRemoteController {
	/**
	 * 内部保存命令的插槽
	 */
	private Command slot;

	public SimpleRemoteController() {
	}
	
	/**
	 * 将命令传入
	 */
	public void setCommand(Command slot){
		this.slot = slot;
	}
	
	/**
	 * 当按下遥控器按钮时,执行命令
	 */
	public void onButtonPressed(){
		slot.execute();
	}
}
