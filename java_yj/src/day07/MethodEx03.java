package day07;

public class MethodEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//주어진 정수 num 이 소수인지 아닌지 판별하는 코드를 작성하세요
	//단 메소드를 이용할것 
		primeNumber(19);
		printPrimeNumber(7);
		
		
		System.out.println(isPrimeNumber(10));
	}
	public static void primeNumber(int num) 
	{
		
		int count=0;
		
		for(int i=1;i<=num;i++) 
		{
			if(num%i==0) 
			{
			count ++;
			}
		}
		
		if(count==2) {
			System.out.println(num + " 소수입니다.");
		}
		else  {
			System.out.println(num + " 소수가 아닙니다.");
		}
		
		
	}
//**** 강사코드 
// 기능 : 정수가 주어지면 소수인지 아닌지 출력하는 메소드 
//		매개변수 : 정수  => int num1
//		리턴타입 : 출력 => 없음 => void 
//		메소드명 : printPrimeNumber
	
	public static void printPrimeNumber(int num) {
		int count=0;
		for(int i=1;i<=num;i++) 
		{
			if(num%i==0) 
			{
			count ++;
			}
		}
		
		if(count==2) {
			System.out.println(num + " 소수입니다.");
		}
		else  {
			System.out.println(num + " 소수가 아닙니다.");
		}
		
	}
// 기능 : 정수가 주어지면 소수인지 아닌지 알려주는 메소드 
//		매개변수 : 정수  => int num1
//		리턴타입 : 소수인지 아닌지 => boolean
//		메소드명 : isPrimeNumber

	public static boolean isPrimeNumber(int num) {
	
	 
		for(int i=2;i<num;i++) 
		{
			//1과 num을 제외한 약수 
			if(num%i==0) 
			{
				return false;
			}
		}
		
	
		return num <=1 ? false : true;
	}
}
