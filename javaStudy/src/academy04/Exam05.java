/*
 * 방의 갯수를 입력받아 방을 만들고 그 방을 관리하는 프로그램
 */
package academy04;
import java.util.*;

public class Exam05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("방의 갯수 입력: ");
		int roomcount = in.nextInt();
		
		boolean room[]=new boolean[roomcount+1];
		//true - 사용중 , false - 빈방
		int roomnum;
		
		while(true) {
		System.out.print("1.입실   2.퇴실   3.보기   4.종료: ");
		int select = in.nextInt();
		
			switch(select) {
			case 1:
				do {
				System.out.print("입실하실 방의 번호 입력: ");
				roomnum = in.nextInt();
				}while(roomnum<1 || roomnum>roomcount);
				if(room[roomnum]==false) {
					room[roomnum]=true;
					System.out.println(roomnum+"호실에 입실하셨습니다.");
				}else {
					System.out.println(roomnum+"호실은 사용중 입니다.");
				}
				break;
				
			case 2:
				do {
				System.out.print("퇴실하실 방의 번호 입력: ");
				roomnum = in.nextInt();
				}while(roomnum<1 || roomnum>roomcount);
				if(room[roomnum]==true) {
					room[roomnum]=false;
					System.out.println(roomnum+"호실에서 퇴실하셨습니다.");
				}else {
					System.out.println(roomnum+"호실은 빈방입니다.");
				}
				break;
				
			case 3:
				for(int i=0; i<roomcount; i++) {
					if(room[i]) {
						System.out.println(i+1+"호실 - 사용중");
					}else {
						System.out.println(i+1+"호실 - 빈방");
					}
				}
				break;
				
			case 4: 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
}
