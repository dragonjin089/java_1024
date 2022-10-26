package day03;
import java.util.*;
public class IfEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 두정수와 문자를 입력받아 산술연산자이면 산술연산 결과를 출력하는 코드를 작성하시오
		 * 두 정수와 문자를 입력하세요  1 + 2 : 1 ? 2
		 *  1/2 = 0.5
		 *  ?는 산술연산자가 아닙니다.
		 * */
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("두 정수와 문자를 입력받으시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		char operator; 
		
		operator= sc.next().charAt(0);
		
//      틀린 코드 
//		if(operator == '+' ||operator == '*' ||operator == '-' 
//				||operator == '/' ||operator == '%') {
//			System.out.println(""+ num1 + operator + num2 + "=" +(num1num2));
//		}
//		else {
//			System.out.println(""+num1 + '?' + num2);
//		}
		
		if(operator == '+') {
		System.out.println(""+ num1 + operator + num2 + "=" +(num1+num2));
		}
		else if (operator == '*') {
		System.out.println(""+ num1 + operator + num2 + "=" +(num1*num2));
		}
		else if (operator == '-') {
			System.out.println(""+ num1 + operator + num2 + "=" +(num1-num2));
		}
		else if (operator == '/') {
			System.out.println(""+ num1 + operator + num2 + "=" +(num1/num2));
		}
		else if (operator == '%') {
			System.out.println(""+ num1 + operator + num2 + "=" +(num1%num2));
		}
		
		else {
			System.out.println(""+num1 + '?' + num2);
		}
	
	
	}

}
