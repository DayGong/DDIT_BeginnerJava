package ddit.chap11.sec02;

public class StringBufferExample {
	public static void main(String[] args) {
		String sql = "SELECT  MEMBER.MEM_NAME, \n"; // 공백 또는 \n 사용
		sql = sql + "MEMBER.MEM_JOB, ";
		sql = sql + "MEMBER.MEM_MILEAGE ";
		sql = sql + "FROM MEMBER ";
		sql = sql + "WHERE MEMBER.MEM_JOB <> '공무원' ";
		sql = sql + "AND MEMBER.MEM_MILEAGE > ALL(SELECT MEMBER.MEM_MILEAGE ";
		sql = sql + "FROM MEMBER ";
		sql = sql + "WHERE MEMBER.MEM_JOB = '공무원'); ";
		System.out.println(sql);
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT  MEMBER.MEM_NAME, \n");
		sb.append("MEMBER.MEM_JOB, ");
		sb.append("MEMBER.MEM_MILEAGE ");
		sb.append("FROM MEMBER ");
		
		System.out.println(sb);
	}
}
