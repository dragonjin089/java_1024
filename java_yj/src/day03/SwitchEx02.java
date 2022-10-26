package day03;
import java.util.*;
public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * 두 정수와 산술 연산자를 입력 받아 산술 연산 결과를 하는 코드를 switch 문을 작성하세요.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수와 산술연산자를 입력하세요.");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		
		case '+':
		System.out.println(num1+operator+num2+'='+(num1+num2));
		break;
		
		case '*':
			System.out.println(""+num1+operator+num2+'='+(num1*num2));
			break;
		case '-':
			System.out.println(""+num1+operator+num2+'='+(num1-num2));
			break;
		case '/':
			System.out.println(""+num1+operator+num2+'='+(num1/num2));
			break;
		case '%':
			System.out.println(""+num1+operator+num2+'='+(num1%num2));
			break;
		default:
			System.out.println("산술연산자 아님");
			
		}
		
	
	}

}
