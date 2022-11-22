package day22;

public class ThreadEx02 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("현재 쓰레드명 : " + t.getName());
		//현재 쓰레드명 : main
		//쓰레드 만드는법 2가지
		// 1.쓰레드 클래스 상속
		//
//		Thread t2 = new Thread(new Thread02());
		Thread t2 = new Thread(()->{
			for(int i =0; i<10000; i++)
				System.out.println("-");
		});
		
		t2.start(); //실행하려면 run()이 아닌 start() 써야함 
		for(int i = 0; i< 10000; i++) 
			System.out.print("ㄴ");
	}
	
}
class Thread02 implements Runnable{
	//Runnable 객체를 이용한 쓰레드 만들시 
	@Override
	public void run() {
		for(int i = 0; i< 10000; i++) 
			System.out.print("r");
//ㄴㄴrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
		
	}
}