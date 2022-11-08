package day12;

import java.util.Scanner;

public class StudentManaterTest {

	public static void main(String[] args) {
		
		// 

		/* 학생성적 관리 프로그램을 작성하세요.
		 * 작성하기 위해 필요한 작업을 주석으로 정리해주세요
		 * */
		
		/*
		 *1. 프로그램에 필요한 기능을 정리 
		 *메뉴 
		 *1. 학생정보추가 
		 *2. 학생성적수정 
		 *3. 학생정보출력
		 *4. 프로그램종료 
		 *
		 *2. 프로그램 실행 과정은 어떻게 할 건지?
		 *기능
		 *1. 학생정보 추가 
		 *	- 학년, 반 , 번호 , 이름을 입력하여 학생 정보 추가 
		 *	- 학년, 반, 번호가 같은 학생이 이미 있으면 추가하지 않음
		 *2. 학생성적추가 
		 *	- 학년, 반, 번호로 학생을 검색 한 후 있으면 성적을 추가
		 *  - 성적 추가시 과목명, 학기, 중간, 기말, 수행평가를 입력 하여 추가한다.
		 *  - 이미 추가된 과목(학기랑 과목명이 같으면)이면 추가하지 않음
		 *3. 학생정보출력
		 *4. 프로그램종료 
		 *
		 *3. 정보를 효율적으로 관리하기 위해 클래스를 만들것인가.
		 *		만든다면 어떤 클래스를 만들것인지 
		 * -학생클래스 HighStudent
		 * -성적클래스 Score
		 * 
		 * 4. 프로그램 실행 과정을 주석으로 작성 
		 */
		
		
		
		
		//메뉴선택
		int menu;
		Record[] records = new Record[5];
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = insertInt();
			//선택한 메뉴를 따른 기능실행 : 선택한 메뉴  기록정보 
			runMenu(menu,records);
		}while(menu!=4);
		
		
	}
	
	// 메뉴 출력 메소드
	public static void printMenu() {
		
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1. 학생정보추가 ");
		System.out.println("2. 학생성적수정");
		System.out.println("3. 학생정보출력 ");
		System.out.println("4. 종료 ");
		System.out.println("----------------");
		System.out.println("메뉴선택 : ");
		
	}
	// 메뉴 입력 메소드 

	private static int insertInt(){
		Scanner scan  = new Scanner(System.in);
		return scan.nextInt();
	}
	
	// 메뉴 기능 실행 메소드 
	
	public static void runMenu(int menu, Record[] records) {
		switch (menu) {
		case 1: 
			// 학생정보추가 메서드 
			insertStudentScore();
			break;
		case 2: 
			// 학생성적수정 메서드
			updateStudentScore();
			break;
		case 3: 
			// 학생정보출력 메서드 
			printStudentInfo();
			break;
		case 4: 
			System.out.println("프로그램을 종료합니다. ");
			break;
		
			default: 
			System.out.println("잘못된 메뉴입니다. ");
		}
	}
	
	// 학생정보추가 메서드 
	//1. 학생정보 추가 
	//*	- 학년, 반 , 번호 , 이름을 입력하여 학생 정보 추가 
	//*	- 학년, 반, 번호가 같은 학생이 이미 있으면 추가하지 않음
	public static void insertStudentScore() {
		Scanner scan = new Scanner(System.in);
		int  grade, classNum, num = scan.nextInt();
		String name = scan.nextLine();
		
		
		
	}
	
	// 학생성적수정 메서드
	public static void updateStudentScore() {
		/*
		 *  *2. 학생성적추가 
		 *	- 학년, 반, 번호로 학생을 검색 한 후 있으면 성적을 추가
		 *  - 성적 추가시 과목명, 학기, 중간, 기말, 수행평가를 입력 하여 추가한다.
		 *  - 이미 추가된 과목(학기랑 과목명이 같으면)이면 추가하지 않음
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		
		//equals 이용하여 문자열 비교 
		
		//성적추가.
		
		// 이미 추가된 과목 equals 이용하여 추가하지 않음 
		
	}
	
	// 학생정보출력 메서드
	
	public static void printStudentInfo() {
		//TOStirng
		
	}
	
}


public class HighStudent{
	
	
}