package day03;
import java.util.*;
public class IfEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	*scanner를 입력받아 +,*,-,/,% 이면 산술연산자라고 출력하고 아니면
	*산술연산자가 아닙니다라고 출력하는 코드를 작성 
	*
	*/
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자를 하나 입력하세요 : ");
	char operator = sc.next().charAt(0);
	
	if(operator == '+' || operator == '-' ||operator == '/' ||
			operator == '*' || operator == '%' ) {
		System.out.println(operator + "는 산술연산자");
	}

	else {
		System.out.println("산술연산자가 아닙니다.");
	}
	
	}
	

}
