package command;

/**
 * 
 * <p>Description:天花板吊扇的抽象命令父类,让所有子类复用undo()方法</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public abstract class CeilingFanAbstractCommand implements Command{
	/**
	 * 记录吊扇之前的速度
	 */
	protected int previousSpeed;
	
	protected CeilingFan ceilingFan;
	
	public CeilingFanAbstractCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void undo() {
		//撤销命令,将吊扇恢复成之前的速度
		if (previousSpeed == CeilingFan.HIGH){
			ceilingFan.high();
		}
		else if (previousSpeed == CeilingFan.MEDIUM){
			ceilingFan.medium();
		}
		else if (previousSpeed == CeilingFan.LOW){
			ceilingFan.low();
		}
		else {
			ceilingFan.off();
		}
	}
}
