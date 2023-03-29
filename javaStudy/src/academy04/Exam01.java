/*
 * 5명의 학생의 국어 점수를 받아 배열에 담은 뒤, 5명의 점수와 합을 출력
 */
package academy04;
import java.util.*;

public class Exam01 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int kor [] = new int [5];
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"번째 학생의 국어 점수: ");
			kor[i]=in.nextInt();
			sum += kor[i];
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(kor[i]+"\t");
		}
		System.out.println("합: "+sum);
	}
}
