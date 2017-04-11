package command;

/**
 * 
 * <p>Description:遥控器类</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class RemoteController {
	/**
	 * 保存开启的命令
	 */
	private Command[] onCommands;
	
	/**
	 * 保存关闭的命令
	 */
	private Command[] offCommands;
	
	/**
	 * 初始化遥控器
	 * @param slotNum 插槽数
	 */
	public RemoteController(int slotNum){
		//采用空对象,初始化遥控器
		Command noCommand = new NoCommand();
		onCommands = new Command[slotNum];
		offCommands = new Command[slotNum];
		for (int i = 0;i < slotNum;i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	/**
	 * 设置第slot个插槽的开启和关闭命令
	 */
	public void setCommand(int slot,Command onCommand,Command offCommand){
		if (slot < 0 || slot >= onCommands.length || slot >= offCommands.length){
			throw new IllegalArgumentException();
		}
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	/**
	 * 按下第slot个插槽的开启按钮,执行开启命令
	 */
	public void onButtonPressed(int slot){
		onCommands[slot].execute();
	}
	
	/**
	 * 按下第slot个插槽的关闭按钮,执行关闭命令
	 */
	public void offButtonPressed(int slot){
		offCommands[slot].execute();
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("\n-----------Remote Control------------\n");
		for (int i = 0,len = onCommands.length;i < len;i++){
			buffer.append("[slot " + i + "]" + onCommands[i].getClass().getSimpleName() + " " + offCommands[i].getClass().getSimpleName());
		}
		return buffer.toString();
	}
	
}
