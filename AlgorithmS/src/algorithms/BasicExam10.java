package algorithms;

public class BasicExam10 {
	public static void main(String[] args) {
		int count=0;
		for(int i=4;i<=500;i++) {
			int sum =0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum += j;
				}
					if(i==sum) {
						count++;
					}
				}
			
		}
		System.out.println(count);
	}
}
