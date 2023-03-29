/*
 * 3사람의 이름과 전화번호를 입력받고 출력시켜주느 프로그램
 */
package academy04;
import java.util.*;

public class Exam02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String name [] = new String[3];
		String tel [] = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(i+1+"번째 사람 이름: ");
			name[i]= in.next();
			System.out.print(i+1+"번째 사람 번호: ");
			tel[i]=in.next();
		}
		
		for(int i=0; i<3; i++) {
			System.out.printf("%s님의 전화번호는 %s\n", name[i], tel[i]);
		}
	}
}
