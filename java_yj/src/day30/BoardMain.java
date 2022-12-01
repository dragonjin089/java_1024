package day30;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class BoardMain {
	// TODO Auto-generated method stub
	/* 기능
	 * - 게시글 등록
	 * - 게시글 수정
	 * - 게시글 삭제 
	 * - 게시글 목록
	 * - 게시글 확인
	 * 	- 댓글등록
	 * 	- 댓글확인
	 *  - 이전
	 * -프로그램 종료 
	 * */
	private static Scanner scan = new Scanner(System.in);
	private static List <Board>boardList  = new ArrayList<Board>();
	public static void main(String[] args) {
	
		//메뉴를 출력하고 입력한 메뉴가 프로그램 종료가 아니면 반복하는 코드를 작성하세요 
		int menu =-1;
		do {
			printMenu();
			menu = scan.nextInt();			
			runMenu(menu);
		}while(menu!=6);
		
		
		
	}
	
	/** 메뉴를 출력하는 메소드
	 * */
	private static void printMenu() {
		System.out.println(" ---- 메뉴 ---- ");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 목록");
		System.out.println("5. 게시글 확인");
		System.out.println("6. 프로그램 종료");
		System.out.println("================");
		System.out.print("메뉴 선택 : ");	
	}
	/**메뉴가 주어지면 주어진 메뉴에 맞는 기능을 출력하는 메소드
	 * @param menu 선택된 메뉴로 정수 */
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			scan.nextLine();
			insertBoard();
			
			break;
			
		case 2: 
			System.out.println("2. 게시글 수정");
			break;
			
		case 3:
			System.out.println("3. 게시글 삭제");
			break;
			
		case 4:
			System.out.println("4. 게시글 목록");
			break;
			
		case 5:
			System.out.println("5. 게시글 확인");
			break;
			
		case 6:
			System.out.println("프로그램 종료 ");
			break;
			
		default:
			System.out.println("잘못된 번호를 입력했습니다.");
		}
		
	}
	
	
	
	
	/**insertBoard
	 * 게시글 정보를 입력받아 게시글을 출력하는 메소드
	 * 메소드 구현에 필요한 필드를 추가해도 됨;*/
	private static void insertBoard() {
		String title,writer,contents;
//		게시글 정보 입력
		System.out.println("번호 : ");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.print("제목 : ");
		title = scan.nextLine();
		System.out.print("내용 : ");
		contents = scan.nextLine();
		System.out.print("글쓴이 : ");
		writer = scan.nextLine();
		//게시글 객체 생성
		Board board = new Board(num, title, contents, writer);
		//게시글 중복확인
		if(boardList.contains(board)) {
			System.out.println("이미 등록된 게시글 번호입니다.");
			return;
		}
		//게시글 리스트에 추가 
		boardList.add(board);
		System.out.println(boardList);
	}
	
	/***/
	/***/
	/***/
}
