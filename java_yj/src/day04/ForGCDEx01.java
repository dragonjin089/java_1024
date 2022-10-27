package day04;

public class ForGCDEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두정수의 최대 공약수를 구하는 코드를 작성하세요
		// 약수 : 나누었을때 나머지가 0이 되게하는수
		// 공약수 : 두 정수의 약수들 중에서 공통으로 있는 약수 
		// 최대 공약수 : 두 정수의 약수들 중에서 가장 큰 공약수 
		//12 : 1,2,3,4,6,12
		//18 : 1,2,3,6,9,18
		
		// 12와 18의 공약수를 구하시오 : 1 2 3 6
		// 12와 18의 최대 공약수를 구하시오 : 6
		// 반복횟수 : i 는 1부터 num1 까지 1씩증가
//		규칙성  : i는 NUM1 의 약수이고 I 가 NUM2 의 약수이면 GCD에 I저장
//		반복문 종료후 : GCD 출력
//		
		
		
	int num1  =12 , num2 = 18;
	int i, gcd = 1;
	for(i = 1; i <= num1; i++) {
		//i가 num1과 num의 공약수이면
		//=>i가 num1의 약수이고 i가 num2의 약수이다
		if(num1 % i == 0 && num2 % i == 0) {
			gcd = i;
		}
	}
	System.out.println(gcd);
	
}
}