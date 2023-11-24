package ddit.chap04.sec01;

import java.io.IOException;

public class SwitchExample01 {

	public static void main(String[] args) {
		// 키보드로 문자 한 글자를 입력 받아 그 값이 'c'면 db의 insert문을
		// 'r'이면 select문, 'u'면 update문, 'd'면 delete문을 작성하고
		// 그 이외의 글자가 입력되면 "작업 선택이 잘못되었습니다." 출력
		SwitchStatement ss = new SwitchStatement();

		try {
			ss.inputChoice();
		} catch (IOException e) {
			System.out.println("예외 발생" + e.getMessage());
		}
	}

}

class SwitchStatement {
	String sql;

	// inputChoice() 메소드를 호출 할 때 IOException(예외처리)을 조심하세요.
	// 강요 된 예외처리
	public void inputChoice() throws IOException {
		System.out.println("[[ 메뉴 ]]");
		System.out.println("[c] 입력");
		System.out.println("[r] 검색");
		System.out.println("[u] 수정");
		System.out.println("[d] 삭제");
		System.out.println("----------------------------");
		System.out.print("작업 선택: ");
		int choice = System.in.read(); // 키보드로 한 글자를 입력받아 정수형으로 변환시켜 반환 (try ~ catch를 사용)

		switch ((char) choice) {
		case 'c':
		case 'C':
			sql = "INSERT INTO member(mem_id, mem_name, mem_add1, mem_hp\n";
			sql += " VALUES('a001', '김은대', '대전시 중구 계룡로 846', '010-1234-5678')";
			break;

		case 'r':
		case 'R':
			sql = "SELECT * FROM member\n";
			sql += " WHERE mem_add1 LIKE '대전%'";
			break;

		case 'u':
		case 'U':
			sql = "UPDATE member SET mem_mileage = mem_mileage + amt\n";
			sql += " WHERE mem_id = 'a001";
			break;

		case 'd':
		case 'D':
			sql = "DELETE FROM member WHERE mem_id = 'a001'";
			break;

		default:
			System.out.println("작업번호를 잘못 선택했습니다.");
			sql = "수행한 작업 없음";
		}

		System.out.println("[수행한 작업]");
		System.out.println(sql);
	}
}
