package frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*
 * �¼��������ƣ�
		A:�¼�Դ	�¼������ĵط�
		B:�¼�	����Ҫ����������
		C:�¼�����	������Է��������������Ĵ�����
		D:�¼����� ���ǰ��¼�Դ���¼���������
 * 
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame("my window");
		
		//f.setTitle�����ñ��⣬��������������ʽ
		//���ô����С
		//Dimension d = new Dimension(400,300);   ���ض���
		//f.setSize(d);
		f.setSize(400,300);
		//���ô����ô��ڿɼ�������������Ⱥ�˳��ġ�
		f.setVisible(true);
		//���ô���λ��
		//Point p = new Point(300,200);
		//f.setLocation(p);
		f.setLocation(300, 200);
		
		
		//�������ô����С�ʹ���λ�ã�����һ�����õ�λ
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
		
		//����������Ľ�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}
