package frame05;

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

		//전송버튼
		JButton sendBtn = new JButton("전송");
		this.add(sendBtn);
		
		ActionListener listner = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송버튼 클릭");
				JOptionPane.showMessageDialog(MyFrame.this, "전송");
			}
		};
		sendBtn.addActionListener(listner);

		//삭제버튼
		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn);
		
		//람다식으로 활용 가능
		deleteBtn.addActionListener((e) -> {
			System.out.println("삭제 버튼 클릭");
			JOptionPane.showMessageDialog(this, "삭제");
		});
		
		//수정버튼
		JButton updateBtn = new JButton("수정");
		add(updateBtn);
		
		updateBtn.addActionListener(this);
		
		this.setVisible(true); // 프레임이 창에 보이게
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("수정버튼 클릭");
		JOptionPane.showMessageDialog(this, "수정");
	}
	
	public static void main(String[] args) {

		new MyFrame("myFrame");

		System.out.println("main메소드가 종료 됩니다.");
	}
}
