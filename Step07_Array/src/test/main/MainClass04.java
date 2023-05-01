package test.main;

import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		Bike[] bikes = new Bike[3];
		
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(int i = 0; i<bikes.length; i++) {
			bikes[i].ride();
		}
		
		for(int i = 0; i<bikes.length; i++) {
			//i번째 Bike객체의 참조값을 임시변수에 담기
			Bike temp = bikes[i];
			//temp에서 메소드 호출
			temp.ride();
		}
		
		//확장 for문
		for(Bike temp:bikes) {
			temp.ride();
		}
	}
}
