package day14;

public class ThrowEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(mod(1,0));
		try {
			throwTest();
		}catch(Exception e) {
			System.out.println("예외발생");
		}
	}
	private static void throwTest() throws Exception {
		throw new Exception();
	}
	//throws 역할 메소드가 실행됐을때 발생할 수 있는 예외를 표시
//	','를 통해서 여러개가능
	// RuntimeException 과 자식 예외 클래스들은 생략가능 
	// 그외 예외 클래스들은 생략 불가능 
	// throw : 예외를 발생시킴 . 조건에 따라 의도적으로 예외를 발생시킴 
//				예외 객체를 던져줌.
//		throw를 통해 예외가 발생하면 메소드를빠져나옴
	public static int mod(int num1, int num2)throws ArithmeticException{
		return num1 % num2;
	}
}
