package ddit.chap04.sec01;

import java.util.Random;

public class IfStatementExample02 {

	public static void main(String[] args) {
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;
		
		int dice = (int)(Math.random()*6+1);
		System.out.println(dice);
	}

}
