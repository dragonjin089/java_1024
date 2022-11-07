package day11;

public class InheritanceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*A is a b 로 표현이 가능하면 상속을한다.
	 * A가 자식(파생)클래스 , B가 부모클래스
	 * A has a b로 표현이 가능하면 포함을 한다. = >b가 a클래스로 필드로 선언
	 * 스마트폰은 카메라를 가지고있다 - > o
	 *자동차는 바퀴를 가지고 있다 -> o
	 * */
		child1 c =new child1();
		c.print();
	}
}

	
	class child1 extends Parent1{
		public child1() {
			super(1,2,3); //1번째줄에 위치햐애햐마
			//num1 = 10; // 접근제한자가 private 이어서 자식클래스에서 사용하지 못한다.
			num2 = 20; // 접근제하자가 디폴트이어서 같은 패키지에 있기 때문에 가능하다
					   // 상속여부와 상관이 없다.
			num3 = 30; // 접근제한자가 protected 이어서 자식클래스에서 사용할 수 있음
					   // 다른패키지이어도 사용가능
		}
		@Override
		public void print() {
			super.print();
			System.out.println("자식클래스의 메소드입니다.");
		}
	}
	
	class Parent1{
		private int num1 = 1;
		int num2 =2;
		protected int num3 =3;
		
		public void print() {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);

		}
		public Parent1(int num1, int num2, int num3) {
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}
	}
	
	class Parent2{
		public void print() {
			System.out.println("hello");
		}
	}

