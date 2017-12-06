package frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		Button bu = new Button("���ǰ�ť");
		
		f.add(bu);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ٵ�һ��");
			}
		});
		
		f.setVisible(true);
	}
}
