package proxy.javaproxy;

public class PersonBeanImpl implements PersonBean{
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 性别
	 */
	private String gender;
	
	/**
	 * 兴趣
	 */
	private String interest;
	
	/**
	 * 总得分
	 */
	private int rating;
	
	/**
	 * 被打分的次数
	 */
	private int ratingCount;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public String getInterest() {
		return interest;
	}

	@Override
	public int getHotOrNotRating() {
		return ratingCount == 0 ? 0 : rating / ratingCount;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}

}
