package day14;

public class TryCatchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try{
		 * 예외가 발생할수 있는 코드}
		 * catch(예외클래스1 e){
		 * 예외처리;}
		 * catch(예외클래스2 e){
		 * 예외처리;}
		 * finally{
		 * 실행문;}
		 * - try, catch는 필수 
		 * - catch 1개 이상
		 * - catch 가 여러개인경우 위에 있는 예외 클래스는 아래 클래스의 조상클래스가 오면 안됨
		 * 		예 : 예외 클래스 1에  runtimeException이 오고 
		 * 	 		얘외 클래스2에 ArithmeticException이 오면 안됨
		 * - finally는 선택(없거나 1개있거나) 
		 * 
		 * 
		 * 
//		 * */
//	try {
//		System.out.println(1/0);
//	} catch (ArithmeticException e) {
//		System.out.println("0으로나누면안됩니다.");
//	}catch (RuntimeException e) {
//		System.out.println("실행시 예외발생");
//		// TODO: handle exception
//	
//	}
exception();
}
	public static void exception() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("0으로나누면안됩니다.");
			return;
		}catch (RuntimeException e) {
			System.out.println("실행시 예외발생");
			// TODO: handle exception
		}finally {
			System.out.println("메소드 종료");// return 실행되도 출력이 됨 
		}System.out.println("안녕"); // return 실행시 출력이 안됨
	}
	
}