package day06;

import java.util.Scanner;

public class ArrayLottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 로또번호 랜덤으로 생성하고, 당첨번호를 입력하여 몇등 당첨됐는지 출력하는 코드를작성하세요
		 * 숫자범위 : 1~ 45
		 * 1등 : 6개
		 * 2등 : 5개 + 보너스번호
		 * 3등 : 5개
		 * 4등 : 4개
		 * 5등 : 3개
		 * 로또번호 : 번호 6개와 +보너스 번호 */
		
		int min =1, max = 45;
		int arr[] = new int [7];
		int i;
		int arr1[] = new int [6];
		int count =0; // 저장된 랜덤수의 개수
	
		//로또번호 생성
		while(count < 6)
		{
			int r = (int)(Math.random()*(max -min +1)+min);
			boolean isDuplicated = false;
			
			for(int i = 0 ; i < count ; i++) 
			{
				//배열에 저장된 숫자개수만큼 확인
				//i번지에 있는 숫자와 랜덤수가 같으면 isDuplicated를 True로
				if(arr[i]==r)
				{
					isDuplicated=true;
				}
//				있으면 다시 처음으로,
				//  isDuplicated 가 true면
				if(isDuplicated) {
					continue;
				}
				//배열에 저장하고, 저장된 개수 1증가 
				// is Duplicated가 false 면
				arr[count] =r; //arr[count++] =r;
				count++;
			}
			for(int tmp : arr) {
				System.out.println(tmp + " ");
			}

			
	//번호 입력
	Scanner scan = new Scanner(System.in);

	for(i=1;i<=6;i++)
	{
		int num;
		num = scan.nextInt();
		arr1[i]+=num;
		System.out.print(arr1[i]+ " ");
	}
	
	
	
	if(arr[i]==arr1[i]) {
		System.out.println("1등");
	}
	else if(arr[i]+r == arr[i]) {
		System.out.println("2등");
	}
	else if(arr[i] == arr[i]-1) {
		System.out.println("3등");
	}
	else if(arr[i] == arr[i]-2) {
		System.out.println("4등");
	}
	else if(arr[i]+r == arr[i]-3) {
		System.out.println("5등");
	}
		
}

		
		
//		for(i=0;i<6;i++)
		
//		{
//
//			arr[i] = (int)(Math.random()*(max -min +1)+min);
//			System.out.print(arr[i]+ " ");
//			// 저장된 숫자가 6보다 작을때까지
//			boolean isDuplicated = false;
//			//중복생성방지
//			for i
//						
//		} // 45까지 랜덤 6개
		
		//당첨 번호 입력후 몇등 당첨인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		for(i=1;i<=6;i++)
		{
			num = sc.nextInt();
			System.out.print(arr[i]+ " ");
		}
		
	}

}
