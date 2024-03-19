package t1_BasicThread;

// 스레드를 만드는 두번째 방법 : Runnable 인터페이스 구현객체를 만든 후 스레드 생성시 매개변수로 처리해준다. 
public class T2_MultiThread2Run {
	public static void main(String[] args) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("main(1).현재 클래스명 : T2_MultiThread2Run");
		System.out.println("main(1).현재 실행중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		T2_MultiThread2 t2 = new T2_MultiThread2(); 
//		Thread thread = new Thread(t2); // 이렇게 하면 이 줄에서 스레드가 만들어지는 것! (스레드 생성)
		Thread thread = new Thread(t2, "atom"); // 스레드 생성 - 이름 주기
		thread.start();
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("main(2).현재 클래스명 : T2_MultiThread1");
		System.out.println("main(2).현재 실행중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("main(2). "+Thread.currentThread().getName()+"스레드가 종료되었습니다.");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}
}
