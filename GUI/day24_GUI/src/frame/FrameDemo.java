package frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*
 * 事件监听机制：
		A:事件源	事件发生的地方
		B:事件	就是要发生的事情
		C:事件处理	就是针对发生的事情做出的处理方案
		D:事件监听 就是把事件源和事件关联起来
 * 
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("my window");
		
		//f.setTitle，设置标题，或者上面这种形式
		//设置窗体大小
		//Dimension d = new Dimension(400,300);   像素对象
		//f.setSize(d);
		f.setSize(400,300);
		//设置窗口让窗口可见，这个方法有先后顺序的。
		f.setVisible(true);
		//设置窗体位置
		//Point p = new Point(300,200);
		//f.setLocation(p);
		f.setLocation(300, 200);
		
		
		//上面设置窗体大小和窗体位置，可以一步设置到位
		//f.setBounds(400, 300, 300, 200);
		/*f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});*/
		
		//用适配器类改进
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}
