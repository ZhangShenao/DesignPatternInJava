package command;

/**
 * 
 * <p>Description:遥控器类,命令的调用者。</p>
 * <p>使用多个插槽保存不同的命令,当按钮按下时,执行响应的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class RemoteController {
	/**
	 * 遥控器的插槽数
	 */
	public static final int SLOT_NUM = 7;
	
	/**
	 * 保存所有开启的命令
	 */
	private Command[] onCommands = new Command[SLOT_NUM];
	
	/**
	 * 保存所有关闭的命令
	 */
	private Command[] offCommands = new Command[SLOT_NUM];
	
	/**
	 * 保存上一次执行的命令,便于撤销
	 */
	private Command undoCommand = new NoCommand();
	
	/**
	 * 使用空命令对象初始化遥控器
	 */
	public RemoteController(){
		for (int i = 0;i < SLOT_NUM;i++){
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	
	/**
	 * 设置指定插槽上的开启和关闭命令
	 * @param slot 插槽号
	 * @param onCommand 开启命令
	 * @param offCommand 关闭命令
	 */
	public void setCommand(int slot,Command onCommand,Command offCommand){
		checkSlot(slot);
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	/**
	 * 校验插槽编号
	 */
	private void checkSlot(int slot){
		if (slot < 0 || slot >= SLOT_NUM){
			throw new IllegalArgumentException("插槽编号错误:slot= " + slot);
		}
	}
	
	/**
	 * 按下编号为slot的插槽的开启按钮,执行开启命令
	 */
	public void onButtonWasPushed(int slot){
		checkSlot(slot);
		onCommands[slot].execute();
		
		//设置撤销命令
		undoCommand = onCommands[slot];
	}
	
	/**
	 * 按下编号为slot的插槽的关闭按钮,执行开启命令
	 */
	public void offButtonWasPushed(int slot){
		checkSlot(slot);
		offCommands[slot].execute();
		
		//设置撤销命令
		undoCommand = offCommands[slot];
	}
	
	/**
	 * 按下编号为slot的插槽的撤销按钮,执行开启命令
	 */
	public void undoButtonWasPushed(){
		undoCommand.undo();
		undoCommand = new NoCommand();
		
	}
	
	/**
	 * 打印遥控器每个插槽的命令信息
	 */
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
