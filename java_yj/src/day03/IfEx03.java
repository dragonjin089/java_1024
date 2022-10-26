package day03;

public class IfEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*조건식 1이 참이면 실행문 1을 실행
 * if(조건식1){실행문1;}
 * 
 * 조건식 1이 거짓이고 조건식 2가 참이면 실행문2를 실행
 * elseif(조건식2){실행문2;}
 * 조건식 1 과 조건식 2가 거짓이면 
 * else{
 * 	실행문3;
 * }
 * 
 * if :  문 반드시 필요, 1개 
 * elseif : 0개이상
 * else : 0 or 1개 
 * */
		
		//정수가 양수, 음수 , 0인지 판별하는 코드를 작성
		
		int num = 0;
		if(num >0) {
			System.out.println(num+ "은 양수");
		}
		else if(num==0){
			System.out.println(num);
		}
		else {
			System.out.println(num + "은 음수");
		}
	}

}
