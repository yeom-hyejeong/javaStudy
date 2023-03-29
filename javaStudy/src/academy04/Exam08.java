/*
 * 정렬 
 */
package academy04;
import java.util.*;

public class Exam08 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"번째 숫자 입력: ");
			arr[i]=in.nextInt();
		}
		
		//Arrays.sort(arr);
		//실질적으로 제일 많이 쓰이는 소트
		
		//select sort
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.printf("%d , ", arr[i]);
		}
		System.out.println(arr[arr.length-1]);
	}
}
