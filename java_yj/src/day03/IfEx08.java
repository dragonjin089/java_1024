package day03;
import java.util.*;
public class IfEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 점수를 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * */
	
	
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
//		if(score >=90 && score <=100) {
//			System.out.println(score + " A 학점");
//		}
//		else if (score >=80 && score <90) {
//			System.out.println(score + " B 학점");
//		}
//		else if (score >=70 && score <80) {
//			System.out.println(score + " C 학점");
//		}
//		else if (score >=60 && score <70) {
//			System.out.println(score + " D 학점");
//		}
//		else if (score >=0 && score <60) {
//			System.out.println(score + " F 학점");
//		}
//		else  {
//			System.out.println(" 그외 ");
//		}
		
		if(score >100 || score <0) {
			System.out.println(" 그외 ");
		}
		else if (score >=90) {
		System.out.println(score + "  A 학점");
		}
		else if (score >=80 ) {
			System.out.println(score + " B 학점");
		}
		else if (score >=70) {
			System.out.println(score + " C 학점");
		}
		else if (score >=60) {
			System.out.println(score + " D 학점");
		}
		else {
			System.out.println(score + " F 학점");
		}
		
		
	}
}
