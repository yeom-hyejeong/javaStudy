package javachobo01;

public class VarEx1 {
	public static void main(String[]args) {
		//변수 선언 = 변수 초기화(year를 0으로 age를 14로 초기화)
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age+2000;// age에 2000을 더한 것
		age = age+1; // age에 1을 더한 것
	
		System.out.println(year);
		System.out.println(age);
	}
}
