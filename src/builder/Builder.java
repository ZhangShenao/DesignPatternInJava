package builder;

/**
 * 
 * <p>Description: Builder接口,声明了编写文档的抽象方法 </p>
 * @author ZhangShenao
 * @date 2017年5月4日 上午7:08:37
 */
public interface Builder {
	/**
	 * 编写标题
	 */
	public void makeTitle(String title);
	
	/**
	 * 编写字符串
	 */
	public void makeString(String str);
	
	/**
	 * 编写条目
	 */
	public void makeItems(String[] items);
	
	/**
	 * 完成文档编写
	 */
	public void close();
}
