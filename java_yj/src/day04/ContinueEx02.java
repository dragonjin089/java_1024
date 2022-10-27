package day04;

public class ContinueEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for 문에서 continue를 만나면 증감식으로 이동.
		 *  
		 */
		 int i, sum =0;
		 for(i=1;i<=10;i++) {
			 if(i%2!=0){continue;}
			 
			 
			 
			 sum+=i;
			 
		 }
		 System.out.println(sum);
	}

}
