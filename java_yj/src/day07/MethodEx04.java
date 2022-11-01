package day07;

public class MethodEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		Test t = new Test();
		printNum(num);
		printNum(num);
		printTest(t); //0초기화
		printTest(t);
	}

	//main 에 있는 num와 printNum에 있는 
	//	num은  이름은 같지만 서로 다른 변수 ,
	//값을 복사해서 가져옴
	
	
	public static void printNum(int num)
	{
		//매개변수가 기본 자료형인 경우 , printNum에서 숫자를 바꿔도 main 에서 num은 안바뀐다.
		
		System.out.println(num);
		num =20;
	}
	
	// 매개변수가 참조변수인 경우 , 다른곳에서 숫자를 바꾸면 main 에 있는 값도 바뀔수 있습니다.
	public static void printTest(Test t) {
		System.out.println(t.a);
		t.a=20;
	}
	
}	
	class Test {
		int a; 
		
	}


