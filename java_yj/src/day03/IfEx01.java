package day03;

public class IfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * */
//		if(조건식) {
//			조건식의 결과 값이 TRUE 면 조건문 안의 내용 실행 FALSE 면 실행하지 않음 
//		}
		
		//정수 num가 0 보다 크면 양수라고 출력하는 코드를 작성
		// 정수 NUM과 0과 같으면 0이라고 출력
		// 정수 NUM가 0보다 작으면 음수라고 출력
		
		int num=-1;
		
		if(num>0){
			System.out.println(num+"는 양수");
		}
		else if(num==0) {
			System.out.println(num);
		}
		else {
			System.out.println(num+"은 음수");
		}
	
	}

}
