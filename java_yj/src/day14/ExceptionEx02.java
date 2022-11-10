package day14;

import java.util.*;
public class ExceptionEx02 {

	public static void main(String[] args) {
		/*Scanner 를 통해 정수를 입력 받아 입력받은 정수를 출력하는 코드를 작성하세요.*/
//		정수대신 문자열을 입력하면 예외가 발생하는데 이예외를 처리하는 코드를 작성하세요
		
		try {
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			System.out.println(num);
			
		} catch (InputMismatchException e) {
			
		System.out.println("정수입력해라");
		}
	
	}
	
	
	

}
