package day27;

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쓰레드 만드는 법
		// 1. 상속받는 클래스를 한가지 더만듬 -> 오버라이드 
		NewThread t = new NewThread();
		t.start();
		Thread thisThread = Thread.currentThread();
		for(int i = 0; i<10 ; i++) {
			System.out.println(thisThread.getName()+"쓰레드실행 ");
			try {
				Thread.sleep(1000); // 1초간 스레드 멈춤 
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
class NewThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10 ; i++) {
		System.out.println(this.getName()+"쓰레드실행 ");
		try {
			Thread.sleep(1000); // 1초간 스레드 멈춤 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		}
}
}