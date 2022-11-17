package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPhoneNumberEx01 {

	public static void main(String[] args) {
		/*
		 * 전화번호 정규 표현식을 작성하여 입력받은 번호가 전화번호가 맞는지 작성하세요 .
		 * 규칙 1.
		 * 010- 1234 - 5678[0]
		 * 01012345678[x]
		 * 011-1234-5678[x]
		 * 내코드
		 * [0]+[1]+[0]+-\\d{4}+-\\d{4}
		 * 010-\\d{4}-\\d{4}
		 * 010(-\\d{4}){2}";
		 * */
		
		
		String regex ="010(-\\d{4}){2}";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(Pattern.matches(regex,str)) {
			System.out.println(str + "은 번호 형식입니다..");
		}else {
			System.out.println(str + "은 번호 형식이 아닙니다.");
		}
		
	}

}
