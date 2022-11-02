package day07;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {1,2,5};
			test(arr);
			for(int tmp:arr) {
				System.out.println(tmp+" ");
			}
	}
	
	public static void test(int []arr) {
//		arr = new int [3]; // 이 코드에 의해 main 에 있는 arr 이 바뀌지 않음
		arr[0] =10 ;
	}

}
