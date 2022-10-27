package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for 문에서 continue를 만나면 증감식으로 이동.
		 *  
		 */
		 
		int i;
		for (i =1; i<=5; i++) { 
			System.out.println("hello World");
			if(i==3) {
				continue;
			}
			System.out.println();
		}
	}

}
