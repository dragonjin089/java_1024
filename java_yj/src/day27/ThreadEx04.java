package day27;

public class ThreadEx04 {

	public static void main(String[] args) {

		//쓰레드 만드는 법
		// 1. 상속받는 클래스를 한가지 더만듬 -> 오버라이드 
		
		Thread t = new Thread(()->{
			
		
		for(int i = 0; i<10 ; i++) {
			System.out.println("쓰레드 실행");
			try {
				Thread.sleep(1000); // 1초간 스레드 멈춤 
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	}
});
		t.start();
		Thread thisThread = Thread.currentThread();
		for(int i = 0; i<20; i++) {
			System.out.println(thisThread.getName()+" 쓰레드 실행");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}