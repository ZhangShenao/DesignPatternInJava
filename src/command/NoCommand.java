package command;

/**
 * 
 * <p>Description:空命令,采用空对象模式</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class NoCommand implements Command{

	@Override
	public void execute() {
		//空的命令对象,什么都不做
	}

	@Override
	public void undo() {
	}

}
