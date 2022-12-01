package day28;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class BoardMain_Ex01 {
	/*
	 * 게시글 관리 프로그램
	 *  - 회원 가입 기능
	 *    - 처음 가입한 회원이 관리자, 그외 회원인 일반 회원
	 *  - 로그인 기능
	 *  - 게시글 등록 /수정/삭제 -> 회원만 가능
	 *  - 카테고리 관리  (공지, 자유)
	 *  - 카테고리 추가 수정 삭제 (관리자만 가능)
	 *  
	 *  
	 *  - 기능 1 
	 *  - 회원관리
	 *  	-로그인 
	 *  	-회원가입
	 *  - 게시글관리
	 *  	-게시글 등록 (회원만)
	 *  	-게시글 수정 (회원 + 작성자 본인)
	 *  	-게시글 제거 (회원 + 작성자 본인)
	 *  	-게시글 목록 
	 *  		-게시글 검색(검색 번호는 게시글 번호로)
	 *  		-게시글 확인 
	 *   - 카테고리 관리(회원 + 관리자만) 
	 *   	-카테고리 추가 
	 *   	-카테고리 수정
	 *    	-카테고리 삭제 
	 *    
	 *  */
	
	private static Scanner scan= new Scanner(System.in);
	private static List<Member> memberList = new ArrayList<Member>();
	//List 인터페이스 리스트를 구현한 구현클래스에 객체를 만들어줌
	private static List<Board> boardList = new ArrayList<Board>();
	private static List<String > categoryList = new ArrayList<String>();
	//arrays.asList("공지,자유 ") - > 고정된 저장공간 생성자 생성해야함 
	private static Member user;

	
	public static void main(String[] args) {
		int menu = -1;
		loadMember("member.txt");
		loadCategory("category.txt");
		loadBoard("board.txt");
		do {
			try {
				printMenu();
				menu = scan.nextInt();
				System.out.println();
				runMenu(menu);				
			}catch(InputMismatchException e){
				scan.nextLine();
				System.out.println("번호로 입력하세요");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}while(menu !=4);
		saveMember("member.txt");
		saveCategory("category.txt");
		saveBoard("board.txt");
	}
	private static void loadBoard(String filename) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(filename))) {
			int count = ois.readInt();
			Board.setCount(count);
			while(true) {
				Board board = (Board)ois.readObject();
				boardList.add(board);
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("불러오기 실패");
		}catch(EOFException e) {
			System.out.println("불러오기 성공");
		}catch(IOException e) {
			System.out.println("불러오기 실패");
		}
		
	}
private static void saveBoard(String filename) {
	try(ObjectOutputStream oos 
			= new ObjectOutputStream(new FileOutputStream(filename))) {
		oos.writeInt(Board.getCount());//게시글 번호가 몇번까지 만들어졌는지 확인 
		for(Board board : boardList) {
			oos.writeObject(board);
		}
		System.out.println("저 장 완 료");
	}catch(IOException e) {
		System.out.println("저 장 실 패");
		e.printStackTrace();
	}
}
	private static void saveCategory(String filename) {
		try(ObjectOutputStream oos 
				= new ObjectOutputStream(new FileOutputStream(filename))) {
			for(String category : categoryList) {
				oos.writeObject(category);
			}
			System.out.println("저 장 완 료");
		}catch(IOException e) {
			System.out.println("저 장 실 패");
		}
		
	}

	private static void loadCategory(String filename) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(filename))) {
			while(true) {
				String category = (String)ois.readObject();
				categoryList.add(category);
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("불러오기 실 패");
		}catch(EOFException e) {
			if(categoryList.size()==0)
				categoryList
		= new ArrayList<String>(Arrays.asList("공지","자유"));
			
			System.out.println("불러오기 성공");
		}catch(IOException e) {
			System.out.println("불러오기 실 패");
		}
		
	}

	private static void saveMember(String filename) {
		//자동 close 호출해줌 
		if(memberList.size() == 0)
			return;
		try(ObjectOutputStream oos 
				= new ObjectOutputStream(new FileOutputStream(filename))) {
			for(Member member : memberList) {
				oos.writeObject(member);
			}
			System.out.println("저 장 완 료");
		}catch(IOException e) {
			System.out.println("저 장 실 패");
		}
		
	}

	private static void loadMember(String filename) {
		
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(filename))) {
			while(true) {
				Member member = (Member)ois.readObject();
				memberList.add(member);
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("불러오기 실 패");
		}catch(EOFException e) {
			System.out.println("불러오기 성공");
		}catch(IOException e) {
			System.out.println("불러오기 실 패");
		}
	}

	private static void runMenu(int menu) {
		// TODO Auto-generated method stub
		switch(menu) {
		case 1: 
			memberMenu();
			break;
		case 2:
			boardMenu();
			break;
		case 3:
			categoryMenu();
			break;
		case 4: 
			System.out.println("종료");
			break;
		default:
			throw new RuntimeException("다른 번호 입력하세요");
				
		}
	}
	
	private static boolean checkLogin(boolean res) {
		if(user != null && res) {
			System.out.println("로그인한 사용자는 해당기능을 이용할 수 없습니다.");
			return true;
		}else if(user == null&& !res) {
			System.out.println("로그인 하지 않은 사용자는 해당 기능을 이용할 수 없습니다. ");
			return true;
		}
		return false;
	}
	
	
	
	private static void categoryMenu() {
		
		//관리자 체크  -> 관리자 아니면 메인메뉴로 
		if(!isAdmin()) {
			return;
		}
		int subMenu= -1;
		do {
			//서브메뉴를 출력
			printSubmenu(3);
			//선택한 서브메뉴에 맞는 기능 실행 
			subMenu = scan.nextInt();
			scan.nextLine();
			printBar();
			runcategoryMenu(subMenu);
			
		} while (subMenu!=5);
		
	}

	private static void runcategoryMenu(int subMenu) {
		switch(subMenu){
		case 1:
			//1. 카테고리 추가
			insertCategory();
			break;
		case 2: 
			//2. 카테고리 수정
			updateCategory();
			break;
		case 3: 
			//3. 카테고리 삭제
			deleteCategory();
			break;
		case 4: 
			//4. 카테고리 확인
			printCategory();
			
			break;
		case 5:
			//5. 이전
			System.out.println("이전으로 돌아갑니다.");
			break;

		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
		
		}
	}

	private static void printCategory() {
		//모든 카테고리 출력
		if(categoryList.size()==0) {
			System.out.println("등록된 카테고리가 없습니다.");
			return;
			
		}
		for(int i = 0; i< categoryList.size(); i++)
		{
			System.out.println(i+1+ ". " +categoryList.get(i));
			
		}
	}

	private static void deleteCategory() {
		//1. 삭제할 카테고리명 입력
		System.out.print("카테고리명 입력 : ");
		String category = scan.nextLine();
		printBar();
		//2. 기존 카테고리에 있으면 삭제
		if(categoryList.remove(category))
		{
			System.out.println("카테고리 삭제했습니다.");
			return;
		}	
		System.out.println("등록되지 않은 카테고리입니다.");
	}

	private static void updateCategory() {
		//수정할 카테고리명 입력
		System.out.print("카테고리명 입력 : ");
		String category = scan.nextLine();
		printBar();
		//기존 카테고리에 있으면 
		if(!categoryList.contains(category))
		{
			System.out.println("등록되지 않은 카테고리입니다. 수정실패");
			return;
		}
		//새 카테고리명 입력
		System.out.print("카테고리명 입력 : ");
		String newCategory = scan.nextLine();
		printBar();
		
		//기존 카테고리에 있는지 확인하여 없으면 수정
		if(!categoryList.contains(newCategory)) {
			categoryList.remove(category);
			categoryList.add(newCategory);
			System.out.println("카테고리 수정에 성공했습니다.");
			return;
		}
		System.out.println("이미 등록된 카테고리입니다. 수정 실패 ");
	}

	private static void insertCategory() {
		//1. 새 카테고리명 입력
		System.out.print("카테고리명 입력 : ");
		String category = scan.nextLine();
		printBar();
		//2. 기존 카테고리에 있는지 확인하여 없으면 추가 
		if(categoryList.indexOf(category) == -1)
		{
			System.out.println("새카테고리 추가했습니다.");
			categoryList.add(category);
			return;
		}
		System.out.println("이미 있는 카테고리 입니다.");
	}

	private static boolean isAdmin() {
		if(user == null || user.getAuthority() == Authority.ADMIN)
		{System.out.println("관리자가아닙니다. 해당 기능을 이용할 수 없습니다.");
			return false;
		}
		return true;
	}

	private static void boardMenu() {
		//서브메뉴를 출력
		int subMenu = -1;
		do {
			//선택한 서브 메뉴에 맍는거를 실행
			printSubmenu(2);
			subMenu= scan.nextInt();
			scan.nextLine();
			printBar();
			
			runBoardMenu(subMenu);
			
		} while (subMenu!=5);
		
		
		
	}

	private static void runBoardMenu(int subMenu) {
		switch (subMenu) {	
		case 1: insertBoard(); break;
		case 2: updateBoard(); break;
		case 3: deleteBoard(); break;
		case 4: printBoard(); break;
		case 5: System.out.println("이전 메뉴로 돌아갑니다."); break;
		default: System.out.println("잘못된 메뉴를 선택했습니다."); break;
		}
		System.out.println(boardList);
	}

	private static void printBoard() {
		int detailMenu =-1;
		do {
		//4. 게시글 목록 
		//디테일 메뉴 출력
		printDetailMenu();
		
		//서브 메뉴 선택 및 기능 실행
		detailMenu = scan.nextInt();
		scan.nextLine();
		printBar();
		runPrintMenu(detailMenu);
			
		}while(detailMenu!=4);
	}

	private static void runPrintMenu(int detailMenu) {
		switch(detailMenu) {
		case 1: 
			//1.게시글 목록 확인			
			printBoardListAll();
			// 모든 게시글 확인
			
			break;
			
		case 2:
			printBoardSearch();
			//2. 게시글 검색

			//검색어 입력 후 게시글 확인
			break;
			
		case 3:
			//3. 게시글 확인 
			printBoardDetail();
			//게시글 번호를 입력 
			break;
			
		case 4:
			// 입력한 게시글이 있으면 확인
			System.out.println("이전메뉴로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
		}
	}

	private static void printBoardDetail() {
		//삭제할 게시글 번호 입력
				System.out.println("게시글 번호 : ");
				int num = scan.nextInt();
				scan.nextLine();
				int index =boardList.indexOf(new Board(num));
				//해당 게시글이 존재하지 않거나, 작성자가 회원과 같지 않으면 수정 못함
				//작성자 체크 -> 회원(로그이한 사용자)이 아니면 게시글 등록 못함
				if(index == -1) {
					System.out.println("등록되지 않거나 삭제된 게시글입니다.");
					return;
				}
				Board board = boardList.get(index);
				int views =board.getViews();
				board.setViews(views+1);
				board.print();
				printBar();
		
	}

	private static void printBoardSearch() {
		System.out.println("검색어 : ");
		String search = scan.nextLine();
		printBoardList(s->s.getTitle().contains(search.trim()));
		
	}

	private static void printBoardListAll() {
		printBoardList(s->true);
		
	}

	private static void printBoardList(Predicate<Board> p) {
		if(boardList.size() == 0) {
			System.out.println("등록된 게시글이 없습니다.");
			return;
		}
		for(Board tmp : boardList) {
			if(p.test(tmp))
			System.out.println(tmp);
		}
		
	}

	private static void printDetailMenu() {
		System.out.println("게시글 목록 메뉴");
		printBar();
		System.out.println("1. 게시글 목록 확인");
		System.out.println("2. 게시글 검색");
		System.out.println("3. 게시글 확인");
		System.out.println("4. 이전");
		printBar();
		System.out.print("메뉴선택 : ");
		
		
	}

	private static void deleteBoard() {
		//3. 게시글 삭제 
		if(checkLogin(false)) {
			return;
		}
		
		//삭제할 게시글 번호 입력
		System.out.println("게시글 번호 : ");
		int num = scan.nextInt();
		scan.nextLine();
		int index =boardList.indexOf(new Board(num));
		//해당 게시글이 존재하지 않거나, 작성자가 회원과 같지 않으면 수정 못함
		//작성자 체크 -> 회원(로그이한 사용자)이 아니면 게시글 등록 못함
		if(index == -1) {
			System.out.println("등록되지 않거나 삭제된 게시글입니다.");
			return;
		}
		Board board = boardList.get(index);
		if(!board.getWriter().equals(user.getId())) {
			System.out.println("작성자가 아닌 사용자는 수정할 수 없습니다.");
			return;
		}
		//해당 게시글 삭제 
		boardList.remove(index);
		System.out.println("게시글 삭제가 완료됐습니다.");
	}

	private static void updateBoard() {
		//2. 게시글 수정
		if(checkLogin(false)) {
			return;
		}
		//수정할 게시글 번호 입력
System.out.println("게시글 번호 : ");
int num = scan.nextInt();
scan.nextLine();
int index =boardList.indexOf(new Board(num));

		

		//해당 게시글이 존재하지 않거나, 작성자가 회원과 같지 않으면 수정 못함
		//작성자 체크 -> 회원(로그이한 사용자)이 아니면 게시글 등록 못함
		if(index == -1) {
			System.out.println("등록되지 않거나 삭제된 게시글입니다.");
			return;
		}
		Board board = boardList.get(index);
		if(!board.getWriter().equals(user.getId())) {
			System.out.println("작성자가 아닌 사용자는 수정할 수 없습니다.");
			return;
		}
		//게시글 	정보(제목, 내용) 입력
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String contents = scan.nextLine();
		printBar();
		//게시글 수정
		board.update(title, contents);
		System.out.println("게시글 수정 완료했습니다.");
		
	}

	private static void insertBoard() {
		//1. 게시글 등록
		
		//회원 체크 -> 회원(로그인한 사용자)이 아니면 게시글 등록 못함
		if(checkLogin(false)) {
			return;
		}
		
		printCategory();
		printBar();
		
		//게시글 	정보(제목, 내용, 카테고리) 입력
		String category = null;
		do{
			if(category != null)
				System.out.println("등록되지 않은 카테고리입니다.");
			System.out.print("카테고리: ");
			category= scan.nextLine();
		}while(!categoryList.contains(category));
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String contents = scan.nextLine();
		printBar();
		//게시글 등록
		Board board = new Board(title,contents,user.getId(), category);
		boardList.add(board);
		System.out.println("게시글 등록 완료 ");
	}

	private static void memberMenu() {

		//로그인 체크 -> 로그인 한 사람은 로그인 /회원가입 시도를 할수없게하기위함
		if(checkLogin(true))
			return;
		int subMenu = -1;
		do {
			
			//서브메뉴를 출력
			printSubmenu(1);
			//서브 메뉴를 선택 및 선택한 서브 메뉴에 맍는거를 실행-> 반복
			subMenu = scan.nextInt();
			scan.nextLine();
			subMenu = runMemberMenu(subMenu);
			
			
			
			//3. 이전
			
		} while (subMenu !=3);	
	}

	private static int runMemberMenu(int subMenu) {
		Member member = null;
		switch(subMenu) {
		
		case 1:
			signup();
			
			break;
		case 2: 
			//2. 로그인
			login();
			
			// 로그인 성공하면 서브 메뉴를 3으로 수정  자동으로 메인으로 이동하게 함 
			if(user != null)
				return 3; 
			
			break;
		case 3: 
			System.out.println("이전메뉴로 돌아갑니다.");
			break;
			default : 
				System.out.println("잘못된 메뉴를 선택했습니다.");
		}
		return subMenu;
	}

	private static void login() {
		//1. 회원 정보 입력(아이디 , 비번)
		System.out.println("로그인 정보 입력");
		Member member = inputMember();
		
		// 일치하는 회원이 있으면 회원 정보를 가져옴(로그인 성공)
		int index = memberList.indexOf(member);
		if(index == -1) {
			printBar();
			System.out.println("로그인 실패 ");
			return;
		
	}
			user = memberList.get(index);
			printBar();
		System.out.println("로그인 성공");
	}

	private static void signup() {
		//1. 회원가입
		//회원 정보 입력
		System.out.println("회원 정보 입력");
		Member member = inputMember();			
		// 가입된아이디인지 체크 
		if(isMember(member)) {
			System.out.println("이미 가입된 아이디입니다.");
			return;
		}
		//가입된 아이디가 아니면 회원가입 진행
		memberList.add(member);
//		System.out.println(memberList);확인코드
		System.out.println("회원가입이 완료되었습니다.");
	}

	private static boolean isMember(Member member) {
		if(member == null)
			return false;
		if(memberList == null)
			memberList = new ArrayList<Member>();
		if(memberList.size() == 0)
			return false;
		for(Member tmp : memberList) {
			if(tmp.getId().equals(member.getId())) {
				return true;
			}
		}
		return false;
	}

	private static Member inputMember() {
		System.out.print("아이디 : ");
		
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String pw = scan.nextLine();
		//처임 가입한경우면 멤머비스트 0명일시 관리자권환 아니면 회원권한
		Authority authority = memberList.size() == 0 ? Authority.ADMIN : Authority.MEMBER;
		return new Member(id, pw, authority);
	}

	private static void printSubmenu(int menu) {
		switch(menu) {
		case 1: 
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 이전");

			break;
		case 2:
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 수정");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 목록");
			System.out.println("5. 이전");
			break;
		case 3: 
			System.out.println("1. 카테고리 등록");
			System.out.println("2. 카테고리 수정");
			System.out.println("3. 카테고리 삭제");
			System.out.println("4. 카테고리 목록");
			System.out.println("5. 이전");
			
			
			break;
	}
		printBar();
		System.out.print("메뉴 선택 : ");
	}

	private static void printMenu() {
		System.out.println("       메뉴       ");
		printBar();
		System.out.println("1. 회원 가입");
		System.out.println("2. 게시글 관리");
		System.out.println("3. 카테고리 관리");
		System.out.println("4. 종료");
		printBar();
		System.out.print("메뉴 선택 : ");
	}
	
	private static void printBar() {
		System.out.println("==================");
	}

}
