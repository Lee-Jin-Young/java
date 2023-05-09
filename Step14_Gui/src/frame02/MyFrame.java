package frame02;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame extends JFrame {
	
	public MyFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500); //창의 위치와 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close버튼 누르면 창이 종료
		
		this.setLayout(new FlowLayout(0));
		
		JButton btn1 = new JButton("버튼1");
		this.add(btn1);
		JButton btn2 = new JButton("버튼2");
		this.add(btn2);
		JButton btn3 = new JButton("버튼3");
		this.add(btn3);
		
		
		this.setVisible(true); //프레임이 창에 보이게
	}
	
	public static void main(String[] args) {
		
		new MyFrame("myFrame");
		
		System.out.println("main메소드가 종료 됩니다.");
	}
}
