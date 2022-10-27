package day04;

public class NestingForEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 구구단 3단을 출력하는 코드를 작성하세요.
 * */
		
		int dan,i;
		for (dan=2;dan<=9;dan++) {
			for(i=1;i<=9;i++) {
				System.out.println(""+dan+'*'+i+'='+(dan*i));
			}
			System.out.println("");
		}
		
	}

}
