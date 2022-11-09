package day13;

import java.util.Scanner;

public class StudentManaterTestTeacher2 {

	public static void main(String[] args) {
		
		

		
		Scanner scan = new Scanner(System.in);
		Student [] stds = new Student[30];
		int count = 0;
		int menu = -1;
		// 반복 
		for(;menu!=4;) {
			// 메뉴 출력
			printMenu();
		
		
		// 메뉴 선택
		menu = scan.nextInt();
		// 선택한 메뉴에 따른 기능실행
		count = runMenu(menu, stds, count);
		// count 메소드안에서 증가될수도있는데 기본자료형은 안에서 바뀌어도 밖에서 안바뀌기 떄문에 리턴을 통해서 알려우저야함
		
		}//for end
	}// main end 

	private static int runMenu(int menu, Student[] stds, int count) {
		Scanner scan = new Scanner(System.in);
		if(menu == 1) {
			if(addStudent(stds,count)) {
				System.out.println("학생을추가했습니다 ");
				count++;
				
			}else {
				System.out.println("학생을 추가하지 못했습니다.");
			}
		
		}
		else if(menu ==2) {
			
			if(addScore(stds, count)) {
				System.out.println("성적이 등록됐습니다.");
			}
			else {
				System.out.println("성적 등록에 실패했습니다.1");
			}
			
		}
		
		
		else if(menu ==3) {
			//학생정보출력
			//저장된 학생 정보를 출력
			printStudentList(stds,count);
			System.out.println("3. 학생정보출력 기능 구현 에정");			
			
		}
		else if(menu ==4) {
			System.out.println("프로그램 종료 ");			
		}
		else{
			System.out.println("잘못된번호");
		}
		
		return count;
	}

	

	private static void printStudentList(Student[] stds, int count) {
		
		for(int i = 0; i<count; i++) {
			System.out.println(stds[i]);
			stds[i].printScore();
		}
	}

	private static boolean addScore(Student[] stds, int count) {
		//학생성적추가
		// 학생 정보를 입력(학년, 반, 번호)
		//학생정보 입력(학년 ,반 , 번호 ,이름)
		System.out.println("성적을 추가할 학생 정보 입력");
		
		
		// 입력한 학생 정보가 없으면 끝 
		// 학생 정보들 중에서 하나씩 비교하여 학년, 반,번호가 같은학생이 있는지 확인해
		// 없으면 조건문 종료
		Student tmp = scanStduentBaseInfo();
		
		int index = indexOfStudent(stds, count, tmp);

		
		if(index == -1) {
			return false;
		}
		
		// 성적정보를 입력(과목, 학기 ,중간, 기말 ,수행평가)
		// 입력한 성적 정보가 없으면 추가 
		// 선택한 학생의 성적 정보들 중에서 과목, 학기가 같은 성적 정보가 없으면 추가 
		System.out.println("성적정보를 입력하세요");
	
		
		return stds[index].addScore(scanScore());
		
		
		
	}

	private static boolean addStudent(Student[] stds, int count) {
		Scanner scan = new Scanner(System.in);
		System.out.println("추가할 학생 정보 입력");
		Student tmp = scanStduentBaseInfo();
		
		System.out.print("이름 : ");
		tmp.setName(scan.next());
		
		int index = indexOfStudent(stds, count, tmp);
		
		if(index ==-1 && count < stds.length/*배열에 꽉차면 추가하지않음*/) {
			stds[count] = tmp; // 일치하는 학생이없으면 tmp를 배열에 저장 
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

	private static int indexOfStudent(Student[] stds, int count, Student tmp) {
		//입력한 학생 정보가 없으면 추가 
		//학생 정보들 중에서 하나씩 비교하여 학년, 반, 번호가 같은 학생이 있는지 확인해서 
		//없으면 마지막 학생 뒤에 추가
		//학생정보있는지 없는 지확인
		for(int i = 0; i<count ; i++) {
			if(stds[i].equals(tmp)) {
				return i; // 일치하는 학생의 위치(번지)
			}
		}
		return -1;
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