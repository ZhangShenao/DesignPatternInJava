package decorator;

import java.io.FileInputStream;

/**
 * 
 * <p>Description: 使用装饰者模式,自定义包装的输入流</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class InputTest {
	public static void main(String[] args) throws Exception {
		//创建自定义的包装输入流
		LowerCaseInputStream in = new LowerCaseInputStream(new FileInputStream("E://a.txt"));
		byte[] buff = new byte[1024];
		int len = 0;
		
		in.read(buff, 0, buff.length);
		
		System.out.println(new String(buff));
	}
}
