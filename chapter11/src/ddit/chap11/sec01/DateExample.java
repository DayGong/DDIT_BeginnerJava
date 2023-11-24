package ddit.chap11.sec01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// java 1.8 이전 
public class DateExample {
	public static void main(String[] args) {
		try {
			dateMethod01();
			dateMethod02();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void dateMethod01() throws Exception {
		String dstr = "2023-10-02 12:38:50";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = format.parse(dstr); // java.util에 존재
		System.out.println(date);
	}

	/** 최근 버전 날짜 */
	public static void dateMethod02() {
		String dstr = "2023-10-02 12:31:42";

		// 날짜 변환 포맷형식 지정
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		// 문자열을 date 타입으로 변환
		LocalDateTime date = LocalDateTime.parse(dstr, formatter);

		System.out.println(date);
		System.out.print(
				date.getYear() + "/" + date.getMonthValue() + "(" + date.getMonth() + ")/" + date.getDayOfMonth());
		System.out.println("  " + date.getHour() + ":" + date.getMinute() + ":" + date.getSecond());
	}
}
