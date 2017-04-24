package command;

/**
 * 
 * <p>Description:将天花板吊扇设置为中速的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class CeilingFanMidCommand extends CeilingFanAbstractCommand {
	public CeilingFanMidCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		 ceilingFan.medium();
	}
}
