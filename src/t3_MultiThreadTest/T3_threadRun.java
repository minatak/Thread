package t3_MultiThreadTest;

class SMIFile2 implements Runnable {
	@Override
	public void run() {
		// #2. 자막 
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(5);} catch (InterruptedException e) {}
		
		
		// #3. 자막 출력
		for(int i=0; i<smiArray.length; i++) {
			System.out.println("- 자막 : " + smiArray[i]);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

class ScreenFile2 implements Runnable {
	@Override
	public void run() {
		// #1. 영상프레임 1~5컷
		int[] screenArray = {1,2,3,4,5};
		
		// #3. 영상 출력
		for(int i=0; i<screenArray.length; i++) {
			System.out.print("영상 프레임 : " + screenArray[i]);
			try {Thread.sleep(500);} catch (InterruptedException e) {} 
		}
	}
}

public class T3_threadRun {
	public static void main(String[] args) {
		// 자막객체 생성 실행
		Runnable smiThread = new SMIFile2();
		Thread th1 = new Thread(smiThread);
		th1.start();
		
		// 영상객체 생성 실행
		Runnable ScreenFile = new ScreenFile2();
		Thread th2 = new Thread(ScreenFile);
		th2.start();
	}
}
