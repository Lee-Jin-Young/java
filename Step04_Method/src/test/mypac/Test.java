package test.mypac;

public class Test {
	public void walk() {
		System.out.println("걷는다.");
	}
	
	public int getNumber() {
		return 1;
	}
	
	public String getGreeting() {
		return "안녕하세요";
	}
	
	public Airplane getPlane() {
		return new Airplane();
	}
	
	public void setNum(int num) {
		
	}

	public void setName(String name) {
	}

	public void setPlane(Airplane airplane) {
	}
	
	public void doSomething(int num, String name, Airplane plane) {
		
	}
	
	public void send() {
		System.out.println("무언가를 전송");
	}
	public void send(int num) {
		System.out.println(num+"을 전송");
	}
	public void send(String name) {
		System.out.println(name+"을 전송");
	}
	public void send(Airplane plane) {
		System.out.println(plane+"을 전송");
	}
}
