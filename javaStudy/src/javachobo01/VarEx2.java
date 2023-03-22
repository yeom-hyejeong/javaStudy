//두 변수의 값 바꾸기
package javachobo01;

public class VarEx2 {
	public static void main(String[]args) {
		//변수 초기화
		int x=10, y=20;
		int temp=0;//값을 임시로 저장할 공간
		
		System.out.println("x: "+x+", y: "+y);
		
		temp = x;// 임시공간에 x값을 저장
		x = y; // x에 y값을 저장
		y = temp; //y에 임시에 담겨있던 x값 저장
		
		System.out.println("x: "+x+", y: "+y);
	}
}
