package day12;

public class InterfaceEx02 {
	public static void main(String[] args) {
		
	}
}

interface TestA{
	
	void testA();
	
	// 기존 인터페이스에 새로운 메소드를 추가해도이미 구현된 구현 클래스에 가지 않게 하기위해 default 메소 드로 추가하면된다.
	default void testB() {}
}

class TestAA implements TestA{
	
	public void testA() {
		System.out.println("AA");
	}
}

class TestB implements TestA{
	public void testA() {
		System.out.println("AB");
	}
}