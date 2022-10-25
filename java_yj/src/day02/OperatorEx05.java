package day02;

import java.util.*;
public class OperatorEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홀길동 학생의 국어 영어 수학 점수를 콘솔에 입력받고 , 홍길동 학생 평균 성적을 콘솔에 출력해라
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어점수 입력하시오 :");
	int kor = sc.nextInt();
	System.out.print("영어점수 입력하시오 :");
	int eng = sc.nextInt();
	System.out.print("수학점수 입력하시오 :");
	int math = sc.nextInt();
	
	sc.close();
	
	float avg = (kor + eng + math) / (float)3f;
	
	System.out.println("홍길동 평균 : " + avg);
	
	//통과입니까 ? TRUE , FALSE 
	//평균이 60점 이상이라면 true , 아니면 FALSE 
	// 통과를 알려주는 변수
	// 실패를 알려주는 변수 
	boolean pass = avg>=60;
	boolean nonpass = avg <60;
	
	System.out.println("통과입니까? " + pass);
	System.out.println("통과입니까? " + !nonpass);

	}

}
