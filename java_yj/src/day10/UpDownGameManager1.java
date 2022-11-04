package day10;

import java.util.Scanner;

public class UpDownGameManager1 {

	public static void main(String[] args) {

		/*updown 게임을 구현하세요 .
		 * 1. 플레이 
		 * 2. 기록확인
		 * 3. 종료
		 * */
		
		//1. 메뉴구현 
		//2. do while문 -> 스위치문 사용하여 메뉴 선택
		
		int menu;
		Record[] records = new Record[5]; // 
		do {
			//메뉴 출력
			printMenu(); //printMenu 메소드 생성 
			// 메뉴 선택 
			menu = insertInt();
			//선택한 메뉴를 따른 기능 실행 : 선택한 메뉴 , 기록정보 
			runMenu(menu, records);
		}while(menu !=3); // 3이 아닐시 계속진행 3일시 종료 	
		//3. 메소드 updown 코드
	}
	/**
	 * 고정된 메뉴를 출력하는 메소드 
	 * 
	 * */
	public static void printMenu() {
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1. 플레이 ");
		System.out.println("2. 기록확인");
		System.out.println("3. 종료 ");
		System.out.println("----------------");
		System.out.println("메뉴선택 : ");
	}
	/**
	 * 콘솔에서 정수를 입력받아 입력받은 정수를 알려주는 메소드 
	 * @return 입력받은 정수 , 메뉴 
	 * 
	 * */
	private static int insertInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	/**
	 * 주어진 기록정보를 이용하여 메뉴를 따른 기능을 실행하는 메소드 , 
	 * @param records 기록 정보들 
	 * @param menu 선택한 메뉴 
	 * 
	 * */
	
	public static void runMenu(int menu, Record[] records) {
		switch (menu) {
		case 1:
			//플레이 하고 나면 몇번만에 맞췄는지 알아야함 
			int tryCount = playGame();// 메소드 구현 
			
			//기존 기록보다 좋으면 기록을 추가 -> 메서드 
			writeRecord(records,tryCount);
			
			break;
			
		case 2: 

			//기록확인
			//기록된 순위를 출력
			printRecords(records);
			
			break;
			
		case 3: 
			System.out.println("프로그램을 종료합니다.");
			break;
			
			default:
				System.out.println("잘못된 메뉴입니다.");
		}
	
	}
	
	private static void printRecords(Record[] records) {
		// TODO Auto-generated method stub
		for(int i =0; i<records.length; i++) {
			System.out.println(i+1+"위");
			if(records[i] != null) {
				records[i].print();
			}else {
				System.out.println();
			}
		}
	}
	/**
	 * 기록 정보보다 사용자 기록이 좋으면기록을 추가하는 메소드 
	 * @param records 기록 정보
	 * @param tryCount 사용자 기록 
	 * */
	private static void writeRecord(Record[] records, int tryCount) {
		int index = 0;  
		for(int i = 0; i<records.length; i++) {
			//1등부터 비교하여 나보다 기록이 좋으면 내순위가 밀림
			if(records[i] != null && tryCount >= records[i].getCount()) {
				index++;
			}
			//  기록이 없는 처음 순위를 내기록으로 하기위해 i를 index에 저장
			else if(records[i] == null) {
				index = i;
				break; 
			}
			//비교 순위보다 내가 기록이 좋으면 반복문종료
			else {
				index = i;
				break;
			}
			// 순위안에 못들으면 
		if(index ==5) {
			return;
		}
		System.arraycopy(records, index, records, index+1, records.length
				-index-1);
		System.out.println("이름 입력 (예 : kyj) : ");
		Scanner scan = new Scanner(System.in);
		String name =scan.next();
		records[index] = new Record(tryCount, null);
		}
		
	}
		
	public static int playGame() {
		
		//랜덤수 생성
		int num = random(1,100);
		System.out.println(num);
		int tryCount = 0;
		int user;
		// 반복 
		do {
			//사용자 입력 
			System.out.println("정수 입력 : ");
			user = insertInt();
			//updown 판별
			if(user> num) {
				System.out.println("down");
			}else if(user < num) {
				System.out.println("up");
			}else {
				System.out.println("정답");
			}
			tryCount++; // 시도횟수
		}while(num != user);
		return tryCount;
	}
		//기존 기록보다 좋으면 기록을 추가
		//틀릴시 trycount 증가 
	public static int random(int min, int max) {
		return (int)(Math.random()*(max - min +1)+min);
	}

	
	private static void addRecord(Record[] records, int tryCount) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요(예 : kyj) : ");
		String name = scan.next();
		Record r = new Record(tryCount, name);
		
		int index = 0;
		for (Record record : records) {
			if(record != null && record.getCount() <= tryCount) {
				index++;
			}
		}
		for(int i = records.length-1; i >index ; i--)
		{
			records[i] = records[i-1];
		}
		records[index] =r;
	}
	
	private static int getMaxRecordRank(Record[] records) {
		int rank = 0;
		for(Record record : records) {
			if(record != null) {
				rank++;
			}
		}
		return rank;
	}
	private static int getMaxRecordCount(Record[] records) {
		// TODO Auto-generated method stub
		int count = 9999999;
		for(Record record : records) {
			if(record != null) {
				count = record.getCount();
			}
		}
		return count;
	}
	
	/**
	 *메뉴를 출력하는 메소드로 , 마지막 메뉴는 엔터를 안침
	 *@param strs. 콘솔에 출력할 메뉴들 마지막 문장은 엔터를 안침 */
	
	//가변인자


	
}
