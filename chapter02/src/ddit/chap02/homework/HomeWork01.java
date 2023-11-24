package ddit.chap02.homework;

public class HomeWork01 {
	public static void main(String[] args) {
		// 1년은 365.2422일이다. 이를 XXX일 XX시간 XX분 XX초로 나타내어라.
		double y = 365.2422;
		
		int days = (int)y;	//일수
		
		double hour = (y-days)*24;
		int hours = (int)hour;		//시간
		
		double minute = (hour-hours)*60;
		int minutes = (int)minute;	//분
		
		double second = (minute-minutes)*60;
		int seconds = (int)second;	//초
		
		System.out.println("1년은 "+days+"일 "+hours+"시간 "+minutes+"분 "+ seconds+"초");
	}
}
