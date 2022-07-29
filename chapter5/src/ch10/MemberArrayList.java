package ch10;

import java.util.ArrayList;  // ����� Ŭ���� import
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;  // ArrayList ���� 

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();  //����� ������ ArrayList ����
	}
	
	public void addMember(Member member){  //ArrayList �� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){  // ��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
//		for(int i = 0; i <arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			if(member.getMemberId() == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//			System.out.println(memberId + "�� �������� �ʽ��ϴ�");  //for �� ������ ���� return �� �ȵȰ��
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
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");  //for �� ������ ���� return �� �ȵȰ��
		return false; 
		
		
	
	      
	}
	
	public void showAllMember(){
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}