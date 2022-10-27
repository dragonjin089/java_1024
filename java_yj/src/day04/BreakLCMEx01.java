package day04;

public class BreakLCMEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 정수의 최소 공배수를 구하는 코드를 작성하시오
		// 2의 배수 : 2,4,6,8
		// 3의 배수 : 3,6,9,12
		// 2와 3의 공배수 : 6,12,18  최소공배수 6
	
		// 반복횟수 :I 는 num1 부터 num1*num2 까지 num1 씩 증가
		// 규칙성 : i가 num1 과 num2 의 배수이면 i를 출력후 반복문종료
		//-> i가 num1의 배수이면 i가 num2의 배수이면 i를 출력후 반복문종류
//		i를 num1,2로 나누었을때 나머지가 0과 같다면 i를 출력후 반복문종료
		
	int num1=2, num2=3;

	int i;
	
	for(i=num1;i<=num1*num2;i++) {
		
		
		if( i%num1==0 && i%num2==0) 
		{
			System.out.println(i);
			
			break;
		}
		
	}

	int num3 =8, num4 =12;
	int j;
	for(j = num3; j<=num3*num4; j+=num3) {

		if( j%num3==0 && j%num4==0) 
		{
			System.out.println(j);
			
			break;
		}
	}
}
}
