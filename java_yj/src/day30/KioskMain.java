package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class KioskMain {

	/* 제품을 관리하는 프로그램을 작성하세요 .
	 *  -구매가격, 판매가격은 변동이 없음 
	 *  기능
	 * - 제품 등록(분류, 제품명, 수량, 구매가격, 판매가격)
	 * - 제품 수정
	 * - 제품 삭제 
	 * - 제품 구매 
	 * - 제품 판매
	 * - 매출액 확인
	 * 	-년별
	 * 		-제품별
	 * 	-	-전체
	 * 	-월별
	 * 		-제품별
	 * 		-전체
	 * 	-일별
			-제품별
	 * 		-전체
	 * 
	 * 분류 : 식품
	 * 제품명 : 진라면
	 * 수량 : 0 
	 * 구매가격 : 400원
	 * 판매가격 : 500원
	 * 진라면 100개 구매 -> 진라면 수량 100개
	 * 진라면 10개 판매 (날짜) => 진라면 수량 90개 
	 * */
	private static Scanner scan = new Scanner(System.in);
	private static List<Product> productList = new ArrayList<Product>();
	public static void main(String[] args) {
		
		int menu = -1;
		do {
			printMenu();
			menu = scan.nextInt();
			runMainMenu(menu);
		} while (menu!=6);

	}

	private static void runMainMenu(int menu) {
		switch(menu) {
		case 1: registerProduct();	break;
		case 2: updateProduct(); 	break;
		case 3: deleteProduct();	break;
		case 4: buyProduct();    	break;
		case 5: sellProduct();		break;
		case 6:checkSoldPrice();	break;
		case 7:System.out.println("프로그램 종료합니다.");break;
		default: System.out.println("다른메뉴를 선택해주세요");
		}
	}
	
	
	
	
	
	private static void sellProduct() {
		
		
	}

	private static void buyProduct() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

	private static void updateProduct() {
		if(productList.size() == 0)
			System.out.println("수정할 제품이 없습니다." );
		
		
	}

	private static void checkSoldPrice() {
		int submenu = -1;
		do {
			printSubMenu();
			submenu = scan.nextInt();
			subRunMenu(submenu);
		}while(submenu!=4);
		
	}

	private static void registerProduct() {
		scan.nextLine();
		System.out.print("분류 : ");
		String type = scan.nextLine();
		System.out.print("제품명 : ");
		String name = scan.nextLine();
		System.out.print("수량 : ");
		int count = scan.nextInt();
		System.out.print("구매가격 : ");
		int buyPrice = scan.nextInt();
		System.out.print("판매가격 : ");
		int sellPrice = scan.nextInt();
	
		Product product = new Product(type, name, count, buyPrice, sellPrice);
		productList.add(product);
		System.out.println(productList);
		
	}

	private static void subRunMenu(int submenu) {
		switch(submenu) {
		case 1:
			// 연도별
			byYear();
			break;
			
		case 2: 
			//월별
			byMonth();
			break;
		case 3:
			//일별 
			byDay();
			break;
		case 4: 
			System.out.println("이전으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
		}
	}
	
	private static void byDay() {
		printSubMenuMethod();
	}

	private static void byMonth() {
		printSubMenuMethod();
	}

	private static void byYear() {
		printSubMenuMethod();
	}

	private static void printSubRunMenuMethod2(int submenu){
		switch(submenu){
		case 1:
			System.out.println("1. 제품별");
			break;
			
		case 2: 
			System.out.println("2. 전체");
			break;
			
		case 3:
			System.out.println("이전으로 돌아가기");
			break;
			
		default: 
			System.out.println("다른메뉴를 입력하세요");
				
		}
	}

	private static void printSubMenuMethod() {
		int submenu = -1;
		do {
			printSubMenu2();
			submenu =scan.nextInt();
			printSubRunMenuMethod2(submenu);
		}while(submenu!=3);
	}
	private static void printSubMenu2() {
		printBar();
		System.out.println("1. 제품별");
		System.out.println("2. 전 체");
		System.out.println("3. 이 전");
		printBar();
		System.out.print("메뉴 선택 : ");
	}

	private static void printSubMenu() {
		System.out.println("매출액 확인 메뉴 ");
		printBar();
		System.out.println("1. 년별");
		System.out.println("2. 월별");
		System.out.println("3. 일별");
		System.out.println("4. 이전으로 돌아가기");
		printBar();
		System.out.print("메뉴 선택 : ");
	}
	private static void printMenu() {
	
//		제품 등록(분류, 제품명, 수량, 구매가격, 판매가격)
//		 * - 제품 수정
//		 * - 제품 삭제 
//		 * - 제품 구매 
//		 * - 제품 판매
//		 * - 매출액 확인
		
		System.out.println(" - - - - 메뉴 - - - -");
		printBar();
		System.out.println("1. 제품 등록");
		System.out.println("2. 제품 수정");
		System.out.println("3. 제품 삭제");
		System.out.println("4. 제품 구매");
		System.out.println("5. 제품 판매");
		System.out.println("6. 매출액 확인");
		System.out.println("7. 프로그램 종료");		
		printBar();
		System.out.print("메 뉴 선 택 : ");
	}
	private static void printBar() {
		System.out.println("====================");
	}

}
