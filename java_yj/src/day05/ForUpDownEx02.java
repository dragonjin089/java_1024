package day05;

import java.util.Scanner;

public class ForUpDownEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*랜덤한 함수를 맞추는 UP, DOWN 게임
		 * 예시
		 * 숫자를 입력하세요 : 50
//		up
//		숫자를 입력하세요 :75
//		down	
//		숫자를 입력하세요 : 70 
//		정답입니다.
//더하시겠습니까?(y/n) ; y
		
//		랜덤한 수 생성
//		랜덤수를 맞추기 
//      반복횟수 : 맞출때까지 -> 랜덤수 r 과 입력한 수가 일치 하지 않을대깢 ㅣ
//		규칙성 : 
//		1.숫자를 입력하세요 : 안내문구 출력
//		2.정수를 입력받음
//		3. 입력받은 정수가 r과 같으면 정답입니다라고 출력하고 
//		입력받은 정수가 r 보다  크면 다운이라고 출력
//		아니면 up이라고 출력한다.
		 * 
		 * */
//		반복횟수 : 없음
//		규칙성 : 
//		-1 . 게임 한판
//		-2 . 정답 맞춘후 -> 더하시겠습니까
//		-3 . 문자 하나를 입력
		
		
		
		
System.out.println("숫자를 입력하세요");
		
		
		int min =1, max = 100;
		
		int i;
		int r = (int)(Math.random()*(max -min +1)+min);
		System.out.println(min + '~' + max  + "사이의 랜덤한 수를 맞추세요");
		System.out.println(r); // 임시출력
		
		int num = min -1; 
		Scanner sc = new Scanner(System.in);
		
		char re;
		
		
		for(i=min;r!=max;i++)//반복문틀림 
		{
//			1. 숫자를 입력하세요 : 안내문구출력
			System.out.print("숫자를 입력하세요  : ");
//			2. 정수를 입력받음
			num = sc.nextInt();
//			3. 입력받은 정수가 r 과 같으면 정답입니다. 라고 출력하고
			if(num>r) 
			{
				System.out.println("down");
			}
			else if(num<r) 
			{
				System.out.println("up");
			}
			else 
			{
				System.out.println("정답");
				System.out.print("더하시겠습니까.?(y/n) : "+ re);
				int re = sc.next().charAt(0);
				if(re=='y') 
				{
					for(i=min;r!=max;i++) {
						num = sc.nextInt();
						
						if(num>r) 
						{
							System.out.println("down");
						}
						else if(num<r) 
						{
							System.out.println("up");
						}
						else 
						{
							System.out.println("정답");
						}	
					}
					
				}
				else if(re=='n')
				{
					System.out.println("프로그램 종료 ");
					break;
			}	
				}
			
			}
		
	}


}
	
}
