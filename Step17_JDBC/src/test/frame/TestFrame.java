package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener {
	JTextField inputName = null;
	JTextField inputAddr = null;
	DefaultTableModel model = null;
	JTable table = null;

	public TestFrame(String title) {
		super(title);

		setLayout(new BorderLayout());

		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);
		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);

		JButton addBtn = new JButton("추가");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this);

		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);

		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);

		add(panel, BorderLayout.NORTH);

		panel.setBackground(Color.yellow);

		table = new JTable();

		String[] colNames = { "번호", "이름", "주소" };
		// 테이블에 연결할 모델객체
		model = new DefaultTableModel(colNames, 0);
		table.setModel(model);
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);

		// DB에 있는 데이터를 추가
		List<MemberDto> list = new MemberDao().getList();
		for (MemberDto dto : list) {
			Object[] row = { dto.getNum(), dto.getName(), dto.getAddr() };
			model.addRow(row);
		}

		addBtn.addActionListener(this);
		
		displayMember();

		/*
		 * setDefaultCloseOperation(EXIT_ON_CLOSE);
		 * setBounds(100, 100, 800, 500);
		 * setVisible(true);
		 */
	}

	public static void main(String[] args) {
		TestFrame f = new TestFrame("TestFrame");
		// 메인클래스에서 프레임의 속성을 설정 할 수 있다.
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		//행 추가
		if (cmd.equals("add")) {
			String name = inputName.getText();
			String addr = inputAddr.getText();

			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);

			boolean isSuccess = new MemberDao().insert(dto);

			if (isSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다");
				displayMember();
			} //if(isSuccess)
		} //if(cmd.equals("add"))
		//행 삭제
		else if(cmd.equals("delete")) {
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택하세요.");
				return;
			}
			int num =(int)model.getValueAt(selectedRow, 0);
			new MemberDao().delete(num);
			
		} //if(cmd.equals("delete"))
	}
	
	public void displayMember() {
		model.setRowCount(0);
		List<MemberDto> list = new MemberDao().getList();

		for (MemberDto tmp : list) {
			Object[] row = { tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		} //for
	}
	
}
