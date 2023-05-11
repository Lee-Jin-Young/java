package frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;
import test.mypac.CountRunnable;

public class MyFrame extends JFrame implements ActionListener {
	public MyFrame(String title) {
		super(title);

		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JButton startBtn = new JButton("카운트 다운");
		startBtn.addActionListener(this);
		add(startBtn);

		JTextField tf = new JTextField(10);
		add(tf);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		CountRunnable runnable = new CountRunnable();
		Thread t = new Thread(runnable);
		t.start();
		*/
		
		new Thread(new CountRunnable()).start();
	}

	public static void main(String[] args) {
		new MyFrame("frame");
	}

}
