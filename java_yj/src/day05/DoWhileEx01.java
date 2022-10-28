package day05;

public class DoWhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 문 , while 문 상황에 따라 한번도 동작하지 않을수 있다.
		//do while문은 최소 1번은 실행된다.
//
//		do {
//			실행문;
//		}while(조건식); // 여기에있는 ; 필수
		//Hello 출력되지 않음
		
		//for문 : 순차적으로 증가/감소 해서 반복문이 실행하는 경우
		//while 문 : 특정값을 입력받아 활용하는 경우 값이 순차적이지 않는 경우 
		// 단순 횟수만 사용 되는 경우
		for (int i=1; i>=5; i++) {
			System.out.println("hello");
			
		}
		int j=1;
		do{
			System.out.println("hello");
			
		}while(j>=5);
	}

}
