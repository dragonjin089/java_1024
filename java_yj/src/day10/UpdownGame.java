package day10;



import java.util.Scanner;

public class UpdownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Up Down 게임을 무조건 3번 반복해서 맞춘 
		//	3번의 횟수를 배열에 저장하여 출력하는 코드를 작성하세요
		// 각 게임당 맞춘 횟수를 배열에 저장하여 출력
		
		int coin =3;
		
		int record[] = new int[coin];
		//랜덤함수 생성
		int min =1, max = 100;
		Scanner scan = new Scanner(System.in);
		while(coin-- > 0 ) 
		{
			int r = (int)(Math.random()*(max -min +1)+min);
			System.out.println(r);
			System.out.println(min+"~"+max + " 상이의 랜럼한 수를 맞추세요");
			int num;
			int tryCount = 0;
			do {
				tryCount++;
				System.out.print("숫자 입력 : ");
				num = scan.nextInt();
					
				if(num>r) {
					System.out.println("down");
				}
				else if(num<r) {
					System.out.println("up");
				}
				else {
					System.out.println("정답");
					record[record.length - coin -1]/*코인 2 1 0 시작 -> 최종적으로 321*/ = tryCount++;
					break;
				}
			}while(r!=num);
			
		
		
		}
		for(int i = 0; i<record.length;i++) {
			System.out.println(i+1+"번째 게임횟수 : "+record[i]);
		}

	}

}
