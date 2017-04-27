package proxy.javaproxy;

public interface PersonBean {
	/**
	 * 获取姓名
	 */
	public String getName();
	
	/**
	 * 获取性别
	 */
	public String getGender();
	
	/**
	 * 获取兴趣
	 */
	public String getInterest();
	
	/**
	 * 获取平均分
	 */
	public int getHotOrNotRating();
	
	/**
	 * 设置姓名
	 */
	public void setName(String name);
	
	/**
	 * 设置性别
	 */
	public void setGender(String gender);
	
	/**
	 * 设置兴趣
	 */
	public void setInterest(String interest);
	
	/**
	 * 设置评分
	 */
	public void setHotOrNotRating(int rating);
}
