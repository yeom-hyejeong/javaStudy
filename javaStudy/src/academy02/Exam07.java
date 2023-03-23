/*
 * 2개의 수를 입력 받아 최대공약수를 구하는 프로그램
 */
package academy02;

import java.util.*;

public class Exam07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력: ");
		int num1 = in.nextInt();
		System.out.print("두 번째 수 입력: ");
		int num2 = in.nextInt();
		
		if(num1<num2) {
			int temp = num2;
			num2=num1;
			num1=temp;
		}
		int result =1;
		
		if((num1/2)==num2) {
			result = num2;
		}else {
			for(int i=2; i<num1/2; i++) {
				if(num1%i==0 && num2%i==0) {
					result = i;
				}
			}
		}
		System.out.println(result);
	}
}
