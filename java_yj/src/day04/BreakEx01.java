package day04;

public class BreakEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i;
			//break 만나면 증감식으로 가지않고 , 가까운 반복문을 빠져나감
			for(i=1;i<=10;i++) 
			{
				System.out.println("hello world");
				
				if(i==7) {
				break;
				
			}
		}
	}

}
