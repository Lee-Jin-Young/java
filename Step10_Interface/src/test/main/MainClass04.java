package test.main;

import test.mypac.Drill;

public class MainClass04 {
   public static void main(String[] args) {
      useDrill(new Drill() {
         @Override
         public void hole() {
            System.out.println("바닥에 구멍 뚫기");
         }   
      });
   
      //람다식
      //추상 메소드가 1개인 인터페이스에 한해서 사용
      useDrill(()->{
    	  System.out.println("천장에 구멍 뚫기");
      });
   }
   
   public static void useDrill(Drill d) {
      d.hole();
      d.hole();
   }
   
}