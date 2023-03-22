/*
 * 연산자 정리
 */
package academy01;

public class Exam07 {
	public static void main(String[]args) {
		int _k = 10;
		int a  =9;
		System.out.println(a==10? "a는 10입니다.":"a는 10이 아닙니다.");//조건? 참: 거짓
		
		int b, c;
		b =10;
		c =20;
		//참이면 true, 거짓이면 flase
		System.out.println(b>c);
		System.out.println(b<c);
		
		System.out.println(a++);//a를 출력하고 a증가
		System.out.println(++b);//b증가하고 출력
		System.out.println(a);//증가된 a출력
		
		
		int aa =10;
		int bb =13;
		System.out.println(aa==bb & ++aa>bb); //10==13 & 11>13 -- false
		System.out.println(aa==bb & ++aa>bb); //11==13 & 12>13 -- false
		System.out.println(aa==bb & ++aa>bb); //12==13 & 13>13 -- false
		System.out.println(aa==bb & ++aa>bb); //13==13 & 14>13 -- true
		
		boolean k = true;
		System.out.println(!k);
		
	}
}
