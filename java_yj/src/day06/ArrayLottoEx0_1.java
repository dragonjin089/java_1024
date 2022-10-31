package day06;

import java.util.Scanner;

public class ArrayLottoEx0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//보너스 번호를 랜덤으로 생성 (위에서 생성한 번호와 중복되지않게)
		//당첨번호 6개 입력받음
		//일치하는 번호를 개수를 구함 (보너스 번호 제외)
		//등수 판별
		
		//랜덤번호 6개의 로또 번호 생성
		int size=6;
		
		int lotto[] = new int[size];
		int count = 0; 
		int min =1, max =45;  
		
	
		while(count < size)
		{
			
			int r = (int)(Math.random()*(max -min +1)+min);
			
			boolean isDuplicated = false;
		
			for(int i = 0 ; i < count ; i++) 
			{
				
				if(lotto[i]==r)
				{
					isDuplicated=true;
				}
				//System.out.println(bonus);
			}
			
			if(isDuplicated) {
				continue;
			}
			int bonus =(int)(Math.random()*(max -min +1)+min);
			lotto[count] =r; 
			count++;
		}
		System.out.print("로또 번호 확인 : ");
		for(int tmp : lotto) {
			System.out.print(tmp + " " );
		}
		
		//보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지않게)
		int bonus;
		while(true) {
			int r = (int)(Math.random()*(max -min +1)+min);
			boolean isDuplicated = false;

			for(int i = 0 ; i < lotto.length ; i++) 
			{
				
				if(lotto[i]==r)
				{
					isDuplicated=true;
				}
				//System.out.println(bonus);
			}
			
			if(isDuplicated) {
				continue;
			}
			bonus = r;
			break;
		}
		System.out.println(" 보너스 : " + bonus);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n당첨 번호 입력 : ");
		int user[] = new int [size];// 번호입력
		
		
		
		for(int i=0; i<size; i++)
		{
			
			user[i] = scan.nextInt();
			System.out.print(user[i]+" ");
		}
		scan.close();
		//일치하는 번호 개수를 구함(보너스 번호 제외)
		int sameCount =0;
		
		for (int i = 0; i<lotto.length; i++) {
			for (int j =0; j < user.length ; j++) {
				if(lotto[i]==user[j]) {
					sameCount++;
				}
			}
			
		}
		//등수 판별 
		switch(sameCount) {
		case 6: 
			System.out.println("1등");
			break;
		case 5: 
			boolean isDuplicated = false;

			for(int i = 0 ; i < user.length ; i++) 
			{
				
				if(user[i]==bonus)
				{
					isDuplicated=true;
				}
			}
			if(isDuplicated) {
				System.out.println("2등");
			}else {
				System.out.println("3등");
			}
		
			break;
		case 4:
			System.out.println("4등");
			break;
		case 3: 
			System.out.println("5등");
			break;
		default:
			System.out.println("꽝");

		}
		
		
		
//		if(lotto[i]==arr1[i]) {
//			System.out.println("1등");
//		}
//		else if(lotto[i]+bonus == arr[i]) {
//			System.out.println("2등");
//		}
//		else if(lotto[i] == arr[i]-1) {
//			System.out.println("3등");
//		}
//		else if(lotto[i] == arr[i]-2) {
//			System.out.println("4등");
//		}
//		else if(lotto[i]+r == arr[i]-3) {
//			System.out.println("5등");
//		}
//		
		
	
		
		
	}

}
