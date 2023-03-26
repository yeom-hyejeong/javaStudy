/*
 * 주차요금 계산기 만들기
 * 30분까지는 2000원이고 이후 10분당 500원인 주차작이 있다. 분을 입력받아 주차요금이 얼마인지 알려주는 프로그램 작성
 */
package academy03;

import java.util.*;

public class Exam01 {
	public static void main(String[]arg) {
		Scanner in = new Scanner(System.in);
		
		int money = 2000;
		
		System.out.print("분을 입력해주세요: ");
		int min = in.nextInt();
		
		if(min>30) {
			min -=30;
			money += ((min/10)+(min%10==0? 0:1))*500;
		}
		System.out.println("주차비용: "+ money);
	}
}
