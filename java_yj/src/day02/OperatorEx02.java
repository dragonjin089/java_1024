package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감 연산자는 최종적으로 1 증가 / 1감소
		//전위 : 증가하고 동작
		//후위 : 동작하고 증가
		
		int a = 10, b= 10;
		
		System.out.println("증가전 : a =" + a +" b ="+ b);
		//동작 : 문자열 " 증가중 : a = "과 A를 더하는 연산 
		//동작 : 문자열 "증가중 :a = 연산결과, B = "과 B를 더하는 연산 
		
		
		System.out.println("증가중 : a =" + ++a +" b ="+ b++);
		System.out.println("증가후 : a =" + a +" b ="+ b);

		// 전위형과 후위형이 어려우면 , 동작을 기준으로 증감 연산자 위치를 조절하면된다.
		a = 10;
		b = 10;
		
		System.out.println("증가전 : a =" + a +" b ="+ b);
		++a;
		System.out.println("증가중 : a =" + a +" b ="+ b);
		++b;
		System.out.println("증가후 : a =" + a +" b ="+ b);

	
	}

}
