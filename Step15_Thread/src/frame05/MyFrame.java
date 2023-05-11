package frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
   public MyFrame(String title) {
      super(title);
      setBounds(100, 100, 500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
   
      JButton startBtn=new JButton("카운트 다운");
      startBtn.addActionListener(this);
      add(startBtn);
      
      JTextField tf=new JTextField(10);
      
      add(tf);
      
      setVisible(true);
   }
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
      /*
      new Thread() {
         @Override
         public void run() {
            //카운트 값을 저장할 지역변수 만들고 초기 값 대입
            int count=10;
            //반복문 돌면서 
            while(true) {
               System.out.println("현재 count:"+count);
               if(count==0) {//만일 카운트가 0 이면 
                  break;//반복문 탈출
               }
               //1초 마다
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
               //카운트를 1씩 감소 시키고 
               count--;
            }
         }
      }.start();
      */
	   
      /*
      new Thread(new Runnable() {
         @Override
         public void run() {
            //카운트 값을 저장할 지역변수 만들고 초기 값 대입
            int count=10;
            //반복문 돌면서 
            while(true) {
               System.out.println("현재 count:"+count);
               if(count==0) {//만일 카운트가 0 이면 
                  break;//반복문 탈출
               }
               //1초 마다
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  e.printStackTrace();
               }
               //카운트를 1씩 감소 시키고 
               count--;
            }
         }
      }).start();
      */
	   
      new Thread(()->{
         int count=10;
         
         while(count>=0) {
            System.out.println("현재 count:"+count);
            try {
               Thread.sleep(1000);
            } catch (InterruptedException e1) {
               e1 .printStackTrace();
            }
            count--;
         }
      }).start();
   }
   
   public static void main(String[] args) {
      new MyFrame("나의 프레임");
   }

}









