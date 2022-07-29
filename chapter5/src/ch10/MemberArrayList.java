package ch10;

import java.util.ArrayList;  // 사용할 클래스 import
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList 선언 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //멤버로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member){  //ArrayList 에 멤버 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){  // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		
//		for(int i = 0; i <arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			if(member.getMemberId() == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//			System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
//			return false;         
//		}
		
		Iterator<Member> it = arrayList.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			if(member.getMemberId() == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");  //for 가 끝날때 까지 return 이 안된경우
		return false; 
		
		
	
	      
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}