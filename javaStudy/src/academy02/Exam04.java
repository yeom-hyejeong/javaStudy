//국어점수와 영어 점수를 받아 평균값이 90이상이면 수, 80이상 우, 70이상 미, 60이상 양, 59미만 가
package academy02;

import java.util.*;

public class Exam04 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어 점수 입력: ");
		int kor = in.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = in.nextInt();
		
		int avg = (kor+eng)/2;
		
		if(avg >= 90) {
			System.out.print("수");
		}else if (avg >=80 ){
			System.out.print("우");
		}else if(avg >= 70) {
			System.out.print("미");
		}else if(avg>=60) {
			System.out.print("양");
		}else {
			System.out.print("가");
		}
		/*
		switch(avg/10) {
		case 9: case 10: System.out.print("수"); break;
		case 8: System.out.print("우"); break;
		case 7: System.out.print("미"); break;
		case 6: System.out.print("양"); break;
		default: System.out.print("가"); 
		}
		*/
	}
}
