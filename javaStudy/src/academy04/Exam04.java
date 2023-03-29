/*
 * 인원수를 입력받고 그 인원수 대로 이름과 국어, 영어 점수를 입력받은 후, 이름과 총점 순위를 알려주는 프로그램
 */
package academy04;
import java.util.*;

public class Exam04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원 수를 입력: ");
		int p = in.nextInt(); //people
		
		String name []= new String[p];
		int kor[]=new int[p];
		int eng[]=new int[p];
		int sum[]=new int[p];
		int rank[] =new int[p];
		
		for(int i=0; i<p; i++) {
			System.out.print(i+1+"번째 이름: ");
			name[i]=in.next();
			System.out.print(i+1+"번째 국어 점수: ");
			kor[i]=in.nextInt();
			System.out.print(i+1+"번째 영어 점수: ");
			eng[i]=in.nextInt();
			
			sum[i]=kor[i]+eng[i];
			rank[i]=1;
		}
		
		for(int i=0; i<p; i++) {
			for(int j=0; j<p; j++) {
				if(sum[i]>sum[j]) rank[j]++;
			}
		}
		
		for(int i=0; i<p; i++) {
			System.out.printf("%s님의 총점은 %d점이고, 순위는 %d등입니다.\n", name[i], sum[i], rank[i]);
		}
		
		
	}
}
