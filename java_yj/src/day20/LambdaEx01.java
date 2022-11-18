package day20;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;


public class LambdaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*람다식을 이용하여 생성된 것은*/
		//인터페이스를 이용하여 객체를 만들때 구현클래스나 익명 클래스가 필요
		// -> 익명 클래스나 구현 클래스 없이 바로 객체를 생성할 수있게 하는것이 람다식
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(0);
		list.add(0);
		System.out.println(list);
		Comparator<Integer> comparator=(a,b)->a-b;
		Collections.sort(list,comparator);
		System.out.println(list);
		System.out.println(comparator.compare(1, 2));
	}


}
