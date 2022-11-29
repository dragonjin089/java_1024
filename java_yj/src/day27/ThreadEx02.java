package day27;

public class ThreadEx02 {

	public static void main(String[] args) {

		//쓰레드 만드는 법
		// 1. 상속받는 클래스를 한가지 더만듬 -> 오버라이드 
		Runnable runnable = new Runnable () {
			
			@Override
			public void run() {
				
				for(int i = 0; i<10 ; i++) {
					System.out.println("쓰레드실행 ");
					try {
						Thread.sleep(1000); // 1초간 스레드 멈춤 
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		Thread t = new Thread(runnable);
		t.start();
		Thread thisThread = Thread.currentThread();
		for(int i = 0; i<10 ; i++) {
			System.out.println(thisThread.getName()+"쓰레드실행 ");
			try {
				Thread.sleep(1000); // 1초간 스레드 멈춤 
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	}

}
		
}
	




	