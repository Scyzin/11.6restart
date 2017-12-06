package frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldDemo {
	public static void main(String[] args) {
		Frame f = new Frame();

		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		// �����ı���
		TextField tf = new TextField();
		Button bu = new Button("����");
		// �����ı���
		TextArea ta = new TextArea(10, 40);

		f.add(tf);
		f.add(bu);
		f.add(ta);

		// ���ô��ڹر�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�ı���dֵ
				String tf_str = tf.getText().trim();
				// �������
				tf.setText(" ");
				// �����ı���,ʵ�������滻
				ta.setText(tf_str);
				// ׷�Ӻͻ���
				ta.setText(tf_str + "\r\n");

				// ��ȡ���
				tf.requestFocus();

			}
		});
		f.setVisible(true);
	}
}
