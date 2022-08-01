package school;

public class Score {
	private Subject subject;
	private int sbScore;
	private int stId;
	
	public Score(int stId, Subject subject, int sbScore) {
		this.stId = stId;
		this.subject = subject;
		this.sbScore = sbScore;
	}
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public int getSbScore() {
		return sbScore;
	}

	public String toString() {
		return "ÇÐ¹ø : " + stId + ", "+subject.getSbName() + " : "+ sbScore;
	}
}
