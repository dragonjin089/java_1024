package day05;
import java.util.*;
public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 5개 짜리 배열을 생성하여 2부터 5개의 소수를 배열에 저장하고 출력하세요 .
		//반복횟수 : num 가 2부 터 1씩증가
		// 규칙성 : num 가 소수이면 배열  i 번지에 num을저장
		// 규칙성 : 
//		1. num가 소수이면 배열 index번지에 num에 저장
//		2. index를 1증가
//		3. index가 배열의 크기와 같으면 반복문종류
//		4. 반복문 종료후 : 배열의 값을 출력 (반복문이용)

		int num =121; //소수 판별하려는 수
		int i; // 약수를 찾기 위해 1부터 num 까지 증가시키려는 수
		int count; // num 의 약수 개수를 저장하는수
		int arr[] = new int[5]; // 소수를 저장할 5개짜리 정수배열
		int index =0;// 소수를 저장할 배열의 번지
		for (num =2; ; num++) {
			// num 소수인지 판별하는 코드 
			for(i =1, count= 0; i<=num; i++){
				if(num% i ==0) {
					count++;
				}
			}
			
			
			if(count ==2) {
				arr[index] = num;
				index++;
			}
			if(index == arr.length) {
				break;
			}
		}
		for (int tmp : arr) {
			System.out.print(tmp + "");
		}
		
	
	
	}

}
