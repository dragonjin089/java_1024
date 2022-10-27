package day04;

public class ForSumEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//점수 NUM의 약수를 출력하는 코드를 작성하세요ㅣ.
//약수 : 나누었을때 나머지가 0이되게 하는수
//6의 약수 : 1 2 3 6

		int num = 6;
		
		int i ;
	
		for(i=1; i<=num; i++) {
			
			if(num%i==0) {
				System.out.println(i);
			}
		}
}
}
