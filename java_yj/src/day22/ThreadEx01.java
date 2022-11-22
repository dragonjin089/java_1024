package day22;

public class ThreadEx01 {
/*프로세스
	실행중인하나의 프로그램
	하나의 프로그램이 다중 프로세스 만들기도함
	
멀티 테스킹
두가지 이상의 작업을 동시에 처리하는것

멀티프로세스 
 독립적으로 프로그램들을 실행하고 여러가지 작업처리
멀티스레드
 한개의 프로그램을 실행하고 내부적으로 여러가지 작업처리
 
 메인 스레드 
 	모든 자바 프로그램은 메인 스레드가 메인 메소드를 실행하며 시작
 	main() 메소드의 첫 코드부터아래로 순차적으로 실행
 	실행종료 조건
 		마지막코드실행
 		리턴문만나면
	메인 스레드는 작업스레들을 만들어 병렬로 코드를 실행
		멀티스레드생성해 멀티테스킹 수행
	
	프로세스 종료
	싱글스레드 : 메인 스레드가 종료하면 프로세스도 종료
	멀티스레드 : 실행중인 스레드가 하나라도 있다면 프로세스 미종료
	
	멀티스레드로 실행하는 어플리케이션개발
	몇개의작업을 병렬로 실행할지 결정하는것이 선행되어야한다.
	
	 작업스레드 생성방법
	 Thread 클래스로부터 직접생성
	 런어블의 매개값으로 갖는 생성자 호출
	 thread 하위클래스 생성
	 
	 스레드의 이름
	 
	 메은스레이드 main
	 작업스레드 이름 thread -n
	  작업스레드이름변경 threadsetName("thread 이름")
	  
	  동시성
	  멀티작업위해 하나의 코어에서 멀티 스레드가 번갈아 가며 실행하는 성질
	  병ㄹ렬성
	  멀티 작업을 위해 멀티코어에서 개별 스레드를 동시에 실행하는성질

	 우선순위방식 코드 제어가능
	 
	 순환할당방식(코드로 제어할 수없음)
	*/
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("현재 쓰레드명 : " + t.getName());
		//현재 쓰레드명 : main
		//쓰레드 만드는법 2가지
		// 1.쓰레드 클래스 상속
		//
		Thread01 t1 = new Thread01();
		t1.start(); //실행하려면 run()이 아닌 start() 써야함 
		for(int i = 0; i< 10000; i++) 
			System.out.print("ㄴ");
	}
}
class Thread01 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i< 10000; i++) 
			System.out.print("r");
//ㄴㄴrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
		
	}
}