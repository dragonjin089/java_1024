package day05;
import java.util.*;
public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 정수 4개짜리 배열을 생성한 후 , 
			 * 4자리 숫자를 입력받아 배열에 저장하는 코드를 작성하세요.
			 * 1234
			 * 0번지에 : 1
			 * 1번지에 : 2 
			 * 2번지에 : 3 
			 * 3번지에 : 4
			 * */
	
		//4자리 정수를 입력
		/*반복횟수 4번
		 * 규칙성 :
		 * 
		 * num에서 1의 지를 추출   1234에서 4를 추출
		 * %10
		 * 추출된 1의 자리를 배열에 저장   arr[3] = 4
		*  num에서 1의 자리를 제거하여 num에 저장 1234 에서 
		*  123을 num 에 저장
		*  /10
		* 반복문 종료후 : 배열에 있는 값을 출력 
		*/
		
		Scanner scan = new Scanner(System.in);
	
	
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int []arr = new int[4];
		int i;
		for(i=0;i<=3;i++) 
		{
			
			System.out.println(i+"번지에 : "+(num%10) );
			
			num /= 10;
			
		}
	
	}
}
	
	 //강사님 코드 
//	int size =4;
//	System.out.print(size+"숫자를 입력하세요 : ");
//	int num = scan.nextInt();
//	
//	int arr[] = new int[size];
//	for (int i = size-1 ; i>=0; i--) {
//		arr[i] = num %10 ;
//		num /= 10;
//		
//	
//		//
//		for(int tmp: arr) {
//			System.out.println(tmp);
//		}
/////////////////////////////////	
	
// 문제 2번 
//int num2 = num;
//int arr[] = new int[size];
//for (int i = size-1 ; i>=0; i--) 
//{
//	arr[i] = num %10 ;
//	num /= 10;
//	
//
//	//
//	int i = size -1; 
//	while(num2 != 0)
//	{
//		arr[i--] = num2 %10;
//		num2 = num2 /10 ;
//	}
//	for(int tmp: arr) {
//		System.out.println(tmp);
//	}
//	
//	
//}
