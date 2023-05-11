package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
	
	JTextField inputMsg = new JTextField();
	JLabel label = new JLabel();
	
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		this.inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		JButton sendBtn2 = new JButton("전송2");
		label = new JLabel("...");
		
		sendBtn.addActionListener(this);
		
		sendBtn2.addActionListener((e) -> {
			String msg = inputMsg.getText();
			JOptionPane.showMessageDialog(this, msg);
		});
		
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(label);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = inputMsg.getText();
		JOptionPane.showMessageDialog(this, msg);
		label.setText(msg);
	}
	
	public static void main(String[] args) {
		new MyFrame("myFrame");
		
	}
}
