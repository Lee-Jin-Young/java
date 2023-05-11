package frame07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {

	public MyFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500); // 창의 위치와 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close버튼 누르면 창이 종료

		this.setLayout(new FlowLayout());

		// 전송버튼
		JButton sendBtn = new JButton("전송");
		this.add(sendBtn);
		sendBtn.addActionListener(this);
		sendBtn.setActionCommand("send");

		// 삭제버튼
		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(this);
		deleteBtn.setActionCommand("delete");

		// 수정버튼
		JButton updateBtn = new JButton("수정");
		add(updateBtn);
		updateBtn.addActionListener(this);
		updateBtn.setActionCommand("update");

		this.setVisible(true); // 프레임이 창에 보이게
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		 if(cmd.equals("send")) {
			 JOptionPane.showMessageDialog(this, "전송합니다");
		 } else if(cmd.equals("delete")) {
			 JOptionPane.showMessageDialog(this, "삭제합니다");
		 } else {
			 JOptionPane.showMessageDialog(this, "수정합니다");
		 }

		/*
		switch (cmd) {
			case "send":
				JOptionPane.showMessageDialog(this, "전송합니다");
				break;
			case "delete" :
				JOptionPane.showMessageDialog(this, "삭제합니다");
				break;
			case "update" :
				JOptionPane.showMessageDialog(this, "수정합니다");
				break;
		}
		*/
	}

	public static void main(String[] args) {

		new MyFrame("myFrame");

		System.out.println("main메소드가 종료 됩니다.");
	}

}
