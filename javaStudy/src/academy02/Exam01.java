//임의의 수 3개를 입력 받아 큰수대로 나열하기

package academy02;
import java.util.*;

public class Exam01 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int [3];
		
		for(int i=0; i<3; i++) {
			System.out.print("수를 입력해주세요!: ");
			int n = in.nextInt();
			arr[i]=n;
		}
		int temp;
		//제일 큰 수를 arr[0]으로 배치
		if(arr[1]>arr[0] && arr[1]>=arr[2]) {
			temp = arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
		}else if(arr[2]>arr[1] && arr[2]>arr[0]) {
			temp = arr[0];
			arr[0]=arr[2];
			arr[2]=temp;
		}
		
		//두 번째 큰 수 arr[1]
		if(arr[2]>arr[1]) {
			temp=arr[1];
			arr[1]=arr[2];
			arr[2]=temp;
		}
		
		System.out.printf("%d >= %d >= %d \n", arr[0], arr[1], arr[2]);
		
	}
}
