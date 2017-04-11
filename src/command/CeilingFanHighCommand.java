package command;

/**
 * 
 * <p>Description: 将天花板吊扇设置为高速的命令</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class CeilingFanHighCommand implements Command{
	private CeilingFan ceilingFan;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	/**
	 * 保存风扇修改之前的转速,便于执行撤销
	 */
	private int lastSpeed;

	@Override
	public void execute() {
		//获取修改之前的转速
		lastSpeed = ceilingFan.getSpeed();
		
		//设置新转速
		ceilingFan.high();
	}

	@Override
	public void undo() {
		//将风扇的转速设置为之前的值
		ceilingFan.setSpeed(lastSpeed);
	}

}
