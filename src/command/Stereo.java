package command;

/**
 * 
 * <p>Description:音响</p>
 * @author ZhangShenao
 * @date 2017年4月24日
 */
public class Stereo {
	private String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " stereo is on");
	}

	public void off() {
		System.out.println(location + " stereo is off");
	}

	public void setCD() {
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(location + " stereo is set for Radio");
	}

	public void setVolume(int volume) {
		System.out.println(location + " Stereo volume set to " + volume);
	}
}
