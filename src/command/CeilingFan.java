package command;

/**
 * 
 * <p>Description: 天花板吊扇,具有高、中、低和关闭4个档位</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class CeilingFan {
	/**
	 * 高速
	 */
	public static final int HIGH = 3;
	
	/**
	 * 中速
	 */
	public static final int MIDDLE = 2;
	
	/**
	 * 低速
	 */
	public static final int LOW = 1;
	
	/**
	 * 关闭
	 */
	public static final int OFF = 0;
	
	/**
	 * 保存当前的转速
	 */
	private int speed;
	
	private String desc;
	
	public CeilingFan(String desc) {
		this.desc = desc;
	}
	
	/**
	 * 设置为高速
	 */
	public void high(){
		speed = HIGH;
		System.out.println(desc + " 高速运转");
	}
	
	/**
	 * 设置为中速
	 */
	public void middle(){
		speed = MIDDLE;
		System.out.println(desc + " 中速运转");
	}
	
	/**
	 * 设置为低速
	 */
	public void low(){
		speed = LOW;
		System.out.println(desc + " 低速运转");
	}
	
	/**
	 * 关闭风扇
	 */
	public void off(){
		speed = OFF;
		System.out.println(desc + " 关闭运转");
	}
	
	/**
	 * 获取风扇转速
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * 设置风扇的转速
	 */
	public void setSpeed(int speed){
		if (speed == 0){
			off();
		}
		else if (speed == 1){
			low();
		}
		else if (speed == 2){
			middle();
		}
		else {
			high();
		}
	}
	
}
