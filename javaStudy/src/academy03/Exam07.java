/*
 * 임의의 수를 입력받는다. 음수나 0이 들어올 때까지 값을 입력받고, 음수나 0이 들어오면 음수나 0을 제외한 합과 평균값(소수점 2자리)를 알려주는 프로그램
 */
package academy03;
import java.util.*;

public class Exam07 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while(true) {
			System.out.print("수를 입력: ");
			int num = in.nextInt();
			if(num>0) {
				count++;
				sum += num;
			}else if(num<=0) {
				break;
			}
		}
		System.out.printf("총합: %d, 평균: %.2f\n", sum, (float)sum/count);
	}
}
