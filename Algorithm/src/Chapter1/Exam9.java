package Chapter1;

import java.util.Scanner;

public class Exam9 {
	private int solution(String str) {
		String answer= "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x))  answer+=x;
		}
		
		
		return Integer.parseInt(answer);
	}
	
	
	
	
	public static void main(String[] args) {
		Exam9 T = new Exam9();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
		
		
	}

	
	
}