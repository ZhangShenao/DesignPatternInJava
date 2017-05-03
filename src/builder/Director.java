package builder;

/**
 * 
 * <p>Description:  编写文档的类</p>
 * @author ZhangShenao
 * @date 2017年5月4日 上午7:12:11
 */
public class Director {
	/**
	 * 内部维护一个Builder实例
	 */
	private Builder builder;
	
	/**
	 * 构造Director对象,传入Builder实例
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	/**
	 * 编写文档的方法
	 */
	public void construct(){
		//调用Builder的方法来编写文档
		builder.makeTitle("Greeting");
		builder.makeString("从早上至下午");
		builder.makeItems(new String[] {"早上好。","下午好。"});
		builder.makeString("晚上");
		builder.makeItems(new String[] {"晚上好。","晚安。","再见。"});
		builder.close();
	}
	
	
}
