package day03;

public class IfEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수 NUM가 2의 배수이면 2의 배수라고 출력하고
		 * 3의배수이면 3의배수라고 출력하고
		 * 6의 배수이면 6의 배수라고 출력하고
		 * 2,3,6 의 배수가 아니면 2,3,6, 의 배수가 아닙니다라고 출력하는 코드 작성
		 * 단 6의 배수는 6의 배수라고만출력
		 * 
		 * */
		int num =9;
		
		if (num%6 ==0 ) {
			System.out.println(num + "는 6의 배수");
		}
		else if(num %2 ==0) {
			System.out.println(num + "는 2의 배수");
		}
		else if (num%3 ==0) {
			System.out.println(num + "는 3의 배수 ");
		}
		else {
			System.out.println(num + "은 2,3,6의 배수가 아닙니다.");
		}
		
		
//int num =6;
//		
//		if(num %2 ==0 && num %3 !=0) {
//			System.out.println(num + "는 2의 배수");
//		}
//		else if (num%3 ==0 && num%2 !=0) {
//			System.out.println(num + "는 3의 배수 ");
//		}
//		else if (num%6 ==0 ) {
//			System.out.println(num + "는 6의 배수");
//		}
//		else {
//			System.out.println(num + "은 2,3,6의 배수가 아닙니다.");
//		}
	
		
	}
	

}
