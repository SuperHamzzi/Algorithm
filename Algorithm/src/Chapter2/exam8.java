package Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exam8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
	
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		for(int i=0; i<N; i++) {
			int count = 1;
			for(int j=0; j<N; j++) {
					if(arr[j]>arr[i]){
						count++;
					}
					
			}
			arr[i] = count;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
}
