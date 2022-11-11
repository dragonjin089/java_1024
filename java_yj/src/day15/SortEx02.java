package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("orrange");
		list.add("nba");
		list.add("bot");
		list.add("boy");
		list.add("a");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//comparator 인터페이스를 구현한 구현 클래스가 필요 
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
			
		});
		System.out.println(list);
		//익명 클래스 : 클래스이름이없어 한번쓰고 버림
		
	}


}
