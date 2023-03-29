/*
 * 10개의 수를 입력받아 그 합과 평균을 알려주는 프러그램
 * 단, 10개의 수를 모두 나열하고 합과 평균(소수점 2자가까지)을 출력
 */
package academy04;
import java.util.*;

public class Exam03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int su []= new int[10];
		int sum =0;
		
		for(int i=0; i<10; i++) {
			System.out.print(i+1+"번째 수를 입력: ");
			su[i]=in.nextInt();
			sum += su[i];
		}
		
		System.out.printf("합: %d, 평균: %.2f\n", sum, sum/10.0);
	}
}
