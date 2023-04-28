package test.mypac;

public class Car {
	public String name;
	public int price;

	public void drive() {
		System.out.println(this.name+"는 달린다.");
	}
	
	public void showInfo() {
		System.out.printf("차의 이름은 %s이고 가격은 %d만원 입니다.",this.name,this.price);
	}
}
