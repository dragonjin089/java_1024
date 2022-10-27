package day04;

public class ForSumEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//1부터 10 사이의 짝수의 합을 구하는 코드를 작성하시오.
		// 1. if 문활용
		
		int i;
		int sum=0;
		for(i=1;i<=10;i++) {
			if(i % 2 == 0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	
	
		
		//예제 2 
		int j,sum1;
		
		for(j=1,sum1=0;j<=10;j++) {
			j = j*2;
			sum1 +=j;
		}
	
	System.out.println(sum);
	
	}
}
