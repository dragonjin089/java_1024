package day04;

public class NestingForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2부터 100 사이의 소수를 출력하는 코드를 작성하세요.
 * 반복횟수 : num을 2부터 100까지 1씩증가
 * 규칙성 : num 가 소수이면 num을 출력
 
 * 반복횟수 : i는 1부터 num까지 1씩증가
 * 규칙성 : num을 i로 나누었을때 나머지 0과 같다면 count 1증가
 * 반복문 종료후 :count 가 2이면 num 출력
 * 반복문 종ㅛ후 : 없음
 * */

	int i,count=0 ;
	int num=2;
	for(num=2; num<=100;num++){
		
		for(i=1,count=0; i<=num;i++)
		{
			if(num%i==0) 
			{
				count++;
			}
		}
		if (count ==2 ) {
			System.out.println(num+" ");

		}
	

	}
	

}
}