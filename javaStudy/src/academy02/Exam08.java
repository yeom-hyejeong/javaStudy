/*
 * 구구단 만들기(단을 입력 받아서)
 */
package academy02;
import java.util.*;

public class Exam08 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		/*단을 입력 받아
		System.out.print("단 입력: ");
		int dan = in.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+" X "+ i+" = "+(dan*i));
		}
		*/
		
		/*전체 구구단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n",i, j, (i*j) );
			}
		}
		*/
		
		//구구단 옆으로 만들기
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%2d X%2d = %d ", j, i, (i*j));
			}
			System.out.println();
		}
	}
}
