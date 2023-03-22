/*
 * 여러 설명을 달고 싶을 때 다는 주석
 * 클래스 이름 앞에 public이 붙으면 해다 클래스명이 파일명
 * 
 */
package academy01;

public class Exam01 {
	public static void main(String[]args) {
		System.out.println("Yeom HJ");
		int a = 10;
		System.out.println(a);
		
		//byte a = 200; 오류
		byte d = (byte)200;
		//d값에 무조건 넣기 위해서 (byte)를 넣음 = 강제형변환
		//char은 음수가 안되니까 byte로 하면 앞에 (char)로 강제형변환
		
		String name ="이름";
		System.out.println(name);
	}
}
