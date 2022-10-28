package day05;
import java.util.*;
public class ForUpDownEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하세요.
		// 예시 : (생성한 램덤한 수 70)
		//1~100 사이의 랜덤한 수를 맞추시오 
//		숫자를 입력하세요 : 50
//		up
//		숫자를 입력하세요 :75
//		down	
//		숫자를 입력하세요 : 70 
//		정답입니다.
		
//		랜덤한 수 생성
//		랜덤수를 맞추기 
//      반복횟수 : 맞출때까지 -> 랜덤수 r 과 입력한 수가 일치 하지 않을대깢 ㅣ
//		규칙성 : 
//		1.숫자를 입력하세요 : 안내문구 출력
//		2.정수를 입력받음
//		3. 입력받은 정수가 r과 같으면 정답입니다라고 출력하고 
//		입력받은 정수가 r 보다  크면 다운이라고 출력
//		아니면 up이라고 출력한다.
		
		
		
		System.out.println("숫자를 입력하세요");
		
		
		int min =1, max = 100;
		
		int i;
		int r = (int)(Math.random()*(max -min +1)+min);
		System.out.println(r); // 임시출력
		
		int num = min -1; 
		Scanner sc = new Scanner(System.in);
		
		
		for(i=min;r!=max;i++)//반복문틀림 
		{
//			1. 숫자를 입력하세요 : 안내문구출력
			System.out.print("숫자를 입력하세요  : ");
//			2. 정수를 입력받음
			num = sc.nextInt();
//			3. 입력받은 정수가 r 과 같으면 정답입니다. 라고 출력하고
			if(num>r) {
				System.out.println("down");
			}
			else if(num<r) {
				System.out.println("up");
			}
			else {
				System.out.println("정답");
				break;
			}
			
		}
		
	}

}
