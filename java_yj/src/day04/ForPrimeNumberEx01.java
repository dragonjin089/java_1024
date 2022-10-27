package day04;

public class ForPrimeNumberEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수 NUM가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수는 약수가 1과 자기 자신뿐인 수 
		 * 1은 소수가 아님
		 * 반복횟수 : i는 1부터 num까지 1씩증가
		 * 규칙성 : I는 num의 약수이면 count(약수의 개수를 1증가)
		 * 반복문 종료후 : count가 2이면 소수라고 출력하소 2보다 크면 소수가 아님이라고 출력
		 * 
		 * 
		 * */
	
		int num =3;
		
		int i,count=0;
		
		for(i=1;i<=num;i++) 
		{
			
			if(num%i==0) 
			{
			count ++;
			}
			
		}
		
		if(count==2) {
			System.out.print("소수입니다.");
		}
		else  {
			System.out.println("소수가 아닙니다.");
		}

}
}