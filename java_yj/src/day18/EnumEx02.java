package day18;

public class EnumEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 제한된 값들을 활용하는 변수가 필요할때 열거형을 이용 
		 * valueOf(문자열) : 문자열에 맞는 열거형으로 타입을 반환
		 * */
		Type type = Type.수입;
		System.out.println("구분 : " + type);
		type = type.valueOf("수입");
		System.out.println("구분 : " +type);
	}
}
enum Type{수입,지출}
