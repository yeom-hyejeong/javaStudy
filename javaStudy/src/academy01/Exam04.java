package academy01;

import java.util.*;

public class Exam04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		//키보드에 입력된 자료를 in으로 처리하겠다.
		
		System.out.print("이름을 입력: ");
		String name = in.next();//문자열 처리, 공백, 탭, 줄개행
		System.out.print("국어점수를 입력: ");
		int kor = in.nextInt();//정수를 입력 받음
		System.out.print("평균를 입력: ");
		double evg = in.nextDouble();//실수(더불) 자료형을 입력 받음
		
		System.out.println("입력하신 이름: "+name);
		System.out.println("국어 점수: "+kor+" 점");
		
	}
}
