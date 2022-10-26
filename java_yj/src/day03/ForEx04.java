package day03;

public class ForEx04 {

	public static void main(String[] args) {
		
	/*
	 * 1부터 10사이의 짝수를 출력하는 코드를 작성하세요.
	 *방법1
	 ** 반복횟수 : i는 1부터 5까지 1씩증가
	 * 규칙성 : 2*i 츨력
	 *방법2 
	 *반복횟수 : i 는 2부터 10까지 2씩증가
	 *규칙성 : i를 출력
	 *방법 3
	 *반복횟수 : i는 1부터 10까지 1씩증가
	 *규칙성 : i가 짝수이면 i를 출력
	 *
	 * 2
	 * 4
	 * 6
	 * 8
	 * 10 
	 * */
		
	int i;
	
	for(i=1;i<=10;i++) {
		if(i%2==0)
		System.out.println(i);
	}
	

	for(i=1;i<=5;i++) {
		System.out.println(i*2);
	}
	
	
	for (i=1; 2*i<=10; i++) {
		System.out.println(2*i);
	}

}
}