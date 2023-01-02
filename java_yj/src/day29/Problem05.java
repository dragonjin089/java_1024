package day29;

import lombok.Data;

public class Problem05 {

	
	public static void main(String[] args) {
		//11출력
		//원인 : ;을 for() 끝에 추가해서 반복문의 실행문이 없이 동작 
		// i를 출력하기 때문에 한번만 출력
	 int i;
	 for(i =1; i<= 10; i++);
	 System.out.println(i);
	}
	
}