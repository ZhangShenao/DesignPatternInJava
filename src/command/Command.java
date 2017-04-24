package command;

/**
 * 
 * <p>Description:命令接口,所有的具体命令都要实现该接口</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public interface Command {
	/**
	 * 执行命令
	 */
	public void execute();
	
	/**
	 * 撤销命令
	 */
	public void undo();
}
