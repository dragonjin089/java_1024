package day14;

import lombok.Data;

public class RuntimeExceptionEx01 {

	public static void main(String[] args) {
		//RuntimeException 은 코드 상 에러표시가 안나고 실행시 예외가 발생할수 있음
		// 예외처리가 필수가 아님
		
		// ArithmeticException 발생 0으로 나누면 안됨
		int num1 = 0, num2 =0;
//		System.out.println(num1/num2);
//		System.out.println(num1%num2);
//		Parent p  =null;
//		p.print();
//		exceptionTest(p);
		
		//예외발생 배열의 크기가 음수
		//NegativeArraySizeException:
		int size =-1;
		
//		int []arr = new int [size];
		int [] arr2 = new int[5];
//		arrayIndexOutOfBoundsException 발생 접근할숭벗는 번지에 접근시
//		arr2[5] =5;
	
	
	Parent p1 = new Parent();
	
	//ClassCastException 발생 . 강제 클래스 변환이 불가능해서 
	
	Child c = (Child)p1;
	
	
	}
	
	
	

	public static void exceptionTest(Parent a) {
		//a가 null인 경우 NullPointerException이 발생 
		a.print();
	}
}
@Data
class Parent{
	private int num;
	public void print() {
		System.out.println(num);
	}
}
class Child extends Parent{}