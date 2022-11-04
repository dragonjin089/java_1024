package day10;

import java.util.Scanner;

import day08.MethodBaseballGameEx01;
import day08.MethodBaseballGameEx0_1;
// 메서드 가져올때 import문 사용해야함


public class BaseballManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	숫자 야구게임을 플레이 한후 기록을 저장한후 프로그램을 작성하세요
		 * 
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴선택 : 2
		 * 1. 홍길동 2회 
		 * 2. 임꺽정 3회
		 * 3. 이몽룡 3회
		 * 4. 춘향이 4회
		 * */
		int menu;
		Record [] records = new Record[5]; //5등까지 저장
		
		do {
		// 메뉴 출력
		printMenu(
			"--------------",
			"메뉴",
			"1.플레이",
			"2.기록확인",
			"3. 종료",
			"================",
			"메뉴선택 :"
		);
	
		// 메뉴 선택
		menu = selectMenu();
		//선택한 메뉴를 따른 기능 실행
		runMenu(menu, records);
		}while(menu != 3);
		
	}
/**
 * 주어진 메뉴에 맞는 기능을 실행하는 메소드
 * @param menu 실행할 메뉴 번호 
 * */
	
	
private static void runMenu(int menu, Record[] records) {
		// TODO Auto-generated method stub
		switch(menu) {
		case 1: 
			//1. 플레이 
			//컴퓨터가랜덤으로 숫자생성
			int []com = MethodBaseballGameEx01.createRandomArray(1, 9, 3);
			MethodBaseballGameEx0_1.printArray(com);
			BaseballGame bg = new BaseballGame(com);
			int tryCount =0;
			
			do {
				//사용자가 숫자입력
				int []user = MethodBaseballGameEx0_1.scanArray(new Scanner(System.in), 3);
				bg.setUser(user);
				
				//결과 출력
				bg.printResult();
				tryCount++;
			}while(bg.getStrike() !=3);
			//[new] 회수를 기록(최대 5등)
			//5등 기준으로 회수가 동일한 경우 먼저 플레이한 사용자 기록을 유지
			// 기록의 최대 횟수를 찾음
			int maxRecordCount = getMaxRecordCount(records);
			//기록된 수를 찾음 ( 꼴찌 순위)
			int maxRecordRank = getMaxRecordRank(records);
			//기록된 최대 횟수가 내 횟수보다 크거나 기록된 수가 5보다 작으면 기록
			if(maxRecordCount > tryCount || maxRecordRank <5) {
				addRecord(records, tryCount);
				
			}
			break;
			
		case 2: 
			printRecords(records);
			break;
			
		case 3: 
			break;
			
		default: 
		
		}
	}

//private static void printRecords(Record[] records) {
//	
//	for(int i=0; i<records.length; i++);
//	{
//		System.out.print(i+1+"위");
//		if(records[i] != null)
//		{
//			records[i].print();
//		}
//		else 
//		{
//			System.out.println(); 
//		}
//	}
//}

private static void printRecords(Record[] records) {
	for(int i =0 ; i<records.length; i++) {
		System.out.print(i+1+"위 ");
		if(records[i] != null) {
			records[i].print();
		}else {
			System.out.println();
		}
	}
	
}
private static void addRecord(Record[] records, int tryCount) {
	Scanner scan = new Scanner(System.in);
	System.out.println("이름을 입력하세요(예 : kyj) : ");
	String name = scan.next();
	Record r = new Record(tryCount, name);
	
	int index = 0;
	for (Record record : records) {
		if(record != null && record.getCount() < tryCount) {
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
// 메뉴선택 메소드 
/**
 * 메뉴를 콘솔에서 입력받아 돌려주는 메소드
 * @return 입력받은 메소드 
 * */


private static int selectMenu() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}


/**
 * 
 * 메뉴를 출력하는 메소드로 , 마지막 메뉴는 엔터를 안침
 * @param strs. 콘솔에 출력할 메뉴들 마지막 문장은 엔터를 안침
 * */

	// 가변인자
	private static void printMenu(String ...strs) 
	{
		// TODO Auto-generated method stub
		for(int i = 0; i<strs.length; i++) 
		{
//			System.out.println(strs[i]);
//			if(i == strs.length-1) {
//				//마지막이 아니면 엔터
//				System.out.println();
//			}
			System.out.println(strs[i] + (i!= strs.length? "\n": ""));
		
		}
	
	}
}