package day10;
import day10.TestA;
import day10_1.TestB;

public class AccessModifierEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TestA a = new TestA();
			TestB b = new TestB();
			
			//a.num1 =1; //에러 발생 private이 때문에 외부에서 접근할 수 없음
			a.num2 =2; //default 이고 같은 패키지이기 때문에 정상동작
			a.num3 =3;
			//b.num1 =1;// 에러발생 private 이 때문에 외부에서 접근할 수 없음/
			b.num2 =2; //에러발생 default 이기 때문에 다른 패키지에서 접근할 수 없음.
			b.num3 =3;
	}

}
