package day29;

import lombok.Data;

public class Problem04 {

	static String str;
	public static void main(String[] args) {
		//NUllpointerException 이 발생 str 은 null 초기화 되어있는데 
		//문자열은 저장하지 않고 메소드를 호출했기 때문에 
		System.out.println(str.substring(0));
	}
	
}