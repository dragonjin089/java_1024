package day17;

import java.util.HashMap;
import java.util.Scanner;

public class BoardManagerMain {

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
		HashMap<String,Board> map = new HashMap<String,Board>();
		
		int menu = 0;
		do {
			// 1. 메뉴 출력
			printMenu();
			//2. 메뉴입력
			menu = scan.nextInt();
			//3. switch 이용한 메뉴 시작 
			switch(menu) {
			case 1: 
				if(writeContent(map)) {
				System.out.println("작성했습니다.");
				}
				else {
					System.out.println("이미 작성된 글입니다.");
				}
				break;
			case 2: 	
				//게시글 조회 
				//게시글 조회 리스트형식으로 
				//if 형식으로 상세 조회 
				//게시글 상세조회하면 watch ++
				
				break;
			case 3: 
				if(updateBoard(map)) {
					System.out.println("회원정보 삭제");
				}else {
					System.out.println("게시글 번호가 일치하지 않음 ");
				}
				break;
			case 4:  
				//게시글삭제
				deleteBoard(map);
				break;
			
			
			case 5:
				System.out.println("프로그램 종료 ");	
				break;
			default:
				System.out.println("다른번호 입력하세요.");
			}
		}while(menu != -5);
		
		
	}
	
	
	
	
	

	private static void deleteBoard(HashMap<String, Board> map) {
		// TODO Auto-generated method stub
		
	}






	private static boolean updateBoard(HashMap<String, Board> map) {
		Scanner scan = new Scanner(System.in);
			//게시글 수정
	//게시글 수정은 게시글 번호를 선택하면 게시글의  제목, 내용을 수정 
	
	System.out.println("게시글 수정");
	System.out.print("게시글 번호 : ");
	int num = scan.nextInt();
	
	Board updateTmp = map.get(num);
	if(updateTmp == null || updateTmp.getNum().equals(num)) {
		return false;
	}
	System.out.println("수정할 정보 입력");
	System.out.print("수정할 제목 입력 : ");
	String title = scan.next();
	System.out.print("수정할 글의 내용 입력 :");
	String content = scan.nextLine();
	scan.nextLine();
	updateTmp.update(title,content);
	
	return true;
		
	}

	private static boolean writeContent(HashMap<String,Board> map) {
		Scanner scan = new Scanner(System.in);		
		//게시글 작성
		System.out.println("게시글 작성");
		System.out.print("게시글 번호 : ");
		String num = scan.next();
		System.out.println("게시글 제목 : ");
		String title = scan.next();
		System.out.println("게시글 내용 ");
		String content = scan.nextLine();
		scan.nextLine();
		System.out.println("게시글 작성자");
		String writer = scan.next();
		
		// map 에 있는지 확인해야함
		Board addTmp = map.get(num);
		
		//있으면 건너뜀 
		if(addTmp != null) {
			System.out.println("이미 있음 ");
			return false;
		}
		//없으면 추가 
		map.put(num,new Board(title,content,writer));
		
		return true;
	}

	private static void printMenu() {
		 System.out.println("게시글 관리 프로그램");
		 System.out.println("1. 게시글 작성");
		 System.out.println("2. 게시글 조회");
		 System.out.println("3. 게시글 수정");
		 System.out.println("4. 게시글 삭제");
		 System.out.println("5. 프로그램 종료");
		 System.out.println("_______________");
		 System.out.println("메뉴 입력  : ");
	}

}
