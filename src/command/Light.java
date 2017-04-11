package command;

/**
 * 
 * <p>Description:电灯,具体的命令接收者</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class Light {
	private String desp;
	
	public Light(String desp) {
		this.desp = desp;
	}

	/**
	 * 开启电灯
	 */
	public void on(){
		System.out.println("打开电灯: " + desp);
	}
	
	/**
	 * 关闭电灯
	 */
	public void off(){
		System.out.println("关闭电灯: " + desp);
	}
}
