package ch12;

public class Member {
	
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String MemberName) {
		this.memberId = memberId;
		this.memberName = MemberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberId==member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}
	
	
}
