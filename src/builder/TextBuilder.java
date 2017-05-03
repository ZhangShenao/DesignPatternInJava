package builder;

/**
 * 
 * <p>Description: 用纯文本格式编写文档的Builder类 </p>
 * @author ZhangShenao
 * @date 2017年5月4日 上午7:17:41
 */
public class TextBuilder implements Builder{
	private StringBuffer buffer = new StringBuffer();
	
	public void makeTitle(String title) {                       
        buffer.append("==============================\n");      
        buffer.append("『" + title + "』\n");                   
        buffer.append("\n");                                    
    }
	
    public void makeString(String str) {                       
        buffer.append('■' + str + "\n");                       
        buffer.append("\n");                                    
    }
    
    public void makeItems(String[] items) {                     
        for (int i = 0; i < items.length; i++) {
            buffer.append("　・" + items[i] + "\n");            
        }
        buffer.append("\n");                                   
    }
    
    public void close() {                                       
        buffer.append("==============================\n");      
    }
    
    /**
     * 获取编写好的文档
     */
    public String getResult() {                                
        return buffer.toString();                               
    }
}
