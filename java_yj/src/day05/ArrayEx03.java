package day05;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5개짜리 배열을 생성하여 2부터 10까지 짝수를 차례대로 저장하고 출력하는 코드를 작성하세요.
		 * 
		 * 
		 * */
		int []arr1 = new int[5];
		
		for (int i = 0; i<arr1.length;i++) {
			arr1[i]=(i+1)*2;
			System.out.println(arr1[i] + "");
		}
		
//		for(int tmp :arr1) {
//			System.out.println(arr1 + "");
//		}
		
	}

}
