package day05;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while 은문법 
		 * while(조건식){
		 * 실행문 ;
		 * }
		 * 
		 * 초기화;
		 * while(조건식){
		 * 
		 *	실행문;
		 *  증감식;
		 *  }
		 *  continue는 while문에서 조건식으로 건너뜀
		 * */
		int i=1;
//		while(i<=5) {
//			System.out.println("helow");
//			i++;
//		}
		
		while(i++ <=5) {
			System.out.println("helow");
			
		}
		
		//while 문에서 조건식 생략 불가
		//while 문에서 무한루프 만들려면 건식에 true 넣어주면 된다. 
		
	}

}
