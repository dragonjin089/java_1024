package day05;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int i = 0;
		for(i=1; i<=5; i++);
		{
			System.out.println(i);//6출력_. 세미콜론 위치 
		}
		i=5;
		if (i %2 == 0);//; 에 의해 if 문이 실행문이 짝수 출력이아니라 없음
		// i 값과 상관없이 짝 수 출력
		
		{
			System.out.println("짝수");
		}
//		에러발생, else는 if 문이 필요한데, if 문이 없어서
//		else 
//		{
			System.out.println("홀수"); // ; 위치 
//		}
			//조건문 반복문은 실행문이 1줄이면 {} 가 생략기아근ㅇ
			for(i=1;i<=5;i++);
					System.out.println(i);
	}

}
