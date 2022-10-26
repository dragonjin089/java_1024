package day03;
import java.util.*;
public class SwitchEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 월을 입력받아 해당하는 월의 마지막일을 출력하는 코드를 작성하시오.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1, 3, 5, 7, 8, 10, 12: 
			System.out.println(num + "월은"+ " 31일까지 있습니다.");
			break;
		
		case  4, 6, 9, 11:
			System.out.println(num + "월은"+ " 30일까지 있습니다.");
			break;
		
		case 2:
			System.out.println(num + "월은"+ " 28일까지 있습니다.");
			break;
		
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
