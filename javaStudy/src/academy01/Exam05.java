/*
 * 이름, 국어, 영어 점수를 입력 받고 해당 이름의 총점을 출력
 */
package academy01;

import java.util.*;

public class Exam05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력: ");
		String name = in.next();
		System.out.print("국어 점수 입력: ");
		int kor = in.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = in.nextInt();
		
		int sum = kor+eng;
		
		System.out.printf("%s님의 총점은 %d점 입니다.\n", name, sum);
	}
}
