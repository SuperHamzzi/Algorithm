package Chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		ArrayList<String> arr = new ArrayList<>();
		for(int i=0; i<N; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(a[i]==b[i]) {
				arr.add("D");
			}else if(a[i]==1 && b[i]==3) {
				arr.add("A");
				}else if(a[i]==2 && b[i]==1) {
					arr.add("A");
				}else if(a[i]==3 && b[i]==2) {
					arr.add("A");
				}else {
					arr.add("B");
				}
		}
		String str = arr.toString();
		
		}
				
	}


