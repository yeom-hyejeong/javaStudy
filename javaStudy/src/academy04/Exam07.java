/*
 * 10000번 반복했을 때 가장 많이 나온 random 값 6개 출력
 */
package academy04;
import java.util.*;

public class Exam07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int lotto[]=new int[45];
		int rank[]=new int[45];
		
		for(int k=1; k<=10000; k++) {//10000번 반복했을 때
			int com[]=new int[6]; //6개의 숫자를 받음
			for(int i=0; i<6; i++) {
				com[i]=(int)(Math.random()*45)+1; 
				for(int j=0; j<i; j++) {
					if(com[i]==com[j]) { 
						i--;
						break;
					}
				}
			}
			
			for(int i=0; i<6; i++) {
				lotto[com[i]-1]++;  //랜덤으로 com이 받은 숫자의 count체크
				//com이 1~45까지의 숫자 중 만일 40을 받으면 lotto[39]번방에 +1
				//10000번 반복하면서 com이 40을 랜덤으로 받은 수만큼 ++
				//lotto의 시작은 0부터 이므로 1을 빼줌
			}
		}
		//10000번 반복 종료
		
		for(int i=0; i<45; i++) {
			for(int j=0; j<45; j++) {
				if(lotto[i]<lotto[j]) {
					rank[i]++;
					//랭크 측정
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<45; j++) {
				if(rank[j]==i) {
					System.out.println(j+1);
					//랭크 1~6위 출력
				}
			}
		}
		
		for(int i=0; i<45; i++) {
			System.out.printf("%2d번 ==> %d, 순위 : %d\n",	i+1, lotto[i], rank[i]+1);
		}
	
	}
}
