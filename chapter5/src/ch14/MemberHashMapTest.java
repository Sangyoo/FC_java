package ch14;


public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		
		Member memberKim = new Member(1003, "������");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKang = new Member(1002, "������");
		
		
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKang);
		memberHashMap.showAllMember();
	}
}