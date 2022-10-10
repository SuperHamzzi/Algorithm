
package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class exam1 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		
		
		
		return answer;
	}
	
	

	public static void main(String[] args) {
		exam1 T = new exam1();
		Scanner sc = new  Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i =0; i<N; i++) {
			arr[i]= sc.nextInt();
		}
		for(int x : T.solution(N, arr)) {	
			System.out.println(x+" ");
		}
				
			
		
	

	}

}
