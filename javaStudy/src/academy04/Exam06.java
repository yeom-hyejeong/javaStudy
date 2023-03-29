/*
 * 로또 프로그램만들기
 * 컴퓨터가 1~45의 수 6개를 중복되지 않은 수를 선택
 */
package academy04;
import java.util.*;
public class Exam06 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int comsu[]=new int[6];
		int select[]=new int[6];
		
		for(int i=0; i<6; i++) {
			comsu[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(comsu[i]==comsu[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			do {
				System.out.print(i+1+"번째 로또 번호 입력: ");
				select[i]=in.nextInt();
			}while(select[i]<1 || select[i]>45);
			for(int j=0; i<i; j++) {
				if(select[i]==select[j]) {
					i--;
					break;
				}
			}
		}
		int co =0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(comsu[i]==select[j]) {
					co++;
					break;
				}
			}
		}
		System.out.print("맞춘 갯수: "+co);
	}
}
