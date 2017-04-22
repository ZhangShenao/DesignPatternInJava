package decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * <p>Description:自定义包装的输入流,将读到的大写字母转换为小写</p>
 * @author ZhangShenao
 * @date 2017年4月10日
 */
public class LowerCaseInputStream extends FilterInputStream{
	
	/**
	 * 在构造器中传入被包装的输入流
	 */
	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int result = super.read();
		
		//将读取到的字符转换为小写
		return result == -1 ? -1 : Character.toLowerCase((char)result);
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off,length = off + len;i < length;i++){
			//将读取到的每个字符转换为小写
			b[i] = (byte) Character.toLowerCase((char)b[i]);
		}
		return result;
	}

}
