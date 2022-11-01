package day07;

public class MethodArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~ 9 사이의 랜덤한 수를 배열에 3개  저장하는 코드를 작성하세요
		//메소드를 이용할 것 
	
		int arr[]= new int [3];
		
		randomArray(arr);
		randomArray(arr, 10, 43);
		
		int arr2[] = new int[3]; //강사님코드
		int  min =1 , max =9; //강사님코
		createRandomArray1(arr, min, max);//강사님코드
		
		int arr3[] =createRandomArray2(min,max,3);
	
	
	
	}
	
	public static void randomArray(int arr[])
	{
		int  min =1 , max =9;
	
		for(int i =0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random()*(max -min +1)+min);
			
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
	}
	
	public static void randomArray(int arr[], int start, int end)
	{
		int  min =start , max =end;
	
		for(int i =0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random()*(max -min +1)+min);
			
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
	}
	
	//****************강사님 코드
	//기능 : 최소값과 최대값 사이의 랜덤한 수를 주어진 배열에 저장하는메소드
//	매개변수 : 최소값, 최대값, 배열 -> int arr, int min, int max
//	리턴타입 : 없음 -> void  
//	메소드명 : createRandomArray1
	//강사님코드
		public static void createRandomArray1(int arr2[], int min, int max)
		{
			
		
			for(int i =0; i<arr2.length; i++) {
				
				arr2[i] = random(min,max);
			}
			
		}
	
	//기능 : 최소값과 최대값 사이의 랜덤한 수를 size개 만들어 배열에 저장하는메소드
			// 저장된 배열을 반환하는 메소드 
//	매개변수 : 최소값, 최대값, 만들 개수 => int min, int max, int size 
//	리턴타입 : 랜덤한 수가 저장된 배열 -> int []
//	메소드명 : createRandomArray2
	public static int[] createRandomArray2(int min ,int max,int size) 
	{
		
		int arr3[]= new int[size];
		for(int i =0; i<arr3.length; i++) 
		{
			
			arr3[size] = random(min,max);
		}
		return arr3;
		
	}
	
	//기능 : 최소값과 최대값 사이의 랜덤한 수를 생성하여 알려주는 메소드

//매개변수 : 최소값, 최대값, 만들 개수 => int min, int max 
//리턴타입 : 랜덤한 수가 저장된 배열 -> int
//메소드명 : random
	
	public static int random(int min, int max) {
		return (int)(Math.random()*(max -min +1)+min);
		
	}
}
