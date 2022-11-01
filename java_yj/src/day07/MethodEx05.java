package day07;

public class MethodEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 10까지 합을 구하는코드를 작성하세요 단 , 메소드를 이용할것
	
	sum(10);
	sum1(7,10);
	int start = 10, end = 1;
	System.out.println(start + "부터" + end + "까지의합 : " +sum2(start,end));
	}

	/*
	 * 기능 : 시작숫자부터 끝 숫자 사이의 모든 정수를 더하고 , 더한 결과를 알려주는 메소드
	 * 매개변수 : 시작숫자 , 끝숫자 => 
	 * 리턴타입 : 더한결과 => 정수 => int
	 * 메소드명 : sum
	 * */
	public static void sum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++) 
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//5부터 10 까지 함수 
	
	public static void sum1(int start, int end) {
		
		int sum1 = 0;
		for(int i = start ; i<= end ; i++) {
			sum1+=i;
		}
		System.out.println(sum1);
	}
	
	//강사님코드
	public static int sum2(int start, int end) {
		if(start>end ) {
			int tmp = start;
			start = end;
			end =tmp;
		}//  두수바꾸기 코드 
		
		int sum2 = 0;
		for(int i = start ; i<= end ; i++) {
			sum2+=i;
		}
	
		return sum2;
	}	
	
}
