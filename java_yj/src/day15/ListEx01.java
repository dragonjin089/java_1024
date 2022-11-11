package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day14.Score;

public class ListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*리스트를 이용하여 다음 기능을 갖는 오늘의 할일 프로그램을 작성하세요 .
		 * 메뉴 
		 * 1. 할일 추가 
		 * 2. 할일 확인
		 * 3. 할일 삭제 
		 * 3. 종료
		 * 메뉴 선택 : 1 
		 * ---------------------------
		 * 할일 입력 : 오후 수업 참여 
		 * ArrayList<클래스명> todoList = new ArrayList<클래스명>();
		 * */
	int menu = -1;
	Scanner scan = new Scanner (System.in);
	ArrayList<String> todoList = new ArrayList<String>();
	
		do {
			//1. 메뉴보기 
			printMenu();
			try {
				
			
			//2. 메뉴 입력
			menu = scan.nextInt();
			//3. 메뉴 실행
			runMenu(menu, todoList);
			}catch(InputMismatchException e){
				System.out.println("-------------");
				System.out.println("예외발생 : 정수를 입력하세요 ");
				System.out.println("--------------");
				scan.nextLine();
			}
			
			
			catch (Exception e) {
				System.out.println("-------------");
				System.out.println(e.getMessage());
				System.out.println("--------------");
			}
		} while (menu !=4);
	
	}
	
	
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 할일 추가 ");
		System.out.println("2. 할일 확인");
		System.out.println("3. 할일 삭제");
		System.out.println("4. 종료 ");
		System.out.print("메뉴선택 : ");
	}
	
	
	public static void runMenu(int menu,ArrayList<String> todoList) throws Exception{
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1: 
			//할일을 입력(공백포함해서 입력) 
			System.out.println("할 일 입력: ");
			String todo = scan.nextLine();
			// 리스트에 입력된 할일을 추가
			todoList.add(todo);
			break;
		case 2: 
			printTodoList(todoList);
			
			break;
		
		
		case 3:
			printTodoList(todoList);
			// 1. 오후수업참여 
			// 2. 저녁
			// 삭제할 할일 번호 선택 : 1
			//1번 할일이 삭제 되었습니다.
			
			System.out.println("삭제할 번호 입력 : ");
		

			//System.out.print("삭제할 할일 번호 선택 : "+ todoList.remove(i));
			int index =scan.nextInt()-1;
			// 잘못된 번호를 입력한 경우 
			if(index < 0 || index >= todoList.size()) {
				throw new Exception("에외 발생 : 삭제할 번호를 잘못 입력했습니다. ");
			}
			todoList.remove(index);
			System.out.println("삭제완료 ");
			break;
		case 4: 
			System.out.println("종료");
			break;
			
		default : 
			throw new Exception("예외 발생 잘못된 메뉴입니다.");
		}		

	}


	private static void printTodoList(ArrayList<String> todoList) {
		if(todoList == null || todoList.size() == 0) {
			System.out.println("저장된 할일이 없습니다.");
			return;
		}
		for(int i = 0; i<todoList.size(); i++) {
			System.out.println(i+1+". "+todoList.get(i));
		//printTodo(todoList);
			}
	}
	

}
