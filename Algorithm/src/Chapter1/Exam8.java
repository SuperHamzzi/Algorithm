package Chapter1;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
			Exam8 T = new Exam8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

	private String solution(String str) {
		 String answer = "NO";
		 str=str.toUpperCase().replaceAll("[^A-Z]","");
		 String tmp = new StringBuilder(str).reverse().toString();
		 if(str.equals(tmp)) answer ="YES";
				
				
				return answer;
	}

}
