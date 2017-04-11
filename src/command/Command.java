package command;

/**
 * 
 * <p>Description:命令接口</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public interface Command {
	/**
	 * 执行命令
	 */
	public void execute();
	
	/**
	 * 撤销命令,将上一次执行的命令倒置
	 */
	public void undo();
}
