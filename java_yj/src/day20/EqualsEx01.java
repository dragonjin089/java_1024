package day20;

import java.util.ArrayList;

import lombok.Data;

public class EqualsEx01 {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.setNum(10);
		//Test 객체와 Integer 10 과 비교하여 트루값 출력
		System.out.println("Test객체와 Integer 객체비교 (equals)"+t1.equals((Integer)10));
		ArrayList<Test> list = new ArrayList<Test>();
		list.add(t1);
		/*리스트의 contains와 indexOf는 Test객체의 equals를 바로 호출하는 것이아니라 
		 * Objects.equals(o1,o2)를 호출한 뒤, 내부에서 o1. o2가 같은 클래스의 객체이면 
		 * Test의 equals를 호출 
		 * 두 객체가 같은 클래스인경우
		 *contains() -> Objects.equals() -> Test.equals()를 이용하여 ture/false 리턴
		 * 두 객체가 다른 클래스인경우
		 * contains() -> Objects.equals() -> fase 리턴
		 * */
		System.out.println("Test객체와 Integer 객체비교 (contains)"
		+list.contains((Integer)10));
		System.out.println("Test객체와 Integer 객체비교 (indexOf)"
		+list.indexOf((Integer)10));
	}

}
@Data
class Test{
	int num;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			//클래스가 다른경우 obj가 Integer 로 변환이 가능하면 
			if(obj instanceof Integer) {
				return num == (Integer)obj;
			}
		return false;
	}			
		Test other = (Test) obj;
		if (num != other.num)
			return false;
		return true;
	}

	public String contains(Integer integer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	
}