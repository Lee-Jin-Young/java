package test.mypac;

//가상의 옛날 가정용 전화기 객체를 생성할 설계도라고 가정
public class Phone { //어떤 클래스도 상속받지 않으면 자동으로 extends object 된다.
	//생성자 (클래스명이랑 똑같아야함, return 타입 없음)
	public Phone() {
		System.out.println("Phone 생성자 호출");
	}
	
	//전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}

}
