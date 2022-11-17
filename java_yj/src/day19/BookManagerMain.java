package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import exampleaccountbook2.Item;

public class BookManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 도서 관리 프로그램을 작성하세요 
		 * 도서 정보 : 
		 * -도서명, 저자(여러명, 엮은이, 옮긴이 다 포함), 가격 , 출판사 , 분류, ISBN 
		 * 기능 
		 * - 도서추가 
		 *  - ISBN으로 정렬
		 * - 도서조회
		 * 	- 도서명으로 조회 
		 * 	- 저자로 조회
		 * 	- 출판사로 조회 
		 * 	- 분류로 조회 
		 * 
		 * - */

		int menu = -1;
		Scanner scan =new Scanner(System.in);
		ArrayList<Book> list = new ArrayList();
		
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(menu,list,scan);
			
		}while(menu!=3);
			
	
	
	}

	private static void runMenu(int menu, ArrayList<Book> list, Scanner scan) {
		// TODO Auto-generated method stub
		
		switch(menu) {
		case 1: 
		
			// 도서 추가 메서드 구현
			insertBook(list, inputBook(scan));
			   //isbn 정렬
			break;
		case 2: 
			System.out.println("도서 조회");
			printSubMenu();
			
			int subMenu = scan.nextInt();
			runPrint(list,subMenu,scan);
//			System.out.println(list);
			break;
		}
	}

	private static void runPrint(ArrayList<Book> list, int subMenu, Scanner scan) {
		
		
		switch(subMenu) {
		case 1: 
			System.out.print("도서명을 입력하세요 :  ");
			String bookName = scan.nextLine();
			//책을 이용하여 객체를 만듬
//			Book book = new Book(bookName);
//			
//			//책 리스트에서 도서명과 같은 도서정보를 가져옴
//			int index = list.indexOf(book);
//			
//			Book tmp = list.get(index);
			
			break;
			
		case 2: 
			System.out.print("작가를 입력하세요 : ");
			
		break;
		
		case 3: 
			System.out.println("출판사를 입력하세요 : ");
			
		break;
		
		case 4:
			System.out.println("장르를 입력하세요 : ");
			
			break;
			
		}
		
	}

	private static void printSubMenu() {
		 
		System.out.println("도서명 조회 메서드");
		System.out.println("1. 도서명으로 조회");
		System.out.println("2. 저자로 조회");
		System.out.println("3. 출판사로 조회");
		System.out.println("4. 장르로 조회");
		System.out.println("--------------------");
		System.out.print("메뉴선택 : ");
	}

	private static void insertBook(ArrayList<Book> list, Book book) {
		// 도서 추가 메서드 
		list.add(book);
	
		
	}
	
//	 * -도서명, 저자(여러명, 엮은이, 옮긴이 다 포함), 가격 , 출판사 , 분류, ISBN

	private static Book inputBook(Scanner scan) {
		System.out.println("도서 추가 메서드 ");
		scan.nextLine();
		System.out.print("도서명 : ");
		String bookName = scan.nextLine();
		System.out.println("저자(엮은이, 옮긴이 ) : ");
		String writer = scan.next();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		scan.nextLine();
		System.out.println("출판사 : ");
		String company = scan.nextLine();
		System.out.println("분류 (소설, 동화, 교양) : ");
		String type = scan.next();
		System.out.println("ISBN : ");
		long isbn = scan.nextLong();
		return new Book(bookName,writer,price,company,type,isbn);
	}

	private static void printMenu() {
		
		System.out.println("도서 관리 프로그램  ");
		System.out.println("1. 도서 추가 ");
		System.out.println("2. 도서 조회 ");
		System.out.println("-------------");
		System.out.print("메뉴 선택 :  ");
	
	}
	

}
