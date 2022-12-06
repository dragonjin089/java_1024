package day32;

public class MathEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi =3.141592;
		//소수점 첫쨰자리에서반올림
		double pi1 = Math.round(pi);
		System.out.println(pi1);
		//2쨰자리에서 반올림
		double pi2 = Math.round(pi*10)/10.0;
		System.out.println(pi2);
//		3쨰자리에서 반올림
		double pi3 = Math.round(pi*100)/100.0;
		System.out.println(pi3);
//		4쨰자리에서 반올림
		double pi4 = Math.round(pi*100)/1000.0;
		System.out.println(pi4);
		//소수점 4째자레엇 반올림
		int num = 4; 
		double pi4_2 = Math.round(pi* Math.pow(10, num-1))/ Math.pow(10, 1- num);
		System.out.println(pi4_2);
	}

}
