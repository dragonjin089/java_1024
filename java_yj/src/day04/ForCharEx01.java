package day04;
import java.util.*;
public class ForCharEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문을 이용하여 종료문자만 q가 입력될때 까지 동작하는 예제 
		Scanner scan = new Scanner(System.in);
		
		char ch ='a';
		for(;ch!='q';) {
			System.out.println("문자를 입력하세요 : ");
			ch =scan.next().charAt(0);
			System.out.println(ch);
		}
		scan.close();
	}

}
