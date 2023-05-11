package frame06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {

	JButton sendBtn;
	JButton deleteBtn;
	JButton updateBtn;

	public MyFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500); // 창의 위치와 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close버튼 누르면 창이 종료

		this.setLayout(new FlowLayout());

		// 전송버튼
		this.sendBtn = new JButton("전송");
		this.add(sendBtn);
		sendBtn.addActionListener(this);

		// 삭제버튼
		this.deleteBtn = new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(this);

		// 수정버튼
		this.updateBtn = new JButton("수정");
		add(updateBtn);
		updateBtn.addActionListener(this);

		this.setVisible(true); // 프레임이 창에 보이게
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 메소드의 매개변수로 전달되는 ActionEvent 객체에 이벤트에 대한 정보가 들어 있다.
		Object which = e.getSource();

		
		if(which == sendBtn) {
			 JOptionPane.showMessageDialog(this, "전송합니다");
		 } else if(which == deleteBtn) {
			 JOptionPane.showMessageDialog(this, "삭제합니다");
		 } else {
			 JOptionPane.showMessageDialog(this, "수정합니다");
		 }
	}

	public static void main(String[] args) {

		new MyFrame("myFrame");

		System.out.println("main메소드가 종료 됩니다.");
	}

}
