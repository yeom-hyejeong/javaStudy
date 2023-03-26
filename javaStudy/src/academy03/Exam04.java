/*
 *     1
 *    123
 *   12345
 *  1234567
 * 123456789
 *  1234567
 *   12345
 *    123
 *     1
 */
package academy03;

public class Exam04 {
	public static void main(String[]args) {
		
		int co =0;
		//i가 1일 때 co가 1증가 co = 0
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				co++;
			}else {
				co--;
			}
			
			for(int j=1; j<=5-co; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=co+(co-1); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
