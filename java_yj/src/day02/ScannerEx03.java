package day02;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		// 콘솔에서 한 단어 이상을 입력하면, next(), 
		//다음 nextLine() 순으로 동작을 하면
		//nextLine에는 콘솔에서 따로 입력하지 않아도 앞에서 입력한 값이 들어간다.
		
		
		System.out.println("한 단어를 입력하세요 : ");
		String str2 = scan.next();
		System.out.println(str2);
		
		scan.nextLine(); // 입력 버퍼에 남아있는 문자열과 공백을 제거 
		System.out.println("한 문장을 입력하세요 : ");
		String str1 = scan.nextLine();
		System.out.println(str1);
		
		
		scan.close();
	}

}
