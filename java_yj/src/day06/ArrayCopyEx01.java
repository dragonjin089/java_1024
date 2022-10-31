package day06;

public class ArrayCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//배열의 얕은 복사 예제
		int arr1[] = new int[3];
		int arr2[] = arr1;
		
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

