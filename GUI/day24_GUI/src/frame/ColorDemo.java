package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 * 为鼠标添加动作事件
 * 为按钮添加动作事件
 *
 */

public class ColorDemo {
	public static void main(String[] args) {
		Frame f = new Frame("更改背景色");

		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		// 创建四个按钮
				Button redButton = new Button("红色");
				Button greenButton = new Button("绿色");
				Button buleButton = new Button("蓝色");

				// 添加按钮
				f.add(redButton);
				f.add(greenButton);
				f.add(buleButton);

				// 设置窗体关闭
				f.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});

				// 对按钮添加动作事件
				// redButton.addActionListener(new ActionListener() {
				// @Override
				// public void actionPerformed(ActionEvent e) {
				// f.setBackground(Color.RED);
				// }
				// });

				// 对按钮添加鼠标点击事件
				// redButton.addMouseListener(new MouseAdapter() {
				// @Override
				// public void mouseClicked(MouseEvent e) {
				// f.setBackground(Color.RED);
				// }
				// });

				// 对按钮添加鼠标的进入事件
				redButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						f.setBackground(Color.RED);
					}
				});

				redButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseExited(MouseEvent e) {
						f.setBackground(Color.WHITE);
					}
				});

				greenButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						f.setBackground(Color.GREEN);
					}
				});

				greenButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseExited(MouseEvent e) {
						f.setBackground(Color.WHITE);
					}
				});

				buleButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						f.setBackground(Color.BLUE);
					}
				});

				buleButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseExited(MouseEvent e) {
						f.setBackground(Color.WHITE);
					}
				});
				f.setVisible(true);
	}
}

