/*
 * 10개의 수를 입력 받아 홀수의 합과 짝수의 합을 각 출력
 */
package academy02;

import java.util.*;

public class Exam06 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0; i<10; i++) {
			System.out.print("수를 입력:" );
			int num = in.nextInt();
			if(num%2==0) {
				evenSum += num;
			}else if(num%2 !=0) {
				oddSum +=num;
			}
		}
		System.out.println("짝수의 합: "+evenSum+", 홀수의 합: "+oddSum);
	}
}
