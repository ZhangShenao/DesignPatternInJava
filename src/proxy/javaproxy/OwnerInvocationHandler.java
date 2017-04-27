package proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * <p>Description:  PersonBean的所有者的处理器</p>
 * @author ZhangShenao
 * @date 2017年4月28日 上午7:25:43
 */
public class OwnerInvocationHandler implements InvocationHandler{
	/**
	 * 被代理对象
	 */
	private PersonBean personBean;
	
	/**
	 * 在构造器中传入被代理对象
	 */
	public OwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if (null == methodName){
			return null;
		}
		
		//可以获取自己的任何信息
		if (methodName.startsWith("get")){
			return method.invoke(personBean, args);
		}
		
		//不可以给自己打分
		else if ("setHotOrNotRating".equals(methodName)){
			throw new IllegalAccessException();
		}
		
		//可以设置自己除了分数的其他信息
		else if (methodName.startsWith("set")){
			return method.invoke(personBean, args);
		}
		
		return null;
	}

}
