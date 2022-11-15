package day17;


import java.util.ArrayList;
import java.util.Scanner;

public class BoardManagerMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 게시글 관리 프로그램을 작성하세요.
		 * 1. 게시글 작성
		 * 2. 게시글 조회
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 프로그램 종료 
		 * - 게시글은 제목, 내용, 작성자, 작성일, 조회수로 구성
		 * - 게시글 전체 조회는 나중에 작성된 게시글이 상단에 조회
		 * - 게시글 상세 조회는 게시글 번호를 입력하여 게시글 내용을 학왼
		 * - 게시글 상세 조회를 하면 조회수가 1증가(증감식사용) 
		 * - 게시글 수정은 게시글 번호를 선택하면 게시글의  제목, 내용을 수정 
		 * - 게시글 삭제는 게시글 번호를 선택하면 해당 게시글을 삭제
		 * */
		Scanner scan = new Scanner(System.in);
	
		
		int menu = 0;
		ArrayList<Board> list = new ArrayList<Board>();
		do {
			// 1. 메뉴 출력
			printMenu();
			//2. 메뉴입력
			menu = scan.nextInt();
			//3. switch 이용한 메뉴 시작 
			
			switch(menu) {
			case 1: 
				//메뉴에서 입력한 엔터처리
				scan.nextLine();
				//콘솔에서 입력받아 게시글 객체 생성
				Board insertTmp = inputBoard();
				//게시글을 목록에 추가 
				insertBoard(list, insertTmp);
				break;
			
			case 2: 	
				// 서브메뉴 출력
				printSubMenu(menu);
				//서브메뉴 선택
				int subMenu = scan.nextInt();
				//서브 메뉴에 따른 기능 실행
				printBoard(list,subMenu);
				break;
			case 3: 
				//게시글 번호 입력
				System.out.print("수정할 게시글 번호 입력: ");
				int num2 = scan.nextInt();
				//번호와 일치하는 게시그를 가져옴
				int index = list.indexOf(new Board(num2));
				Board tmp =list.get(index);
				if(index == -1) {
					printStr("일치하는 게시글이 없습니다.");
					continue;
				}
				//일치하는 게시글이 있으면 제목, 내용을 입력 
				Board tmp  = list.get(index);
				
				//입력받은 제목, 내용으로 게시물을 수정 
				scan.nextLine();
				System.out.print("제목 : ");
				String title = scan.nextLine();
				System.out.print("so용 : ");
				String content = scan.nextLine();
				
				tmp.update(title, content);
				break;
			case 4:  
				//삭제할 게시글 번호 입력
				System.out.println("삭제할 게시글 번호 : ");
				int num = scan.nextInt();
				// 게시글 번호에 맞는 게시글 삭제
				// 게시글 번호를 이용하여 게시글 객체를 생성하여 삭제 
				if(list.remove(new Board(num))) {
					printStr("게시글이 삭제 ");
				}else {
					printStr("일치되는 게시글이 없습니다.");
				}
				
				break;
			
			
			case 5:
				System.out.println("프로그램 종료 ");	
				break;
			default:
				System.out.println("다른번호 입력하세요.");
			}
		}while(menu != -5);
		
		
	}
	

	public static void printMenu() {
		 System.out.println("게시글 관리 프로그램");
		 System.out.println("1. 게시글 작성");
		 System.out.println("2. 게시글 조회");
		 System.out.println("3. 게시글 수정");
		 System.out.println("4. 게시글 삭제");
		 System.out.println("5. 프로그램 종료");
		 System.out.println("_______________");
		 System.out.println("메뉴 입력  : ");
	}
	public static void printSubMenu(int menu) {
		switch(menu) {
		case 2: 
			System.out.println("------조회메뉴 --------");
			System.out.println("1. 전체 조회 ");
			System.out.println("2. 상세 조회 ");
			System.out.println("---------------");
			System.out.println("메뉴 선택 : ");
			break;
		}
	}
	public static void printStr(String str)
	{
		System.out.println("****************************");
		System.out.println(str);
		System.out.println("****************************");
	}
	public static void insertBoard(ArrayList<Board> list, Board board) {
		//목록에 추가 
		//0번지에 추가하는 이유는 나중에 등록된 게시글이 위로가게 하기위해서 
		list.add(0, board);
		printStr("게시글이등록됐습니다.");
	}
	
	public static Board inputBoard() {
		Scanner scan = new Scanner(System.in);
		//게시글 정보 입력(정보,내용, 작성자)
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String content = scan.nextLine();
		System.out.println("작성자 : ");
		String writer = scan.next();
	
		//목록에 게시글 추가
		
		//게시글 객체 생성
		return new Board(title,content,writer);
	}
	public static void printAll(ArrayList<Board> list) {
		if(list == null || list.size() == 0) {
			printStr("등록된 게시물이 없습니다.");
			return;
		}
		// 전 체 조 회
		for(Board tmp : list) {
			System.out.println(tmp);
		}
	}
	
	public static void printDetail(ArrayList<Board> list, int num) {
		// 해당번호의 게시글 조회
		int index = list.indexOf(new Board(num));
		if (index == -1) {
			printStr("없는 게시글 번호입니다.");
		return;
		}
//게시글 조회수 증가 
		list.get(index).updateWatch();
		// 게시글 출력
		System.out.println(list.get(index).print());
		
	}
	public static void printBoard(ArrayList<Board> list, int subMenu) {
		Scanner scan = new Scanner(System.in);
		switch(subMenu) {
		case 1: 
			printAll(list);
			break;
		case 2:
			// 상 세 조 회 
			// 번호 입력
			System.out.println("게시글 번호 : ");
			int num = scan.nextInt();
			printDetail(list,num);
			break;

		default: 
					printStr("잘못된 메뉴입니다.");
		}
	}
}
