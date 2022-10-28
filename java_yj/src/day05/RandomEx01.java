package day05;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//min ~ max 사이의 값을 가지는 랜덤한 정수를 생성하는 예제
		int min =1, max = 9;
		//math.random : 0이상 1미만의 랜덤한실수를 생성, 0.xx
		// 0<=r <1 (max - min +1 ) 양변에 곱함 
		//0<=r*(max - min +1) < max - min+1 , min을 더함
		//min < = r* (max -min +1) + min < max +1)
		
		int r = (int)(Math.random()*(max -min +1)+min);
		// 실수 이기때문에 형변환 해줘야함
		System.out.println("랜덤함수 :  " + r);
		
		
	}

}
