/*
 * 컴퓨터가 1~100사이의 수를 선택하여 맞추는 게임
 */
package academy03;
import java.util.*;
public class Exam09 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int com = (int)(Math.random()*100)+1;
		int co = 0;
		
		while(true) {
			System.out.print("수를 입력: ");
			int num = in.nextInt();
			co++;
			if(com==num) break;
			else if(com>num) System.out.println("UP");
			else if(com<num) System.out.println("DOWN");
		
		}
		System.out.println(co+"번 만에 맞추셨습니다.");
	}
}
