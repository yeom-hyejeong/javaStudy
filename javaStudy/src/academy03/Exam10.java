/*
 * 사용자가 1~100사이의 수를 선택하고 컴터가 맞추는 게임
 */
package academy03;
import java.util.*;
public class Exam10 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("1~100까지의 수를 생각하고 ENTER키를 누르세요!");
		in.nextLine();
		int multi =100, plus =1;
		
		while(true) {
			int su = (int)(Math.random()*multi)+plus;
			System.out.println("생각하신 수가 "+su+"입니까?");
			System.out.println("1.UP  2.DOWN  3.정답: ");
			int check = in.nextInt();
			
			if(check==3) {
				break;
			}else if(check ==1) {
				multi = (multi+plus-1)-su; //100에서 선택한 수만큼 빼야함
				plus = su+1;
			}else if(check==2) {
				multi = su - plus;
			}else {
				System.out.println("잘 못 입력하셨습니다.");
			}
		}
		System.out.println("정답을 맞추어서 프로그램을 종료합니다.");
	}
}
