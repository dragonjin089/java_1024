package day02;
import java.util.*;
public class OperatorEx08 {

		public static void main(String [] args) {
			// 정수를 입력받아 입력받은 정수가 홀수인지 짝수인지 출력하는 코드를 작성하세요
		
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하세요 : ");
			int num1=sc.nextInt();
			
			// boolean isEven =num1 % 2 =0
			// String result  = isEven ? "짝수" : "홀수" ;
			String result = num1 %2==0 ? "짝수" : "홀수" ;
			
		
			System.out.println(num1+"는"+result+"입니다.");
		
			sc.close();
		
		}
}
