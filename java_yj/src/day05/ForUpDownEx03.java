package day05;
import java.util.*;
public class ForUpDownEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.println("숫자를 입력하세요");
		
		
		int min =1, max = 100;
		
		int i;
		
//		System.out.println(r); // 임시출력
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int r = (int)(Math.random()*(max -min +1)+min);
			System.out.println(min + '~' + max  + "사이의 랜덤한 수를 맞추세요");
			int num = min -1; 
		
		for(;r!=max;)//반복문틀림 
		{
//			
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
			}
		
			System.out.print("더하시겠습니까.?(y/n) : ");
			
			if(sc.next().charAt(0)=='n') 
			{
				break;
			}
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		}

	}
}