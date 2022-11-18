package day20;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

import exampleaccountbook2.Item;

public class BookManagerMain2 {
//스캐너 필드로
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu = -1;
		ArrayList<Book> list = new ArrayList<Book>();
		do {
			
			printMenu();
			
			//메뉴를 선택
			menu = scan.nextInt();
			printBar();
			//선택메뉴따른 기능실행
			runMenu(menu,list);
			
		}while(menu !=3);
		scan.close();
		
		
		//
	}
	public static void printMenu() {
		//메뉴를 출력
		System.out.println("도서 관리 프로그램  ");
		System.out.println("1. 도서 추가 ");
		System.out.println("2. 도서 조회 ");
		System.out.println("3. 종료");
		printBar();
		System.out.print("메뉴 선택 :  ");
	
	}
	public static void printBar() {
		System.out.println("==============="); 
	}
	public static void runMenu(int menu,ArrayList<Book> list ) {
		
		//선택한 메뉴에 따른 기능 실행 
		switch(menu) {
		//선택 메뉴가 1번이면 도서 추가 
		case 1: 
			//추가할 도서 정보를 입력
			Book book = createBook();
			//다시 한번 짚고 넘어갈 구문 
			
			if(!insertBook(list,book)) 
				System.out.println("이미 등록된 ISBN 번호입니다.");
			else 
				System.out.println("도서추가 완료");
			printBar();
			break;
			
			//선택 메뉴가 2번이면 도서 조회
		case 2: 
			
			printSearchMenu();
			
			//서브메뉴 선택
			int subMenu = scan.nextInt();
			
			runPrintMenu(subMenu,list);
			break;
			
			//선택 메뉴가 3번이면 프로그램 종료
		case 3: 
			System.out.println("종료");
			break;
			
			//선택 메뉴가 1,2,3 이 아니면 잘못된 메뉴라고 출력
		default:
			System.out.println("다른번호 입력하세요");
			
		}
	}
	public static Book createBook() {
		scan.nextLine();
		System.out.print("도서명 : ");
		String title = scan.nextLine();
		System.out.println("저자(엮은이, 옮긴이 ) : ");
		String author = scan.next();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		scan.nextLine();
		System.out.println("출판사 : ");
		String publisher = scan.nextLine();
		System.out.println("장르  (소설, 동화, 교양) : ");
		String genre = scan.nextLine();
		System.out.print("ISBN : ");
		String isbn = scan.next();
		// 도서 목록에 새 도서를 추가
		return new Book(title, author, publisher, genre, isbn, price);
					
	}
	public static boolean insertBook(ArrayList<Book> list, Book book) {
		//생성된 도서 객체를 리스트에 추가 
		//isbn 중복 체크해서 중복되면 건너뜀
		//중복 : 리스트에 book 객체가 포함되었다.
		if(list.contains(book)) {
			return false;
		}
		//중복되지 않으면 추가
		list.add(book);
		Collections.sort(list, (o1,o2)-> o1.getIsbn().compareTo(o2.getIsbn()));
		return true;
	}
	public static void printSearchMenu(){
		System.out.println(" 조회 ");
		System.out.println("1. 도서명");
		System.out.println("2. 저자");
		System.out.println("3. 출판사");
		System.out.println("4. 장르");
		System.out.println("5. 취소");
		printBar();
		System.out.print("메뉴선택 : ");
	}
	public static void runPrintMenu(int subMenu, ArrayList<Book> list) {
		String title, author, publisher,genre;
		
		//선택한 서브 메뉴 실행
		int count=0;
		switch(subMenu) {
		case 1: 
			System.out.println("도서명 조회");
			System.out.print("도 서 명 : ");
			scan.nextLine();
			title = scan.nextLine();
			printBookList(list, b->b.getTitle().contains(title.trim()));
			break;

		case 2:
			System.out.println("저자로 조회");
			
			System.out.print("저자  : ");
			scan.nextLine();
			author = scan.nextLine();
			printBookList(list, b->b.getAuthor().contains(author.trim()));
			break;
			
		case 3:
			System.out.println("출판사로 조회");
			System.out.print("출판사 : ");
			scan.nextLine();
			publisher = scan.nextLine();
			printBookList(list, b->b.getPublisher().contains(publisher.trim()));
			break;
			
		case 4: 
			System.out.println("장르로 조회");
			System.out.print("장르  : ");
			scan.nextLine();
			genre = scan.nextLine();
			
		printBookList(list, b->b.getGenre().contains(genre.trim()));
				
			
			break;
		case 5:
			System.out.println("조회 취소");
		break;
		
		default:
			System.out.println("잘못된 메뉴");
		
		}
		
		
		System.out.println("도서조회");
	}
	public static void printBookList(ArrayList<Book> list, Predicate<Book> p ) {
		int count = 0;
		for(Book tmp : list ) {/*trim 앞뒤 공백 제거 */
			if(p.test(tmp)) {
				System.out.println(tmp);
				count++;
			}
		}
		if(count == 0 ) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
}
