/*
 * 분을 입력받아 시간과 분으로 알려주는 프로그램
 */
package academy03;
import java.util.*;

public class Exam08 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		while(true) {
			System.out.print("분을 입력: ");
			int min = in.nextInt();
			
			if(min==0) break;
			else if(min<0) System.out.println("음수는 입력할 수 없습니다.");
			else System.out.printf("%d시간 %d분 입니다.\n", min/60, min%60);
		}
		System.out.print("프로그램을 종료합니다.");
	}
}
