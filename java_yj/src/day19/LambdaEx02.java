package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class LambdaEx02 {

	public static void main(String[] args) {
		Sum sum = (a, b) -> 	a+b;
		
			// 생략해도 o
			//실행문이 하나인경우 중괄호 생략 o
			//리턴인경우 생략하려면 리턴을 뺴야함
		System.out.println(sum.run(1, 2));
		Print print = (num) -> System.out.println(num);
		print.run(10);
		Consumer<String> print2 = str->System.out.println(str);
		print2.accept("10");
		
	}

}

interface Sum{
	 double run(double a, double b);
	
}
interface Print<T>{
	void run(T num);
}