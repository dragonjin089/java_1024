package day01;

public class VariableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언 
		/*
		 * 자료형 변수명;
		 * 자료형 변수명 =초기값;
		 * 자료형 
		 */
		
		boolean isEven = false;
		char operation ='+';
//				문자 ''
		int age = 20;
		float temperature= 15.0f; // float는 접미사 F나 f를 반드시 작성해야한다.
		double pi =3.1415;
		//기본자료형
		String str ="hi";		
//		참조형 변수 
//		String "" 
		
		// 사과의 개수를 저장하기 위한 변수를 선언해주세요 
		
		int applecount = 5;
		System.out.println(applecount+"개");
		
		// 학생 평균 성적을 지정하기위한 변수를 선언해주세요
		
		int math1=90 , math2 =80;
		
		int avg1 = (math1 + math2)/2 ;
		System.out.println(avg1+"점");
		
//		관례
//		변수는 소문자로 시작, 
//		카멜 표기법 두번째 글자부터 첫 글자는 대문자로 
//		클래스와 인터페이스는 대문자로 시작 
//		
	}

}

