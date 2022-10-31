package day06;
import java.util.*;


public class ArrayUpDownEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Up Down 게임을 무조건 3번 반복해서 맞춘 
		//	3번의 횟수를 배열에 저장하여 출력하는 코드를 작성하세요
		// 각 게임당 맞춘 횟수를 배열에 저장하여 출력
		
		int min =1 , max =10 ;
		
		
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				

				
				Scanner scan = new Scanner(System.in);
				int num[] = new int[7];
				
				
			
				int r = (int)(Math.random()*(max -min +1)+min);
				System.out.println(r);
				
				System.out.print("숫자를 입력하세요  : ");
				num[j] = scan.nextInt();
				if(num[j]>r) {
					System.out.print("down");
				}
				else if(num[j]<r) {
					System.out.print("up");
				}
				else {

					System.out.print("정답");
					break;
				}
				System.out.println();
				
			}
	
	
		
		}


}
}