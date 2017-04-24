package command;

/**
 * 
 * <p>Description:空命令,什么都不做——空对象模式</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class NoCommand implements Command{

	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}

}
