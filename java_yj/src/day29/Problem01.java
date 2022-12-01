package day29;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1 = "abc";
		String str2 = "abc";
		String str3 = scan.next(); // abc 를 입력했다고가정
		
		System.out.println(str1 ==str2);
//		abc 는 리터럴 문자열이다 
//		이미 사용된 리터럴 문자열을 이용하는겨웅 
//		새로선언하는게 아니라 기존에 선언된 리터럴 문자열의 주소를 알려줌
//      첫번째 출력은 true가 됨 
		System.out.println(str1.equals(str3));
//Scanner 를 이용하여 입력받은 문자열은 리터럴 문자열이 아니기때문에 
//		입력한 문자열이 앞에 사용중인 리터럴 문자열이더라도 새로 할당하여 주소로 그래서 두번째 출력은 ㄱ
//		공유하는게 아니기때문에 false 가됨
	}

}
