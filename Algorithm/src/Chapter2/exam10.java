package Chapter2;

import java.util.Scanner;

public class exam10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int[][] arr = new int[N+2][N+2];
		
		for(int i=0; i<N+2; i++) {
			for(int j=0; j<N+2; j++) {
				if(i==0 && j==0 && i==N+1 && j== N+1) {
					arr[i][j]=0;
				}else {
				arr[i][j] =sc.nextInt();
				}
				}	
		}
		int count=0;
		for(int i=0; i<N+2; i++) {
			
			for(int j=0; j<N+2; j++) {
				if(arr[i][j+1]>=arr[i][j] && arr[i][j-1]>=arr[i][j] && arr[i-1][j]>=arr[i][j]
					&&	arr[i+1][j]>=arr[i][j]) {
					
				}else {
					count++;
				}
				}	
		}
		System.out.println(count);
	}
}
