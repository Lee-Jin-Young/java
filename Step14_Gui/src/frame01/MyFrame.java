package frame01;

import javax.swing.*;

public class MyFrame extends JFrame {
	
	public MyFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500); //창의 위치와 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close버튼 누르면 창이 종료
		this.setLayout(null); //상대좌표
		
		JButton btn1 = new JButton("Click");
		btn1.setLocation(10, 10);
		btn1.setSize(100, 30);
		this.add(btn1);
		
		this.setVisible(true); //프레임이 창에 보이게
	}
	
	public static void main(String[] args) {
		
		new MyFrame("myFrame");
		
		System.out.println("main메소드가 종료 됩니다.");
	}
}
