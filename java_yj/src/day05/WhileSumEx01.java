package day05;

public class WhileSumEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 부터 10사이의 홀수의 합을 구하는 코드를 while 문으로 작성하세요.
		
		int sum=0;
		int i=1;
		while(i<10) {
			if(i%2!=0) {
				sum+=i;
			}
			i++;// 내가틀린부분
		}
		System.out.println("1부터 10까지의 합"+ sum);	
	
	
	
	

		while(++i<10) {
			
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("1부터 10까지의 합"+ sum);	
	
	
	}

}
