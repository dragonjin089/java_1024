package day06;

import java.util.Scanner;

public class ArrayScoreEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5명 학생의 국어, 영어 , 수학성적을 저장하기 위한 배열을
		 * 만들고 
		 * Scanner를 이용하여 입력받아, 국어평균, 영어평균, 수학평균을 구하는 코드를 작성하세요
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		//과목 배열 
		int kor[] = new int[5];
		int math[] = new int[5];		
		int eng[] = new int[5];
		
		double korsum =0,mathsum =0,engsum =0;
		int i;	
		//국어 
		for(i=0; i<kor.length; i++)
		{
			System.out.println("국어 점수   : ");
			kor[i] = scan.nextInt();
			System.out.println(i+1 + "번째 학생 국어점수 : "+ kor[i]);
			korsum +=kor[i];
		}
		
		//수학
		for(i=0; i<math.length; i++)
		{
			System.out.println("수학 점수   : ");
			math[i] = scan.nextInt();
			System.out.println(i+1 + "번째 학생 국어점수 : "+math[i]);
			mathsum+=math[i];
		}
		
		//영어
		for(i=0; i<eng.length; i++)
		{
			System.out.println("영어 점수   : ");
			eng[i] = scan.nextInt();
			System.out.println(i+1 + "번째 학생 국어점수 : "+ eng[i]);
			engsum+=eng[i];
		}
		
		double korAvg = korsum/kor.length;
		double mathAvg = mathsum/math.length;
		double engAvg = engsum/eng.length;
		
				
		System.out.println("국어성적 :  " + korAvg);
		System.out.println("수학성적 :  " + mathAvg);		
		System.out.println("영어성적 :  " + engAvg);
		

		
	
	
	}

}
