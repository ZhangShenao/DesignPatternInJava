package proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * <p>Description:  PersonBean的非所有者的处理器</p>
 * @author ZhangShenao
 * @date 2017年4月28日 上午7:25:43
 */
public class NonOwnerInvocationHandler implements InvocationHandler{
	/**
	 * 被代理对象
	 */
	private PersonBean personBean;
	
	/**
	 * 在构造器中传入被代理对象
	 */
	public NonOwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if (null == methodName){
			return null;
		}
		
		//可以获取其他人的任何信息
		if (methodName.startsWith("get")){
			return method.invoke(personBean, args);
		}
		
		//可以给别人打分
		else if ("setHotOrNotRating".equals(methodName)){
			return method.invoke(personBean, args);
		}
		
		//不可以修改他人除了分数之外的任何信息
		else if (methodName.startsWith("set")){
			throw new IllegalAccessException();
		}
		
		return null;
	}

}
