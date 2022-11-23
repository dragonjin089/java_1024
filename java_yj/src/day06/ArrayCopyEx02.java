package day06;

import java.util.Arrays;

public class ArrayCopyEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr1[] = new int[1,2,3];
		int arr1[] = new int[] {1,2,3};
		int arr2[];
		
		int tmpArr[] = new int [arr1.length];
		for(int i = 0 ; i < arr1.length ; i++) {
			tmpArr[i] = arr1[i];
		}
		arr2 = tmpArr;
		//		arr2 = arr1; // arr1을 얕은 복사해서 arr2를 만듬 
		
		// 깊은 복사 예제 2
//		arr2 = new int [arr1.length];
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		//깊은 복사 예제 3
		//arr2 = Arrays.copyOf(arr1,arr1.length);
		//
		/*	int tmpArr[] = new int [arr1.length];
			for(int i = 0 ; i < arr1.length ; i++) {
			tmpArr[i] = arr1[i];
		}
		 * */
		//arr1 과 arr2 값 확인
		
		for(int i = 0 ; i<arr1.length; i++) 
		{
			System.out.println("arr1["+i+"] ="  + arr1[i] + "," 
					+ "+ arr2["+i+"]= "+arr2[i]);
		}
		arr1[0] = 10; //arr1 의 값만 10으로 변경
		
		System.out.println("--------------------------------");
		for(int i = 0 ; i<arr1.length; i++) 
		{
			System.out.println("arr1["+i+"] ="  + arr1[i] + "," 
					+ "+ arr2["+i+"]= "+arr2[i]);
		}
		
		
	}

}
