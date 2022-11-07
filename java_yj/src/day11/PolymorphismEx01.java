package day11;

public class PolymorphismEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			connectToComputer(new Mouse());
			connectToComputer(new KeyBoard());
			connectToComputer(new Speaker());
	}
	/* 메소드 오버로딩 -> 상속화*/
	/*
	 * 매개변수의 다형성
	 * 매개변수로 부모 클래스의 객체를 전달하여, 같은 부모를 가진 자식 클래스 객체를 활용할 수 있게 하는것 */
	public static void connectToComputer(UsbProduct obj) {
		System.out.println(obj.type + "와 연결되었습니다.");
	}
}
class UsbProduct{
	public String type;
}

class Mouse extends UsbProduct {
	{
	type = "마우스";
}
	}
class KeyBoard extends UsbProduct{{
	type = "키보드";
 }}
class Speaker extends UsbProduct{{
	type = "스피커";
}}


