package Chapter1;

import java.util.Scanner;

public class Main {
//	4와
//	문자 입력받기
//	#을1로 변환
//	*을0으로 변환해서
//	char값 받고 string 변환하거나 붙이기
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		char[] a = new char[N*4];
		for(int i=0; i<N*4; i++) {
			 a[i] = sc.next().charAt(0);
			 if(a[i]=='#') {
				 a[i]=1;
			 }else {
				 a[i]=0;
			 }
		}
		
		

	}

}
