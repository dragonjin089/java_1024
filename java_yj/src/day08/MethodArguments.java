package day08;

public class MethodArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*매개변수 개수를 다양하게 하고싶을때 가변인자를 사용
			 * 매개변수에 자료형 ... 배열명 => 메소드에서 배열처럼사용
			 * 가변인자는 반드시 매개변수 마지막에 사용
			 * */
		System.out.println(sum());
		System.out.println(sum(1));
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		
	}
	
	public static int sum(int ...nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int sum =0;
		for (int num : nums) {
			sum+=num;
		}
		return sum;	
	}
	
	public static int sum(int num) {
		return num;//1개짜리처리
	}
	public static void test(int grade, int classNum, int num, String name,int ...score) {
		// 가변인자는 항상 마지막에 와야함
		
		
	}
}
