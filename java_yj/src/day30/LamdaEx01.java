package day30;

import java.util.function.Consumer;

public class LamdaEx01 {

	static String filedStr = "필드";
	public static void main(String[] args) {
	
		String str = "main 지역변수";
		Consumer<Object> con = o->{
			LamdaEx01.filedStr="람다식에서변경";
//			fieldStr=""; 사용안됨
System.out.println(str);// 그냥 사용가능 main 지역변수
//str+=""; //에러발생 . 지역변수에서 람다식에서 final이 자동으로 붙음
		};
		
		
			con.accept("");
			System.out.println(filedStr);
	}

}
