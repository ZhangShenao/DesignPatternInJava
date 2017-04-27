package proxy.virtualproxy;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

/**
 * 
 * <p>Description:真实的图像组件</p>
 * @author ZhangShenao
 * @date 2017年4月27日
 */
public class ImageComponent extends JComponent{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 图片
	 */
	private Icon icon;

	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//绘制图片
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800 - w)/2;
		int y = (600 - h)/2;
		icon.paintIcon(this, g, x, y);
	}
	
	
}
