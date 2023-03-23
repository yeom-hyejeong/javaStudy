//임의의 수 2개와 산술연산자를 입력받아 그 연산자 대로 실행하는 프로그램
package academy02;
import java.util.*;
import java.io.*;

public class Exam03 {
	public static void main(String[]args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력: ");
		int num1 = in.nextInt();
		System.out.print("두 번째 수 입력: ");
		int num2 = in.nextInt();
		System.out.print("연산자 입력: ");
		char ch = (char)System.in.read();
		//키보드로부터 들어오는 한 글자를 입력 받겠다는 의미
		//예외처리(throws IOException)후에 import까지
		
		if(ch =='+') {
			System.out.printf("%d + %d = %d", num1, num2, (num1+num2));
		}else if(ch == '-') {
			System.out.printf("%d - %d = %d", num1, num2, (num1-num2));			
		}else if(ch =='*') {
			System.out.printf("%d * %d = %d", num1, num2, (num1*num2));						
		}else if(ch == '/') {
			System.out.printf("%d / %d = %d", num1, num2, (num1/num2));									
		}else if(ch =='%') {
			System.out.printf("%d % %d = %d", num1, num2, (num1%num2));												
		}else {
			System.out.println("산술 연산자가 아닙니다.");
		}
		
	
	}
}
