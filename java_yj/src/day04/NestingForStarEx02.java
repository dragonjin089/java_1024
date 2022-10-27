package day04;

public class NestingForStarEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * */		
		
		int i,j;

		
		
		for( i=1;i<=5;i++) 
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	
	

}
}