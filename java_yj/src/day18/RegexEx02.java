package day18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idregex = "^[a-z0-9-\\-]{5,20}$";
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		if(Pattern.matches(idregex, id)) {
			System.out.println("올바른 아이디");
		}
		else {
			System.out.println("아이디는 5~20자 영문 소문자 ");
		}
		scan.close();
	}

}
