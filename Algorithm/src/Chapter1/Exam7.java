package Chapter1;

import java.util.Scanner;

public class Exam7 {
	
	public String solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer ="YES";
		return answer;
	}
		
	public static void main(String[] args) {
		Exam7 T =new Exam7();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(T.solution(a));

	}

}
