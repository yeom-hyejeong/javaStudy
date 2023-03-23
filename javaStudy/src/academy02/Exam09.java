/*
 * 12345
 * 23456
 * 34567
 * 45678
 * 56789
 */
package academy02;

public class Exam09 {
	public static void main(String[]args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=4+i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
