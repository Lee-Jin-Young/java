package test.main;
import test.mypac.*;

public class MainClass02 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		
		mem1.name = "김구라";
		mem1.num = 1;
		mem1.addr = "노량진";
		
		Member mem2 = new Member(2,"해골","행신동");
	}

}
