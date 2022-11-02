package day08;

import java.util.Arrays;
import java.util.Scanner;

public class MethodBaseballGameEx03 {

	public static void main(String[] args) {

		int min =1, max =9, size=3;
		int []com = createRandomArray(min,max,size);
		printArray(com);

		//2. 사용자가 숫자를 선택
		//int []user = new int[size];
		Scanner scan = new Scanner(System.in);
		//3.판별
		int strike=0,ball;
		do {
			System.out.print("입력 : ");
			int []user = scanArray(scan,size);
			// 3. 판별
			// -> 스트라이크 판별하는 기능을 구현
			// -> countlotto 이용하여 일치하는 개수 - 스트라이크 개수 // 볼 
			
			strike = getStrike(com,user);
			ball = getBall(com,user);
		
			printGame(strike, ball);
			//2~3 을 반복(3S 가 될떄까지
			
		}while(strike <3);
		System.out.println("게임종료");
		scan.close();
	
	}
	/**
	 *  기능 : strike 와 ball 의 개수가 주어지면 콘솔에 결과를 출력하는 메소드
	 *  @param  strike 스트라이크개수
	 *  @param  ball 볼개수
	 
	 * */
	
	public static void printGame(int strike, int ball) {
		if(strike != 0 ) {
			System.out.println(strike+ "S");
		}
		if(ball != 0) {
			System.out.println(ball+"B");
	
		}
		if(strike ==0 && ball ==0) {
			System.out.println("out");
		}
		System.out.println();
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
	
	/**
	 * 기능 : 두 배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇개 있는지 알려주는 메소드 
	 * @param arr1 int [] : 첫번째 정수 배열
	 * @param arr2 int [] : 두번째 정수 배열
	 * @return 같은 번지에서 일치하는 숫자들의 개수 
	 */
	
	public static int getStrike(int []arr1, int arr2[]) {
		if (arr1 == null || arr2 == null) {
			return 0;
		}
		int size = arr1.length < arr2.length? arr1.length : arr2.length;
		int strike =0;
		for(int i = 0; i< size; i++) {
			if(arr1[i] == arr2[i]) 
			{
			strike ++;	
			}
			}
		return strike;
	}
	
	/**
	 * 기능 : 두 정수 배여리 주어지면같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수를 알려주는 메소드
	 * @param arr1 int [] : 첫번째 정수 배열
	 * @param arr2 int [] : 두번째 정수 배열
	 * @return 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수 
	 */
	public static int getBall(int []arr1, int arr2[]) {
		if (arr1 == null || arr2 == null) {
			return 0;
		}
		int ball=0;
		int strike = getStrike(arr1,arr2);
		for(int num : arr1) {
			//arr1 에서 하나꺼내서 
				if(contains(arr2,num)) {
					//array 2에 넣어서
					ball++;
				}
		}
		return ball - strike;
	}
	
	/**
	 * 기능 : Scanner가 주어지면 정수를 size 개 만큼 입력받아 배열에 저장하고 , 저장된 배열을 돌려주는 메소드
	 * 매개변수 : Scanner ,size 개 => Scaaner scan , int size 
	 * 리턴타입 : 정수 배열 => int []
	 * 메소드명 : ScanArray
	 * 
	 * @param scan Scanner 
	 * @param size 입력받을 정수의 개수
	 * @return 입력받은 값들이 저장된 배열 
	 */
	public static int[] scanArray(Scanner scan, int size) {
		if(size <= 0) {
			return null;
		}
		int []arr = new int[size];
		for(int i =1 ; i< size ; i++) {
			arr[i] =scan.nextInt();
		}
		return arr;
	}
	
//	public static int[] scanArray(Scanner scan, int size) {
//		return null; 
//	}
	public static int countLotto(int []arr1, int []arr2) 
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
}