package exampleaccountbook;

import java.util.*;

public class AccountBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBook ab = new AccountBook(new Scanner(System.in));
		ab.run();
		
		ArrayList<AccountBook> list = new ArrayList<AccountBook>();
		
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		
	do {
		printMenu();
		
		menu = scan.nextInt();
	  
		runMenu()
		
		
	}while(menu!=5);
	
	
	
	
	
	
	}

	private static void runMenu() {
		switch(menu) {
		case 1: 
			//내역종료 
			break;
		case 2:
			//내역확인 
			break;
		case 3: 
			// 내역 수정 
			break;
		case 4: 
			//내역 삭제
			break;
		case 5: 
			System.out.println("프로그램 종료 ");
			break;
		default:
		 System.out.println("다른 번호를 입력해주세요 ");	
		}
		
	}

	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 내역 추가");
		System.out.println("2. 내역 확인");
		System.out.println("3. 내역 수정");
		System.out.println("4. 내역 삭제");
		System.out.println("5. 종료 ");
		System.out.println("__________");
		System.out.print("메뉴 선택 : ");
	}

}
