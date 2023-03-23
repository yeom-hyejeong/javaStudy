//10개의 수를 입력받아 그 합과 평균을 구하는 프로그램 
//단, 평균은 소수점 2자리까지 나타나게 해주세요
package academy02;
import java.util.*;

public class Exam05 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		
		for(int i=0; i<10; i++) {
			System.out.print("수를 입력: ");
			int num = in.nextInt();
			sum += num;
		}
		System.out.println(sum);
		System.out.printf("%.2f", sum/10.0);
	}
}
