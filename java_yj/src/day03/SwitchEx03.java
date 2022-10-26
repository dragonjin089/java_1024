package day03;

public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = '+';
		
		switch(ch) {
		case '+', '-', '*' ,'/','%':
			System.out.println(ch + "는 산술 연산자입니다.");
			break;
		default:
			System.out.println(ch + "는 산술 연산자가 아닙니다.");
		}
	}

}
