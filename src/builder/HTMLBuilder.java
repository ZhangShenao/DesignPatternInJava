package builder;

import java.io.*;

/**
 * 
 * <p>Description:  用HTML格式编写文档的Builder类</p>
 * @author ZhangShenao
 * @date 2017年5月4日 上午7:20:56
 */
public class HTMLBuilder implements Builder {
	/**
	 * 文件名
	 */
    private String filename;         
    
    /**
     * 输出流
     */
    private PrintWriter writer;  
    
    public void makeTitle(String title) {                                           
        filename = title + ".html";                                                 
        try {
            writer = new PrintWriter(new FileWriter("D://" + filename));                    
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");    
        writer.println("<h1>" + title + "</h1>");
    }
    
    public void makeString(String str) {                                            
        writer.println("<p>" + str + "</p>");                                       
    }
    
    public void makeItems(String[] items) {                                        
        writer.println("<ul>");                                                     
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    
    public void close() {                                                           
        writer.println("</body></html>");                                           
        writer.close();                                                             
    }
    
    /**
     * 获取编写好的文档
     */
    public String getResult() {                                                     
        return filename;                                                            
    }
}
