package Chapter2;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N =sc.nextInt();
			
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				if(i==1 || i==0) {
					arr[i]=1;
					}
				else {
				arr[i]=arr[i-1]+arr[i-2];
					}
			
				}
			for(int x : arr) {
				System.out.print(x+" ");
			}
			
			
	}
	}


