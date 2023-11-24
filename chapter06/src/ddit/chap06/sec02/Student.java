package ddit.chap06.sec02;

public class Student {
	private long studID;  
	private String major;
	
	public void setStudID(long studID, String major) {
		this.studID = studID;
		this.major = major;
	}
	
	public long getStudID() {
		return studID;
	}
	
	public String getMajor() {
		return major;
	}
}