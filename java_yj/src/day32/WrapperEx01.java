package day32;

public class WrapperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
//		문자열을 정수로 
		int num = Integer.parseInt(str);
		System.out.println(num);
		
//		문자열로 실수로
		str = "3.14";
		double dnum = Double.parseDouble(str);
		System.out.println(dnum);
		
//	 	정수로 문자열로 
		num = 30;
		str = String.valueOf(num);
		System.out.println(str);
	}

}
