package day04;

public class NestingForStarEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 *      * 공백 4 별 1
 *     **
 *    ***
 *   ****
 *  *****
 */		
		
		
		int i,j;
		 //공백 

		for (i=1; i<=5; i++) {
			
			for(j=1; j<=5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	/*
	 *       *   		row 1 공백 4 *=1
	 *      ***  		row 2 공백 3 *=2
	 *     *****		row 3 공백 2 *=3
	 *    ******* 		row 4 공백 1 *=4
	 *   ********* 		row 5 공백 0 *=5
	 * */

	for(i=1;i<=5;i++) {//열
	
		for(j=1; j<=5-i;j++)
		{//공백
			System.out.print(" ");
		}
		
		for(j=1;j<=i;j++) 
		{//별
			System.out.print("*");
		}
		   for(j=1;j<=i-1;j++)
		{//별
			System.out.print("*");
		}
		
		System.out.println();
	}
}
}