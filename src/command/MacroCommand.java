package command;

/**
 * 
 * <p>Description:宏命令,可以同时执行一组命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class MacroCommand implements Command{
	/**
	 * 要执行的一组命令
	 */
	private Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		//依次执行每一个命令
		for (Command command : commands){
			command.execute();
		}
	}

	@Override
	public void undo() {
		//依次撤销每一个命令
		for (Command command : commands){
			command.undo();
		}
		
	}

}
