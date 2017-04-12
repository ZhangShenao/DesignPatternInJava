package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * <p>Description: 咖啡——继承CaffeineBeverge抽象父类,实现模板方法中的具体步骤 </p>
 * @author ZhangShenao
 * @date 2017年4月12日 下午8:42:06
 */
public class Coffee extends CaffeineBeverge{
	
	@Override
	protected void brew() {
		System.out.println("用沸水冲泡咖啡");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加糖和牛奶");
	}
	
	@Override
	protected boolean customerWantsCondiments() {
		String answer = getCustomerAnswer();
		return answer.startsWith("yes");
	}
	
	/**
	 * 获取用户是否需要加调料的输入
	 */
	private String getCustomerAnswer(){
		String answer = null;
		BufferedReader in = null;
		try {
			System.out.println("咖啡里需要加糖和牛奶吗?(yes/no)");
			in = new BufferedReader(new InputStreamReader(System.in));
			answer = in.readLine();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			if (null != in){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return answer == null ? "no" : answer;
	}

}
