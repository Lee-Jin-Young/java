package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	public void Info() {
		System.out.printf("%d번 멤버의 이름은 %s이며, %s에 거주중이다.\n",num,name,addr);
	}
}
