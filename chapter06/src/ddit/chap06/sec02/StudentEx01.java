package ddit.chap06.sec02;

public class StudentEx01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setStudID(1489025, "정보통신학과");
		System.out.println("학번: "+s1.getStudID());
		System.out.println("학과: "+s1.getMajor());
	}
}