package day10_1;

import java.util.Scanner;

import day10.Record;

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 플레이 
		 * 컴퓨터가 랜덤 1~3개 숫자를 부름
		 * 사용자가 몇개의 숫자를 부를지 입력
		 * 2. 기록확인
		 * 3. 종료 
		 * 
		 * 예식
		 * 1 2 3 [컴퓨터 ]
		 * > 2 [사용자 입력]
		 * 4 5 [ 사용자 입력에 따른 결과] 
		 * 6 [컴퓨터 ]
		 * 
		 * */
		
		
		// 메뉴 구현 
		int menu; 
		Record[] records = new Record[5];
		do {
			//메뉴출력
			printMenu(); //printMenu  메소드 생성 
			// 메뉴 선택
			menu = insertInt();
			//선택한 메뉴를 따른 기능실행 : 선택한 메뉴 : 기록정보 
			runMenu(menu, records);
		}while(menu != 3); // 3이 아닐시 계속진행 3일 시 종료	
	}
	
	/**
	 * 고정된 메뉴를 출력하는 메소드 
	 * */
	// 메서드 구현 
	public static void printMenu() {
		System.out.println("--------------");
		System.out.println("메뉴 ");
		System.out.println("1. 플레이 ");
		System.out.println("2. 기록확인 ");
		System.out.println("3. 종료");
		System.out.println("--------------");
		System.out.println("메뉴 선택 : ");
	}

	/**
	 * 콘솔에서 정수를 입력받아 입력받은 정수를 알려주는 메소드
	 * @param return 입력받은 정수 메뉴 
	 * */
	
	
	private static int insertInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	/**
	 *  주어진 기록벙조를 이용하여 메뉴를 따른  기능을 실행하는 메소드
	 * @param records 입력받은 정수 
	 * @param menu 선택한 메뉴 
	 * */
	
	public static void runMenu(int menu, Record[] records) {
		switch(menu) {
		case 1: 
			// 플레이 하고 나면 몇번만에 맞췄는지 알아야함
			int tryCount = playGame(); // 메소드구현 
			
			// 기존 기록보다 좋으면 기록을 추가 -> 메소드 
			writeRecord(records, tryCount);
			
			break;
		case 2: 
			//기록확인, 기록된 순위를 출력
			printRecords(records);
			
			break;
			
		case 3: 
			System.out.println("프로그램 종료");
			break;
			
			default: 
				System.out.println("잘못된 메뉴입니다.");
		}
	}
	
	private static void printRecords(Record[] records) {
		
		for(int i = 0 ;i< records.length; i++) {
			System.out.println(i+1+"위");
			if(records[i]  != null) {
				records[i].print();
			}else {
				System.out.println();
			}
		}
	}
	
/**
 * 기록 : 정보보다 사용자 기록이 좋으면 기록 추가하는 메소드 
 * @param records 기록정보 
 * @param tryCount 사용자 기록 
 * */ 
	
	private static void writeRecord(Record[] records, int tryCount) {
		int index = 0;
		for(int i = 0; i< records.length; i++) {
			//1등 부터 비교하여 나보다 기록이 좋으면 내순위가 밀림
			if(records[i] != null && tryCount >= records[i].getCount()) {
				index++;
			}
			// 기록이 없는 처음 순위를 내기록으로 하기위해 i를 인덱스에 저장 
			else if(records[i] == null) {
				index = i;
				break;
			}
			//비교 순위 보다 내가 기록이 좋으면 반복문 종료 
			else {
				index = i; 
				break;
			}
			//순위안에 못들면 
			if(index ==5) {
				return;
			}
			
			System.arraycopy(records, index, records, index+1, records.length-index-1); // 다시볼코드
			
			System.out.println("이름입력 (예 : kyj : ");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();
			records[index] = new Record(tryCount, null);
		}
	}
	
	public static int playGame() {
		int num = random(1,3);
		int tryCount = 0; // 31일 할시 증가 
		int lastNum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("게임 시작 ");
		while(true) {
//			1. 컴퓨터 랜덤으로 1~3 숫자 실행
			System.out.println("컴퓨터 :");
		}
		
		
		
	} // 31게임 코드작성 
	
	
	public static int random(int min, int max) {
		return (int)(Math.random()*(max - min +1)+min);
	}
	
// 다시 볼코드 
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
	
	
	
	
	
	
	
	
	
}
