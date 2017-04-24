package command;

/**
 * 
 * <p>Description:天花板吊扇</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class CeilingFan {
	/**
	 * 吊扇的位置
	 */
	private String location = "";
	
	/**
	 * 吊扇当前的速度
	 */
	private int speed;
	
	/**
	 * 高速
	 */
	public static final int HIGH = 3;
	
	/**
	 * 中速
	 */
	public static final int MEDIUM = 2;
	
	/**
	 * 低速
	 */
	public static final int LOW = 1;
	
	/**
	 * 停止
	 */
	public static final int OFF = 0;
 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		speed = HIGH;
		System.out.println(location + " ceiling fan is on high");
 
	} 

	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
		speed = LOW;
		System.out.println(location + " ceiling fan is on low");
	}
 
	public void off() {
		speed = OFF;
		System.out.println(location + " ceiling fan is off");
	}
 
	public int getSpeed() {
		return speed;
	}
}
