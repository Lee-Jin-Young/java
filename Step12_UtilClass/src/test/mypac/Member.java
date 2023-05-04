package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	//생성자는 다중 정의가 가능하다.
	public Member() {
	}
	
	public Member(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
}
