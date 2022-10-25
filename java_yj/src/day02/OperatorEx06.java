package day02;

public class OperatorEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 논리 연산자 
		 * && : 둘자 참이면 참 , 나머진 거짓 
		 * 		~이고, ~라고
		 * || : 둘다 거짓이면 거짓, 나머진 참
		 * 		~ 이거나 
		 * 
		 * ! : 반대, ~가 아닌 
		 * */
		int score = 85;
		// score 가 80점 이상이고 score 가 90점 미만인가 
		//80점 보다 크거나 같다 90보다 작다 
		boolean isB = score >= 80 && score <90;
		System.out.println(score + "점 b 학점인가 ? " + isB);
		
	}

}
