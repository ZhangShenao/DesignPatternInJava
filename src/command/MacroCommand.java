package command;

/**
 * 
 * <p>Description:宏命令,可以进行多个命令的批量执行</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class MacroCommand implements Command{
	/**
	 * 保存所有待执行的命令
	 */
	private Command[] commands;
	
	/**
	 * 在构造器中传入待执行的命令
	 * @param commands
	 */
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		if (null == commands || commands.length == 0){
			return;
		}
		//执行全部命令
		for (Command command : commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		if (null == commands || commands.length == 0){
			return;
		}
		//撤销全部命令
		for (Command command : commands) {
			command.undo();
		}
	}

}
