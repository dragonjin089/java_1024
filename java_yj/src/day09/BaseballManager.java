package day09;

import java.util.Scanner;

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
		int menu; //
		int count = 0;
		BaseballGame[]list = new BaseballGame[5];
		

		do {
			//메뉴를 출력
			printMenu();
			//메뉴 선택(입력)
			menu = selectMenu();
			//선택한 메뉴에 앉는 기능 실행 
			count = runMenu(menu, list, count);
		}while(menu != 3);
		
		
	}
//	1.메뉴 출력하는 메소드 
	public static void printMenu() {
		System.out.println("---메뉴---");
		System.out.println("1.플레이");
		System.out.println("2.기록확인");
		System.out.println("3.종료");
		System.out.println("----------------");
		System.out.print("메뉴를 선택하세요 : ");
		
		
	}
	
	
	/**
	 * 콘솔에서 입력받은 정수 ( 메뉴 ) 를 알려주는 메소드 
	 * @return 입력받은 정수 (메뉴 ) 
	 * 
	 * */

		public static int selectMenu() 
		{
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		}
		
		/**
		 * 메뉴에 맞는 기능을 실행하는 메소드
		 * @param menu 선택한 메뉴
		 * @param list 학생들 정보가 들어있는 리스트 
		 * @return 현재 저장된 학생 수 
		 */
		public static int runMenu(int menu, BaseballGame []list,int count) {
		
			 
			String name;
			Scanner scan = new Scanner(System.in);
			switch(menu) 
			{
			case 1: 
				 
				 // => createRandomArray
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
				
			case 2: 
				// 기록확인 등록된 5위까지 
				for(int i = 0; i<count; i++)
				{
					BaseballGame[i].printGame();
				}
				break;
			case 3: 
				
				System.out.println("프로그램을 종료합니다.!");
				break;
				
			default: 
				System.out.println("잘못된 메뉴입니다.");
			}
			return count;
		}


	

