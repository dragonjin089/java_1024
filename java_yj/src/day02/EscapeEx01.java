package day02;

public class EscapeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ch1 = '\t';// 탭
			char ch2 = '\n';// 개행
			char ch3 = '\\';// 역슬래시
			char ch4 = '\'';// 작은 따옴표 
			char ch5 = '\"';// 큰따옴표
			char ch6 = '\u002D'; //002B는 16진수로 10진수 43에 해당
			
			System.out.println(ch1+ "안녕하세요");
			System.out.println(ch2+ "안녕하세요");
			System.out.println(ch3+ "안녕하세요");
			System.out.println(ch4+ "안녕하세요");
			System.out.println(ch5+ "안녕하세요");
			System.out.println(ch6+ "안녕하세요");

	}

}
