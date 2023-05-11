package frame09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	// 필드
	JTextField inputNum1 = new JTextField();
	JTextField inputNum2 = new JTextField();
	JLabel label = new JLabel();

	// 생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// 버튼 선언
		inputNum1 = new JTextField(10);

		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiBtn = new JButton("*");
		JButton divideBtn = new JButton("/");

		inputNum2 = new JTextField(10);

		JButton resultBtn = new JButton("=");

		label = new JLabel("...");

		// 버튼 추가
		add(inputNum1);

		add(plusBtn);
		add(minusBtn);
		add(multiBtn);
		add(divideBtn);

		add(inputNum2);

		add(resultBtn);

		add(label);

		// 버튼 동작 추가
		plusBtn.addActionListener(this);
		plusBtn.setActionCommand("plus");

		minusBtn.addActionListener(this);
		minusBtn.setActionCommand("minus");

		multiBtn.addActionListener(this);

		multiBtn.setActionCommand("multi");

		divideBtn.addActionListener(this);
		divideBtn.setActionCommand("div");

		resultBtn.addActionListener(this);
		resultBtn.setActionCommand("result");

		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame("계산기");
	}

	// ActionListener 인터페이스를 구현했기 때문에 강제 오버라이드된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(inputNum1.getText());
			double num2 = Double.parseDouble(inputNum2.getText());
			String cmd = e.getActionCommand();
			double result = 0;

			if (cmd.equals("plus")) {
				result = num1 + num2;
			} else if (cmd.equals("minus")) {
				result = num1 - num2;
			} else if (cmd.equals("multi")) {
				result = num1 * num2;
			} else if (cmd.equals("divide")) {
				if(num2==0) {
					JOptionPane.showMessageDialog(this, "0으로 나눌 수 없다.");
				}
				result = num1 / num2;
			}

			String resultText = Double.toString(result);
			label.setText(resultText);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "숫자 형식으로 입력");
		}

	}
}
