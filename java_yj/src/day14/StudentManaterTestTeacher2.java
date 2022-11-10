package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManaterTestTeacher2 {

	public static void main(String[] args) {
		
		

		
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> stds = new ArrayList<Student>();
		int menu = -1;
		// 반복 
		for(;menu!=4;) {
			// 메뉴 출력
			printMenu();
		
		
		// 메뉴 선택
		menu = scan.nextInt();
		// 선택한 메뉴에 따른 기능실행
		runMenu(menu, stds);
		// count 메소드안에서 증가될수도있는데 기본자료형은 안에서 바뀌어도 밖에서 안바뀌기 떄문에 리턴을 통해서 알려우저야함
		
		}//for end
	}// main end 

	private static void runMenu(int menu,ArrayList<Student> stds) {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1:
			if(addStudent(stds)) {
				System.out.println("학생을추가했습니다 ");
			}else {
				System.out.println("학생을 추가하지 못했습니다.");
			}
			break;
		case 2: 
			if(addScore(stds)) {
				System.out.println("성적이 등록됐습니다.");
			}
			else {
				System.out.println("성적 등록에 실패했습니다.1");
			}
			break;
		case 3: 
			//학생정보출력
			//저장된 학생 정보를 출력
			printStudentList(stds);
			break;
		case 4: 
			System.out.println("프로그램 종료 ");		
			break;
		default: 
			System.out.println("잘못된번호");
		}
		return ;
	}

	

	private static void printStudentList(ArrayList<Student> stds) {
		for(Student tmp : stds) {
			System.out.println(tmp);
			tmp.printScore();
		}
		
	}

	private static boolean addScore(ArrayList<Student> stds) {
		
		System.out.println("성적을 추가할 학생 정보 입력");
		Student tmp = scanStduentBaseInfo();
		int index = stds.indexOf(tmp);
		if(index == -1) {
			return false;
		}
		System.out.println("성적정보를 입력하세요");
		return stds.get(index).addScore(scanScore());
	}

	private static boolean addStudent(ArrayList<Student> stds) {
		Scanner scan = new Scanner(System.in);
		System.out.println("추가할 학생 정보 입력");
		Student tmp = scanStduentBaseInfo();
		
		System.out.print("이름 : ");
		tmp.setName(scan.next());
		
		int index = stds.indexOf(tmp);
		
		if(index ==-1) {
			stds.add(tmp); // 일치하는 학생이없으면 tmp를 배열에 저장 
			return true;
		}
		return false;
	}

	private static Score scanScore() {
		Scanner scan = new Scanner(System.in);
		System.out.println("과목 : ");
		String title = scan.next();
		System.out.println("학기 : ");
		int term = scan.nextInt();
		System.out.println("중간 : ");
		int midScore = scan.nextInt();
		System.out.println("기말 : ");
		int finalScore = scan.nextInt();
		System.out.println("수행평가 : ");
		int performace = scan.nextInt();
		return new Score(title, term, midScore, finalScore, performace);
	}

	private static Student scanStduentBaseInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("학년 : ");
		int grade = scan.nextInt();			
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		
		return new Student(grade, classNum, num);
	}

	

	private static void printMenu() {
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1. 학생정보추가 ");
		System.out.println("2. 학생성적수정");
		System.out.println("3. 학생정보출력 ");
		System.out.println("4. 종료 ");
		System.out.println("----------------");
		System.out.print("메뉴선택 : ");
	}
	
	
}