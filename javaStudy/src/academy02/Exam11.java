/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
package academy02;

public class Exam11 {
	public static void main(String[]args) {
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
			}else {
				for(int j=1; j<=10-i; j++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
