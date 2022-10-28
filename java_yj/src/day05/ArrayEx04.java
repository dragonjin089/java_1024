package day05;
import java.util.*;
public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 학생 5명의 국어 성적을 입력받고 출력하는 코드를 작성하세요 
	 * 반복횟수 : i는 0부터 배열의 크기보다 작을때까지 1씩증가
	 * 규칙성 : 콘솔에서 입력받은 정수를 배열 i번지에 저장 
	 * 배열 i 번지에 있는 값을 출력
	 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		int []arr1 = new int[5];
//		
//		
//		for (int i= 0; i<arr1.length;i++) {
//			System.out.print("점수 입력 : ");
//			int score=sc.nextInt();
//			arr1[i]= score;
//			System.out.println(arr1[i]+" ");
//		}
		
		
		Scanner sc = new Scanner(System.in);

		
		int []score = new int[5];
		int sum=0;
		for (int i= 0; i<score.length;i++) {
			System.out.print(i+1+"점수 입력 : ");
			score[i] = sc.nextInt();
			System.out.println(i+1+"번째 학생 성적  : "+score[i]);
		}

		for(int i= 0; i< score.length; i++) {
			sum += score[i];
			
		}
		double avg = (double)sum/score.length;
		System.out.println("학생들의 평균  : " +avg);
		
		sum+=0;
		for(int tmp : score) {
			sum+=tmp;
			
		}
		
		double avg1 = (double)sum/score.length;
		System.out.println("학생들의 평균  : " +avg1);
		
		// 학생 성적의 평균을 구하는 코드를 작성하세요.
		// 반복횟수 i는 0부터 배열의 크기보다 작을때 까지 1씩 증가(향상된 for문 이용가능)
		// 규칙성 : sum에 배열 1번지에 있는 값을 누적
		// sum++;
		// 반복문 종료휴 : sum을 배열의 크기로 나눈값을 출력 (나누기조심)
		
		
		
		
	}

}
