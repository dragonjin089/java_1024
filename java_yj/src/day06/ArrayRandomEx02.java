package day06;

public class ArrayRandomEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 랜덤으로 1~9사이의 숫자를 중복되지 않게 3개 생성하여 배열 저장하는 코드를 작성하세요.
		 * */

		
		int size=3;
		
		int arr[] = new int[size];// 랜덤 수를 저장할 배열 
		int count = 0; // 저장된 랜덤수의 개수 
		int min =1, max =9; // 랜덤수 범위 
		
	// 배열에 저장된 중복되지 않은수 3개가 될때까지 반복
		while(count < 3)
		{
			//랜덤한수 생성
			int r = (int)(Math.random()*(max -min +1)+min);
			//저장된 숫자가 3보다  작을때까지 
			boolean isDuplicated = false;
			// 배열에 저장된 수 중에서 랜덤한 수와 일치하면 숫자가 있는지 없는지 확인하여
			//저장된 숫자개수 만큼 반복 -> i는 0번지부터 저장된 개수보다 작거나 같을때까지.
			for(int i = 0 ; i < count ; i++) 
			{
				//배열에 저장된 숫자개수만큼 확인
				//i번지에 있는 숫자와 랜덤수가 같으면 isDuplicated를 True로
				if(arr[i]==r)
				{
					isDuplicated=true;
				}
			}
			//	있으면 다시 처음으로,
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

}
}



//		for(;;) {
//			if(arr[i]==i) {
//				//중복했다고 저장함 
//				isDuplicated = true;
//				break;
//			}
//			
//		}
//	
//	for(;;) {
//		}	
//	}
//있으면 다시처음으로
//배열에 저장하고 저장된개수1 증가

//랜덤수 -> 배열 -> 저장개수




//		for(int i=0; i<arr.length; i++)
//		{
//			//i번지에 있는 값과 같으면 num가 같으면 
//			if(arr[i]==num) {
//				//중복했다고 저장함 
//				isDuplicated = true;
//				break;