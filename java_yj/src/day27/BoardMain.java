package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	/*
	 * 게시글 관리 프로그램
	 *  - 회원 가입 기능
	 *    - 처음 가입한 회원이 관리자, 그외 회원인 일반 회원
	 *  - 로그인 기능
	 *  - 게시글 등록 /수정/삭제 -> 회원만 가능
	 *  - 카테고리 관리  
	 *  */
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList <Idpw> list = new ArrayList<Idpw>();
		int menu = -1;
		
		do {
			printMenu ();
			
			menu = scan.nextInt();
			
			runMenu(menu,list);
			
		}while(menu !=4);
		
		
	}

	
	
	
	private static void runMenu(int menu, ArrayList<Idpw> list) {
		
		int subMenu = -1;
		
		switch(menu){
		case 1 : 
			System.out.println("회원가입"); 
			createIdpw(list);		
		break;
		
		case 2 : 
			System.out.println("로그인");
			logIn(list);
		break;
		case 3 : 
			System.out.println("게시글 등록/수정/삭제"); 	
			do {
				printSubMenu();
				subMenu = scan.nextInt();
				runSubMenu(subMenu);
				
			}while(subMenu != 4);
		break;
		case 4 : System.out.println("카테고리"); break;
		case 5 : System.out.println("프로그램 종료"); break;
		default : System.out.println("다른번호 입력하세요"); break;
		}
		
	}

	private static boolean logIn(ArrayList<Idpw> list) {
		// TODO Auto-generated method stub
		
	}




	private static void createIdpw(ArrayList<Idpw> list) {
		String id, pw;
		scan.nextLine();
		System.out.println("아이디 : ");
		id = scan.nextLine();
		System.out.println("패스워드 : ");		
		pw = scan.nextLine();
		
		Idpw lists= new Idpw(id,pw);
		list.add(lists);
		
		System.out.println("회원가입 완료 ");
		
		
		
	}




	private static void runSubMenu(int subMenu, ArrayList<Board1> boardList) {
		ArrayList<Board1> boardList = new ArrayList<Board1>();
		switch(subMenu) {
		case 1 : System.out.println("1. 게시글 등록"); break;
		
		createBoardList(boardList);
		
		case 2 : System.out.println("2. 게시글 수정"); break;
		case 3 : System.out.println("3. 게시글 삭제"); break;
		case 4 : System.out.println("4. 프로그램 종료 "); break;
		default: System.out.println("다른 번호 입력하세요.");
		}
	}


	private static void createBoardList(ArrayList<Board1> boardList) {
		
		String title, content,writer;
		scan.nextLine();
		
		System.out.println("제목을 입력하세요 : ");
		title = scan.nextLine();
		System.out.println("글쓴이를 입력하세요 : ");
		writer = scan.nextLine();
		System.out.println("내용을 입력하세요 : ");
		content = scan.nextLine();
		
		Board1 boardlists = new Board1(title,writer,content);
		boardList.add(boardlists);
		
		System.out.println("게시글 추가 완료했습니다.");
	
		
	}
	

	private static boolean checkCustomer(ArrayList<Idpw> list) {
		
	}
	
	



	private static void printSubMenu() {
		System.out.println("1. 게시글 등록 ");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("메뉴 선택 : ");
	}
	private static void printMenu() {
		System.out.println("게시글 관리 프로그램");
		printBar();
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 게시글 등록,수정,삭제");
		System.out.println("4. 카테고리");
		printBar();
		System.out.println("메뉴 선택 : ");
	}
	private static void printBar() {
		System.out.println("==================");
	}
}
