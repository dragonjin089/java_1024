package day09;

import java.util.Scanner;

public class BaseballManager_01 {

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
*/
	// 메뉴 출력
	//메뉴선택
	// 선택한 메뉴에 따른 기능
	/*
	 *1.플레이
	 * 컴퓨터가 랜덤으로 숫자 생성 
	 * // => createRandomArray
		int min = 1, max = 9, size = 3;
		int []com = createRandomArray(min, max, size);
		printArray(com);
		
		Scanner scan = new Scanner(System.in);
		
		int strike = 0, ball;
		do {
			//2.사용자가 숫자를 선택
			System.out.print("입력 : ");
			int []user = scanArray(scan, size);
			
			//3.판별
			// => 스트라이크를 판별하는 기능을 구현 
			// => countLotto를 이용하여 일치하는 개수 - 스트라이크 개수 => 볼의 개수
			strike = getStrike(com, user);
			ball = getBall(com, user);
			
			printGame(strike, ball);
			//2~3을 반복(3S가 될때까지)
		}while(strike < 3);
		System.out.println("게임 종료.");
		scan.close();
	}
	 * 
	 *사용자가 숫자입력
	 *판별
	 *3s종료
	 *[new]회수를 기록(최대 5등) 5등기준으로 회수가 동일한 경우  먼저 플레이한 사용자 기록을 유지 
	 *
	 *
	 *2. 기록확인
	 *	// 등록된 5위가지의 기록을 확인
	 *
	 *3. 종료 
	 * */
		
		
	}
	
}

		