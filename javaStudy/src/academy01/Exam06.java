/*
 * 안녕하세요 '누구누구'님, 반갑습니다.
 * 두 수의 합: 
 * 출력
 */
package academy01;
import java.util.*;

public class Exam06 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		String name = "홍길동";
		System.out.println("안녕하세요 "+name+"님, 반갑습니다.");
		int a =12;
		int b = 5;
		System.out.println("두 수의 합: "+(a+b));
		
		System.out.println(a/b);// int/int = int;
		System.out.println((float)a/b); // int/float = float
		
	}
}
