package test.mypac;

//추상메소드를 멤버로 가지고 있는 클래스는 abstract예약어와 함께 정의해야한다.
public abstract class Weapon {
	public void prepare() {
		System.out.println("준비합니다.");
	}
	
	public abstract void attack();
}
