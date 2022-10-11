package Chapter3;

import java.util.Scanner;

public class ex3 {
	public int solution(int n, int m, int[] a) {
		int answer = 0; int sum =0;
		for(int i=0;i<m;i++) {
			sum +=a[i];
		}
		for(int i=m; i<n;i++) {
			sum+=(a[i]-a[i-m]);
			answer=Math.max(answer, sum);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		ex3 T = new ex3();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(T.solution(N, M, a));

	}
}
