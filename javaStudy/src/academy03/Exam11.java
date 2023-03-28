/*
 * 가위바위보 게임 만들기
 */
package academy03;
import java.util.*;

public class Exam11 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
		int com = (int)(Math.random()*3)+1;
		System.out.print("1.가위   2.바위   3.보   4.종료: ");
		int su = in.nextInt();
		
		
		if(su == 4){
			break;
		}else if(com==su) {
			System.out.println("비겼습니다.");
		}else if(su == 1) {
			if(com == 2) System.out.println("졌습니다.");
			else if(com == 3) System.out.println("이겼습니다.");
		}else if(su == 2) {
			if(com == 1) System.out.println("이겼습니다.");
			else if(com == 3)System.out.println("졌습니다.");
		}else if(su == 3) {
			if(com == 1) System.out.println("졌습니다.");
			else if(com == 2) System.out.println("이겼습니다.");
		}
	}
		System.out.println("프로그램을 종료합니다.");
	}
}
