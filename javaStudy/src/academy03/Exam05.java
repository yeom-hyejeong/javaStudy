/*
 *   ***** *****
 *   ****   ****
 *   ***     ***
 *   **       **
 *   *         *
 *   **       **
 *   ***     ***
 *   ****   ****
 *   ***** *****
 */
package academy03;

public class Exam05 {
	public static void main(String[]args) {
		
		int co =0;
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				co++;
			}else {
				co--;
			}
			
			for(int j=1; j<=6-co; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=co+(co-1); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-co; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
