package academy01;

public class Exam03 {
	public static void main(String[]args) {
		System.out.print("안녕하세요");//줄개행 없음
		System.out.println("자바 수업시간입니다.");//줄개행
		System.out.println("수업시간은 9시부터 6시까지 입니다.");
		
		System.out.printf("%3d + %6.2f = %d", 10, 20.004, 10+20);
		//%.2f는 소수점을 2자리까지만 표시해달라는 의미, 숫자만큼 자릿수
		System.out.println();
		//\n을 쓰지 않으면 이걸 써서 줄개행
		System.out.printf("%3d + %8.2f = %d\n", 10, 20.0004, 10+20);
		//%숫자를 쓰면 자릿수 맞추기, f에도 숫자.숫자하면 앞 자리 숫자는 자릿수 맞추기(소수점 포함) 뒷 숫자는 소수점 수
	}
}
