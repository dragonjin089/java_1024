package day03;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for(1.초기화;2.5.8.조건식;4.6.증감식){
		 * 
		 * 3.6실행문;
		 * }
		 * 
		 * 1. 초기화 : 조건식 또는 실행문에서 사용하는 변수를 초기화 
		 *  	: for문 시작시 1번만 실행, 생략가능 
		 * 2. 조건식 : 거짓이면 반복문을 종료 , 참이면 반복문을 실행
		 * 			: 생략가능, 생략하면 무조건 참 
		 * 4. 증감식 : 조건식에서 사용하는 변수를 증가 감소 시켜서 반복문 횟수를 결정 
		 * - 초기화 + 조건식 + 증갑식 => 반복횟수를 결정 
		 * - 실행문 : 규칙적인 작업 
		 * 
		 * */
		
		int i;
		for(i = 0; i<5 ; i++) {
			//5
			System.out.println("Hello World");
		}
	}

}
