package command;

/**
 * 
 * <p>Description:将天花板吊扇设置为低速的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class CeilingFanLowCommand extends CeilingFanAbstractCommand {
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		 ceilingFan.low();
	}
}
