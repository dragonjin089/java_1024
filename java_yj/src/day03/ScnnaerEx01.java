package day03;
import java.util.*;
public class ScnnaerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char ch ;
		System.out.print("문자를  입력하세요   : ");
		//charAt(숫자) : 문자열에서 제공하는 기능
		//문자열에서 숫자 번지에 해당하는 문자를 알려줌. 시작번지는 0번지로부터 
		
		ch = sc.next().charAt(0);
		
		System.out.println("입력받은문자는"  + ch + "입니다.");
		sc.close();
		
	}

}
