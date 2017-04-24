package command;

/**
 * 
 * <p>Description:电灯</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class Light {
	/**
	 * 电灯的位置
	 */
	private String location = "";

	public Light(String location) {
		this.location = location;
	}
	
	/**
	 * 打开电灯
	 */
	public void on() {
		System.out.println(location + " light is on");
	}
	
	/**
	 * 关闭电灯
	 */
	public void off() {
		System.out.println(location + " light is off");
	}
}
