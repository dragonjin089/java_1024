package day11;

public class ClassUpCastingEx01 {

	public static void main(String[] args) {
		/* 자식 클래스인 kiaCar 객체를 부모 클래스인 Car 객체에 저장 : 업캐스팅 
		 * 업 캐스팅은 자동으로 동작 */
		// TODO Auto-generated method stub
		//Car car = new KiaCar(4,"K5",0x00ff00,"123가1234");
		//car.print();
		//하나의 클래스타입으로 여러 객체 관리 할 수 있다.
		//Car 배열을 이용하여 여러 종류의 자동차들을 관리할 수 있다.
		
		Car [] carList = new Car[5];
		carList[0] = new KiaCar(4, "k5",0x00ff00, "123가1234");
		carList[1] = new HyundaiCar(4, "쏘나타",0xff0000, "143가1434");
		for(Car tmp : carList) {
			if(tmp == null) {
			continue;
			}
		
		
		// 차 종류에 맞게 기아면 기아기능을 현대면현대기능을 호출하기위해 다운캐스캐스팅함.
			if(tmp instanceof KiaCar) {
				((KiaCar) tmp).hand();
			}else if(tmp instanceof HyundaiCar) {
				((HyundaiCar) tmp).auto();
			}
		}
	}
}


