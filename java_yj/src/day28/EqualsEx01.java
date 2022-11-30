package day28;

import java.util.*;
import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class EqualsEx01 {

	public static void main(String[] args) {
		/*
		 * List에서 제공하는 indexOf와 contains*/
		List<Test> list = new ArrayList<Test>();
		list.add(new Test(1,1));
		list.add(new Test(1,2));
		list.add(new Test(1,3));
		list.add(new Test(2,1));
		list.add(new Test(3,1));
		System.out.println(list);
		int index = list.indexOf(new Test(3,2));
		System.out.println("indexOf : " + index);
		Test t = new Test(2,1);
		System.out.println("equals : " + t.equals(new Test(2,2)));

		/*리스트.indexOf(비교객체)에서 Objects.equals를 호출하는데
		 * Objects.equals(비교객체, 리스트에서 꺼낸 객체)를 호출하기 때문에 
		 * 비교객체.equals(리스트에서 꺼낸 객체)로 비교 
		 * 아래 indexOf는 Integer.equals(Test 객체 )를 하기 때문에 -1 이나옴 */
		index = list.indexOf((Integer)2);
		System.out.println("indexOf : "+ index);
		System.out.println("equals : " + t.equals((Integer)2));
		//Objects.equals(a,b) : a.equlas(b)를 호출 
		System.out.println(Objects.equals(new Test(2,1),(Integer)2));
		System.out.println(Objects.equals((Integer)2,new Test(2,1)));
		List<Test> list2 = new ArrayList<Test>();
		list2.add(new Test(1,1));
		list2.add(new Test(1,2));
		list2.add(new Test(1,3));
		list2.add(new Test(2,1));
		list2.add(new Test(3,1));
		list2.add(new Test(4,1));
		System.out.println("두 리스트 비교 : " +list.containsAll(list2));
		list2.add(new Test(10,1));
		System.out.println("두리스트 비교 : " + list.containsAll(list2));
	}
	

}
@Data
@EqualsAndHashCode
class Test{
	int num1;
	int num2;
	public Test(int num1, int num2) {
		this.num1 =  num1;
		this.num2 =  num2;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//클래스정보와 매개변수 클래스정보가 다른경우 
		if (getClass() != obj.getClass()) {
			if(obj instanceof Integer) {
				if(num1 == (Integer) obj) {
					return true;
				}
			}
			return false;
	}
		Test other = (Test) obj;
		if (num1 != other.num1)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num1;
		return result;
	}
	
}
