package Chapter3;

import java.util.Scanner;

public class ex6 {
	public int solution(int n,int m,int[] arr) {
		int answer =0;
		int lt=0,count=0;
		for(int rt=0; rt<arr.length; rt++) {
			
			if(arr[rt]==0)  count++;
				while(count>m) {
					if(arr[lt]==0) count--;
					lt++;
				}
					answer=Math.max(answer,rt-lt+1);
				
		}
		return answer;
	}
	
	
	
	
	
	public static void main(String[] args) {
		ex6 T = new ex6(); 
		Scanner sc =new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int[] arr = new int[n];
		 for(int i=0; i<n; i++) {
			 arr[i] = sc.nextInt();
		 }
		 System.out.println(T.solution(n,m,arr));
	}
}
