package Chapter2;

import java.util.Scanner;



public class exam11 {
	public int solution(int n, int[][] arr) {
		int answer =0, max=Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			int cnt =0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5;k++) {
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
		if(cnt>max) {
			max=cnt;
		answer=i;
		}
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		exam11 T = new exam11();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N+1][6];
		
		for(int i =1; i<N; i++) {
			for(int j =1; j<6; j++) {
				arr[i][j] =sc.nextInt();
		
			}
		}
		System.out.println(T.solution(N,arr));
		
		
		
		
	}
}
