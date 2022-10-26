package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Swithch( 식 또는 변수명)
		 * {
		 * case 값1:
		 * 실행문1 ;
		 * break
		 * 
		 * case 값2:
		 * 실행문2 ;
		 * break
		 * 
		 * default:
		 * 실행문3;
		 * }
		 * case 옆에 있는 값들은 정수 ,문자, 문자열만 올수있다.
		 * 변수명은 올수 없다 .리터럴만 올 수 있다.
		 * break : switch 문을 빠져 나가는 역할
		 * default : else와 같음 
		 * switch문을 사용하는 경우 
		 * 1. 식의값이 제한적일때 %연산자 이용하는 경우 
		 * 2. 사용하는 변수값이 제한적일때 : 산술연산자를 이용한 계산 예제
		 * 3. break 가  없으면 다음 case 의 실행문으로 이동 (다음 case 값과 달라도 이동) 
		 * -여러경우를 같이 처리하고 싶으면
		 * case 값1, 값2, 값3:
		 * */
		
		int num = 4;
		switch( num % 2 ) {
		case 0:
			System.out.println(num + "는 짝수");
			break;
			
		default:
			System.out.println(num+ " 는 홀수");
		}
	}

}
