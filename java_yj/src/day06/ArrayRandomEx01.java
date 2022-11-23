package day06;

import java.util.Scanner;

public class ArrayRandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤으로 1~9사이의 숫자를 3개 생성하여 저장 하는 코드를 작성하세요.
		//
		
		int min =1, max = 9;
		int arr[] = new int [3];
		int i;
		
		
		
//		for(i=0;i<arr.length;i++){
//			int r = (int)(Math.random()*(max -min +1)+min);
//			
//			arr[i] += r;
//			System.out.print(arr[i]+ " ");
//			
//		}
		
		/*
		 * for(i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*(max -min +1)+min);
			
			
			System.out.print(arr[i]+ " ");
			
		}
		 * */
		//정수를 입력받아 랜덤한 수에 있는지 없는지 확인해서 알려주는 코드를 작성하세요.
		//예시 
		//정수를 입력하세요 : 4
		//4는 있습니다. 
		
		
		for(i=0;i<arr.length;i++)
		{

			arr[i] = (int)(Math.random()*(max -min +1)+min);
			System.out.print(arr[i]+ " ");
						
		}
		
		Scanner scan= new Scanner(System.in);
		System.out.println();
		System.out.print("숫자를 입력하세요  ");
		int num = scan.nextInt();
		scan.close();
//강사님코드
		boolean isDuplicated = false; // 변수 중복
		// 중복이 안됨으로 초기화 
		for( i=0; i<arr.length; i++)
		{
			//i번지에 있는 값과 같으면 num가 같으면 
			if(arr[i]==num) {
				//중복했다고 저장함 
				isDuplicated = true;
				break;
			}
		}
		// 중복 있으면 있다고 출력하고 아니면 없다고 출력 
		if(isDuplicated) {
			System.out.println(num+"은 있습니다.");
		}
		else {
		System.out.println(num+"는 없습니다.");
			}	
		
//			}
//		if(arr[i-1]==num) {
//			System.out.println(num+"은 있습니다.");
//		}
//		else {
//			System.out.println(num+"는 없습니다.");
//		}
		
	}
}

