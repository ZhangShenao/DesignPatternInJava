package command;

/**
 * 
 * <p>Description:关闭天花板吊扇的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class CeilingFanOffCommand extends CeilingFanAbstractCommand {
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}
	
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}
	
}
