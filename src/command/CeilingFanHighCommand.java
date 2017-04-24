package command;

/**
 * 
 * <p>Description:将天花板吊扇设置为高速的命令</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class CeilingFanHighCommand extends CeilingFanAbstractCommand {
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
}
