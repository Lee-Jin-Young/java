package frame02;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500); // 창의 위치와 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close버튼 누르면 창이 종료

		setLayout(new BorderLayout());
		
		//Add menuBar
		JMenuBar mb = new JMenuBar();
		
		JMenu menu = new JMenu("File");
		
		JMenuItem openItem = new JMenuItem();
		JMenuItem saveItem = new JMenuItem();
		
		menu.add(openItem);
		menu.add(saveItem);
		
		mb.add(menu);
		//menuBar End
		
		JPanel p1 = new JPanel();

		JTextField inputText = new JTextField(20);
		JButton saveBtn = new JButton("저장");

		p1.add(inputText);
		p1.add(saveBtn);
		
		openItem.addActionListener((e2)->{
			new JFileChooser("C:\\Users\\acorn\\acorn202304\\myFolder\\diary.txt");
		});

		JTextArea ta = new JTextArea();
		add(ta, BorderLayout.CENTER);

		File f = new File("C:\\Users\\acorn\\acorn202304\\myFolder\\diary.txt");

		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader("C:\\Users\\acorn\\acorn202304\\myFolder\\diary.txt");
			br = new BufferedReader(fr);

			while (br.read() != -1) {
				ta.append(br.readLine());
				ta.append("\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 사용한 스트림은 사용 순서의 역순으로 닫아줌
				// 널포인트 역참조를 방지
				if(br!=null) br.close();
				if(fr!=null) fr.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		setVisible(true);

		saveBtn.addActionListener((e) -> {
			String msg = inputText.getText();

			try {
				if (!f.exists()) {
					f.createNewFile();
				}

				FileWriter fw = new FileWriter(f, true);
				fw.write(msg);
				fw.write("\r\n");
				fw.flush();
				fw.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

	}

	public static void main(String[] args) {

		new MyFrame("myFrame");

		System.out.println("main메소드가 종료 됩니다.");
	}
}
