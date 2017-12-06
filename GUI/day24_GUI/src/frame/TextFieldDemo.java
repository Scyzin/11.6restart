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
		// 设置文本域
		TextField tf = new TextField();
		Button bu = new Button("数据");
		// 设置文本框
		TextArea ta = new TextArea(10, 40);

		f.add(tf);
		f.add(bu);
		f.add(ta);

		// 设置窗口关闭
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取文本框d值
				String tf_str = tf.getText().trim();
				// 清空数据
				tf.setText(" ");
				// 设置文本域,实际上是替换
				ta.setText(tf_str);
				// 追加和换行
				ta.setText(tf_str + "\r\n");

				// 获取光标
				tf.requestFocus();

			}
		});
		f.setVisible(true);
	}
}
