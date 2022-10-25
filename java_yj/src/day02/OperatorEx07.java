package day02;

public class OperatorEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 조건 선택 연산자 
		 * 조건식 ? 참일때 : 거짓일때 ;
		 * 
		 * */
		//주어진 성적이 60 점 이상이면 Pass, 아니면 Fail 출력되도록 코드 작성
		
		int score = 60;
		String result = score>=60 ? "pass" : "fail";
		System.out.println(score + " 점은 " + result);

	}

}
