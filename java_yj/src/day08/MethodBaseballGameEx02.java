package day08;

import java.util.Arrays;
import java.util.Scanner;

public class MethodBaseballGameEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1~ 9 사이의 중복되지 않은 3개의 숫자가 랜덤으로 생성이되고 생성된 숫자를 맞추는 게임
		 * 랜덤함수
		 * int r = (int)
		 * 규칙
		 * - 숫자가 같은 자리에 있으면 strike
		 * - 숫자가 있지만 다른자리에 있으면 ball
		 * - 일치하는 숫자가 하나도 없으면out 
		 * 예시( 랜덤숫자 : 5 9 8 ) 
		 * 입력 : 1  2 3
		 * 0 out
		 * 입력 : 4 5 6
		 * 1ball
		 * 입력 : 7 8 9 
		 * 2 ball
		 * 입력 : 7 9 8
		 * 2 strike
		 * 입력 : 7 9 5
		 * 1 strike 1ball
		 * 입력 : 5 9 8 
		 * 3 strike
		 * 게임 종료 
	
		 */
		
		
		//1.
		//1. 랜덤으로 세개의 수를 선택
		int min =1, max =9, size=3;
		
		int []com = createRandomArray{min,max,size};
//		int min =1, max =9;
//		int size =3;
//		int [] createNumber = createRandomArray(min,max,size);
//		Arrays.sort(createNumber); // 정렬
//		//생성 번호 출력
//		System.out.print("생성 숫자  : ");
		printArray(com); 
		
		//2. 사용자가 숫자를 선택
		int []user = new int[size];
		System.out.print("입력 숫자  : ");
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < user.length;i++) 
		{
			user[i] = scan.nextInt();
		}
		scan.close();
		//3. 판별 
		// -> 스트라이크 판별하는 기능을 구현
		// -> countlotto 이용하여 일치하는 개수 - 스트라이크 개수 // 볼 
		// ->
		//2~3 을 반복(3S 가 될떄까지
	
		}
	

	
	


	public static void printArray(int arr[]) {
		if( arr == null) {
			return;
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	//createRandomArray
	public static int[] createRandomArray(int min ,int max,int size) 
	{
		if(max - min +1 <= size ) {
			return null;
		}
		
		int arr[]= new int[size];
		//i는 0부터 i가 배열의 크기보다 작을때까지 1씩 증가
		//i는 0부터 i 가 배열의 크기보다 작을때까지 
		for(int i =0; i<arr.length;/*고정이 아니여서 사라짐*/) 
		{
			//랜덤한 수를 배열 i번지에 저장
			//랜덤한수를 r에 저장
			
			int r = random(min,max);
			// 배열에 r 이 없으면 배열 i 번지에 r을 저장한 후 i를 1증가
			if(!contains(arr,r)) {
				arr[i] =r;
				i++;
			}
			
		}
		return arr;
	}
	
	public static int random(int min, int max) {
		if(min>max) {
			int tmp =min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max -min +1)+min);
	}
	
	
	public static boolean contains(int []arr, int num) 
	{
		if(arr ==null || arr.length ==0) {
			return false;
		}
				for(int tmp : arr) 
		{
			if (num ==tmp)
			{
				return true;
			}
		}
	return false;
	}
	
	
	//2. 사용자가 숫자를 선택
	
	//3. 판별 
			// -> 스트라이크 판별하는 기능을 구현
			// -> countlotto 이용하여 일치하는 개수 - 스트라이크 개수 // 볼 
	
	public static int countArray(int []arr1, int []arr2) 
	{
		if (arr1 == null || arr2 == null) {
			return 0;
		}
		
		int Count = 0;
		
		for (int tmp : arr1) {
			if(contains(arr2, tmp)) {
				Count++;
				
				
			}
		}
		return Count;
	}
	
//	public static int count(int []arr1, int []arr2) 
//	{
//		if (arr1 == null || arr2 == null) {
//			return 0;
//		}
//		
//		int strike = 0;
//		int ball =0;
//			for(int i = 0; i<arr1.length ;i++) {
//				for(int j =0; j<arr2.length ; j++)
//				{
//					if(arr1[i]==arr2[j]) {
//						ball ++;
//					}
//					else if (arr1[i]==arr2[i]) {
//						ball --;
//					}
//				}
//			
//				if(arr1[i]==arr2[i]) {
//				strike ++;
//			}
//			
//				return strike;
//		}
//		
//			
//			return ball;
//	}
//	
//	
	
	
	/*
	for(i = 0; i< size ;i++) {
		for(j =0; j< size ; j++)
		{
			if(arr1[i]==arr2[j]) {
				ball ++;
			}
			else if (arr1[i]==arr2[i]) {
				ball --;
			}
		}
		if(arr1[i]==arr2[i]) {
			strike ++;
		}
		
	}
	*/
	/*strike ball 판별 중복 for문
	 *
	 * 
	 * 
	 * 
	 * */
	
	
	
	
	
}

