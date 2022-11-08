package day12;

public class InterfaceEx01 {
	public static void main(String[] args) {
		//인터페이스를 통해 객체를 생성할 수 없다.
		// TvRemoteController tr = new TvRemoteController();
		//하지만 인터페이스 참조변수에 객체를 저장할 수 있다.
		// 구현 클래스의 객체를 인터페이스 참조변수에 저장할 수 있다.
		TvRemoteController remocon1 = new TvRemoconA();
		//remocon1.print();
		//호출하려면 형변홤
		((TvRemoconA)remocon1).print();
		TvRemoconA r2 = new TvRemoconA();
		r2.turn();
		for(int i = 0 ; i<10; i++)
		{r2.channelUp();
			
		}
		for(int i = 0 ; i<10; i++)
		{
			r2.channelDown();
		}
		for(int i = 0 ; i<10; i++)
		{
			r2.volumnUp();
		}
		
		for(int i = 0 ; i<10; i++)
		{
			r2.volumnDown();
		}
		
		r2.channel(15);
	
		r2.print();
	}
}


