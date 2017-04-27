package proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 
 * <p>Description:真实图片的代理类,与被代理类实现同一接口</p>
 * <p>由于图片在网络上的传输过程比较耗时,因此在图片完全获取之前,先使用图片的代理,可以实现延迟加载</p>
 * @author ZhangShenao
 * @date 2017年4月27日
 */
public class ImageProxy implements Icon{
	/**
	 * 被代理对象
	 */
	private ImageIcon imageIcon;
	
	/**
	 * 图片的URL
	 */
	private URL imageURL;
	
	/**
	 * 创建真实对象的线程
	 */
	private Thread retrievalThread;
	
	/**
	 * 真实对象是否创建完毕
	 */
	boolean retrieving = false;
    
	public ImageProxy(URL url) {
		imageURL = url; 
	}
     
	public int getIconWidth() {
		if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
			return 800;
		}
	}
 
	public int getIconHeight() {
		if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
			return 600;
		}
	}
     
	public void paintIcon(final Component c, Graphics  g, int x,  int y) {
		//如果真正的图片已经创建完毕,则绘制真正的图片,否则开启线程,创建代理对象绘制文字提示,待真正的图片创建完毕再绘制图片
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;

				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

}
