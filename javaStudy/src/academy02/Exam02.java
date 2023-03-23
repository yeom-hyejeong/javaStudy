//임의의 수를 하나 받아 그 수가 3의 배수인지, 5의 배수인지, 3과 5의 배수인지, 3과 5의 배수가 아닌지를 알려주는 프로그램
package academy02;
import java.util.*;

public class Exam02 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력해주세요: " );
		int n = in.nextInt();
		
		if(n%3==0 && n%5==0) {
			System.out.println("3과 5의 배수입니다.");
		}else if(n%3==0) {
			System.out.println("3의 배수입니다.");
		}else if(n%5==0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}
	}
}
