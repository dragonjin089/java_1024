package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(3);
		list.add(2);
		list.add(9);
		list.add(4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//comparator 인터페이스를 구현한 구현 클래스가 필요 
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});
		System.out.println(list);
		//익명 클래스 : 클래스이름이없어 한번쓰고 버림
		
	}

}
