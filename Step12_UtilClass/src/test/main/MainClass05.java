package test.main;

import java.util.*;
import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<>();
		
		Member member1 = new Member(1, "김구라", "노량진");
		Member member2 = new Member(2, "해골", "행신동");

		//디폴트 생성자를 이용하면 필드를 직접 참조해서 넣어야한다.
		Member member3 = new Member();
		member3.num = 3;
		member3.name = "에이콘";
		member3.addr = "강남";
		
		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		for(Member m : members) {
			System.out.printf("번호: %d, 이름:%s, 주소:%s \n",m.num,m.name,m.addr);
		}
	}
}
