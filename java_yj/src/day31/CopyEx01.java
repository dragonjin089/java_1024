package day31;

import lombok.Data;

public class CopyEx01 {

	public static void main(String[] args) {
		// 얕은 복사 
		Test t1 = new Test(10,20,"홍길동");
		Test t2 = t1;
		System.out.println("t1 : "+ t1);
		System.out.println("t2 : "+ t2);
		System.out.println("---------------");
		t1.setNum1(30);
		t1.getSub().setName("임꺽정");
		System.out.println("t1 : "+ t1);
		System.out.println("t2 : "+ t2);
		// 얕은복사 -> 객체를 공유해서 한쪽이 바뀌면 같이바뀜 
		
		//깊은 복사
		System.out.println("---------------");
		Test t3 = new Test(10,20,"홍길동");
		Test t4 = new Test(t3);
		System.out.println("---------------");
		t3.setNum1(30);
		t3.getSub().setName("임꺽정");// 같이변함
		System.out.println("t3 : "+ t3);
		System.out.println("t4 : "+ t4);
		// 생성자 없어서 에러 -> 생성자 추가
		// 깊은복사는 객체를공유하지 않아서 밖에서 바뀌어도 영향이 없음 
		
	}

}

@Data
class Test{
	int num1, num2;
	Sub sub; //클래스 객체오는경우
	public Test(int num1, int num2, String name) {
		this.num1 = num1;
		this.num2 = num2;
		this.sub = new Sub(name);
	}
	
	public Test(Test t) {
		this.num1 = t.num1;
		this.num2 = t.num2;
//		this.sub = t.sub;
//		필드가 참조변수인 경우 , 생성자를 이용하여 복사해야됨, 클론이라는 
//		메서드가 오버라이딩 되있으면 클론을 사용해서 복사함
//		this.sub = new Sub(t.sub); // 복사 생성자 이용
//		this.sub = new Sub(t.sub.getName()); // 기존생성자에 직접 넘기든지
	}
}
@Data
class Sub {
	String name;
	
	public Sub(String name) {
		this.name = name;
		
	}
	public Sub (Sub sub) {
		this.name = sub.name;
	}
}