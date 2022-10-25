package day02;
import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// scanner만듬 System.in 표준 입력
		// Scanner 클래스 객체생성
		
		System.out.println("정수를 입력하세요 : ");
		
		int number = scan.nextInt();
		
		System.out.println(number);
		
		
		System.out.println("실수를 입력하세요 : ");
		double num2 = scan.nextDouble();
		System.out.println(num2);
	
	
		System.out.println("정수 a 와 정수 b를 입력하세요");
		
	
		int number3= scan.nextInt();
		int number4= scan.nextInt();
		
		
		System.out.println("A : " + number3+" B : "+number4);
		//System.out.println(number4);
		
	
		scan.close();
		//scanner 메모리 해제
		
		
	
	}

}
