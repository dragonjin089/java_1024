package day14;
import java.util.*;
public class Exception03 {

	public static void main(String[] args) {
		/* 다음과 같은 메뉴를 출력하고 정수를 입력받는 코드를 작성하세요 
		 * 단 , 종료를 선택하면 프로그램이 종료 되고,
		 *  예외처리를 적용하여 정수가 아닌 문자열이 입력되도 프로그램이 계속진행되도록하세요
		 * 
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴선택 : 
		 * */
		
		
		try {
			
		} catch (Exception e) {
			// 종
		}
int menu = -1; // 예외처리위해 초기화 해야함
Scanner scan = new Scanner(System.in);
	do {
		printMenu();
		try {
			menu = scan.nextInt();
			
		} catch (Exception e) {
			System.out.println("입력잘못했다. 정수입력해라 ");
			scan.nextLine();
		}
	}while(menu !=3);
	
	
	}

	public static void printMenu() {
		System.out.println("메뉴 ");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 종료");
		System.out.print("메뉴선택 : ");
	}

	public static void scanInt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("번호 입력하세요 ");
		int num = scan.nextInt();
	}
	
	public static void runMenu(int num) {
		switch(num){
		case 1: 
			System.out.println("플레이");
		break;	
		
		case 2: 
			System.out.println("기록확인");
		break;
		
		case 3: 
			System.out.println("종료");
			break;
			
			default: 
				System.out.println("다른번호입력");
		}
	}
}
