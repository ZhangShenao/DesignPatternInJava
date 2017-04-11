package adapter;

/**
 * 
 * <p>Description:火鸡的适配器类,实现Duck接口,将一个Turcky对象装换成Duck对象</p>
 * @author ZhangShenao
 * @date 2017年4月11日
 */
public class TurckyAdapter implements Duck{
	/**
	 * 保存被适配的对象
	 */
	private Turcky turcky;
	
	/**
	 * 在构造器中传入被适配的对象
	 */
	public TurckyAdapter(Turcky turcky) {
		this.turcky = turcky;
	}

	@Override
	public void fly() {
		//让火鸡多飞几次
		for (int i = 0;i < 5;i++){
			turcky.fly();
		}
	}

	@Override
	public void gagaBark() {
		//直接调用火鸡咕咕叫
		turcky.guguBark();
	}
}
