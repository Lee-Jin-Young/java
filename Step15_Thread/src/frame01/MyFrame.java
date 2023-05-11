package frame01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	public MyFrame(String title) {
		super(title);

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JButton startBtn = new JButton("작업 시작");
		startBtn.addActionListener(this);
		add(startBtn);

		JTextField tf = new JTextField(10);
		add(tf);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("작업을 시작합니다.");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.println("작업이 끝났습니다.");
	}

	public static void main(String[] args) {
		new MyFrame("frame");
	}

}
