package jdkobserver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * <p>Description: JDK Swing编程大量使用了观察者设计模式</p>
 * @author ZhangShenao
 * @date 2017年4月8日
 */
public class SwingObserverTest {
	private JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverTest swingObserverTest = new SwingObserverTest();
		swingObserverTest.go();
	}
	
	public void go(){
		//创建JFrame
		frame = new JFrame();
		
		//创建JButton
		JButton button = new JButton("Should I do it?");
		
		//为JButton注册两个监听器
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		//将JButon放入JFrame
		frame.getContentPane().add(BorderLayout.CENTER,button);
		
		//设置JFrame属性
		frame.setVisible(true);
		frame.pack();
		
		//为JFrame注册监听器,点击关闭按钮是退出程序
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	/**
	 * 
	 * <p>Description: 天使行为监听器</p>
	 * @author ZhangShenao
	 * @date 2017年4月8日
	 */
	private class AngelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.err.println("Don't do it ,you might be regret it !!");
		}
		
	}
	
	/**
	 * 
	 * <p>Description: 魔鬼行为监听器</p>
	 * @author ZhangShenao
	 * @date 2017年4月8日
	 */
	private class DevilListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.err.println("Come on ,do it!!");
		}
		
	}
}	
