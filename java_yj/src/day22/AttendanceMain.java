/*	//출석부 관리프로그램
 * 	1. 학생 등록
 * 	- 이름과 생년 월일
 *  2. 학생 수정
 *  - 이름과 생년월일로 검색에서 이름과 생년월일 수정
 *  3. 학생삭제 
 *  - 이름과 생년월일로 검색해서 삭제
 *  4. 학생 출결 확인
 *  - 이름과 생년월일로 검색해서 해당 학생의 모둔 출결을 확인 
 *   2022-11-22 : 0
 *  5. 출석 확인
 *  	날자 일정 : 2022- 11 -22
 *  	(출석 : 0 지각:  / 조회 : \ , 결석 x)
 	홍길동 출석 현황 : x
 	고길동 출석 현황 : o
 	6. 출석 수정 
 	 - 날짜 입력
 	 수정할 학생인 읆과 생년월일 입력
 	 -7. 출석 삭제 
 	 날짜 입력하여 해당 날짜 춠걱
8. 날짜별 출석 확인
 - 성날짜 입력하여 해당날짜의 모든학생의 출려겨부를 혹인
 9. 프로그램 종료 
 
 //학생클래스 : 이름 생년월일
 //학생 일지 클래스 : 이름 , 생년월일, 출결 
 //일지 클래스 : 날짜, 학생일지들 (이름, 생년월일, 출결)
 //출석부 클래스 : 학생들 , 일지들 
 */
package day22;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class AttendanceMain {

	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu =-1; 
		Attendance attendance = new Attendance();
		do {
			printMenu();
			
			menu = scan.nextInt();
			scan.nextLine();
			//메뉴실행 
		
			runMenu(menu, attendance);
			
			
		}while(menu !=3);
		
	}

	
	private static void printMenu() {
		System.out.println("+++++++++메뉴출력++++++++++");
		System.out.println("1. 학생 관리");
		System.out.println("2. 출석 관리");
		System.out.println("3. 종료");
		System.out.println("===========================");
		System.out.print("메뉴 선택 : ");	
	}
	private static void printSubMenu(int menu) {
		//서브메뉴 매개변수 넘겨야함
		switch(menu) {
		case 1: 
			System.out.println("==========학생관리 메뉴======= ");
			System.out.println("1.학생 추가");
			System.out.println("2.학생 수정");
			System.out.println("3.학생 삭제");
			System.out.println("4.취소");
			System.out.println("----------------------------");
			System.out.println("메뉴 선택 : ");
			break;
		case 2: 
			System.out.println("==========출석관리 메뉴======= ");
			System.out.println("1.출석 체크 - 전체 ");
			System.out.println("2.출석 확인 - 개별 ");
			System.out.println("3.출석 확인 - 날짜별");
			System.out.println("4.출석 수정");
			System.out.println("5.출석 삭제");
			System.out.println("6.취소");
			System.out.println("----------------------------");
			System.out.println("메뉴 선택 : ");
			break;
			default:
				printStr("잘못된 메뉴입니다 .");
		}
	}

	



	private static void printBar() {
		System.out.println("==================");
	}
	private static void printStr(String str) {
		System.out.println(str);
		printBar();
	}
	private static void runMenu(int menu, Attendance attendance) {
		ArrayList<Student> stds = attendance.getStds();
		ArrayList<Log> logs = attendance.getLogs();
		switch(menu) {
		case 1: 
			managementStudent(stds);//학생관리
			break;
		case 2: 
			//managementLogs(logs,stds); // 출석관리
			break;
		case 3:
			printStr("프로그램 종료");
			break;
		default:
			printStr("잘못된 메뉴.");
		}
	}
	private static void managementStudent(ArrayList<Student> stds ) {
		printSubMenu(1);
		int subMenu = scan.nextInt();
		scan.nextLine();
		printBar();
		switch(subMenu) {
		case 1: addStudent(stds); 			break;
		case 2: updateStudent(stds); 		break; 
		case 3: deleteStudent(stds); 		break;
		case 4: printStr("취소 했습니다."); 	break;
		default:
			printStr("메뉴를 잘못 입력했습니다.");
		}
	}
	


	public static void addStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();
		System.out.print("생일 입력 : ");
		String birthday = scan.nextLine();
		Student std = new Student(name,birthday);
		if(stds.indexOf(std)!= -1) {
			printStr("학생 정보 추가했습니다.");
			return;
		}
		
		stds.add(std);
		printStr("학생 정보 추가 실패했습니다.");
	}
	public static void updateStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("생일 입력 : ");
		String birthday = scan.nextLine();
		Student std = new Student(name,birthday);
		int index = stds. indexOf(std);
		
		if(index == -1) {
			printStr("입력정보와 일치하는 학생이 없습니다.");
			return;
		}
		System.out.print("수정할 이름 입력 : ");
		 name = scan.nextLine();
		System.out.print("수정할 생일 입력 : ");
		 birthday = scan.nextLine();
		std = new Student(name, birthday);
		stds.set(index, std);
		
		printStr("학생 정보 추가 수정했습니다.");
	
	}
	
	private static void deleteStudent(ArrayList<Student> stds) {
		// TODO Auto-generated method stub
		if(stds == null)
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("생일 입력 : ");
		String birthday = scan.nextLine();
		Student std = new Student(name,birthday);
		int index = stds. indexOf(std);
		if(index == -1) {
			printStr("입력정보와 일치하는 학생이 없습니다.");
			return;
		}
	
		stds.remove(index);
		
		printStr("학생 정보 추가 삭제했습니다.");
	}
	
}