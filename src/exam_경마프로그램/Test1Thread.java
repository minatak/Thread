package exam_경마프로그램;

public class Test1Thread {}

class Horse1 extends Thread {
	@Override
	public void run() {
		System.out.println();
		System.out.print("1번 경주말 : ");
		for(int i=1; i<=50; i++) {
			System.out.print("  =͟͟͞͞");
			try {Thread.sleep(10);} catch (InterruptedException e) {}
		}
		System.out.println("𓃗");
	}
}

class Horse2 extends Thread {
	public void run() {
		System.out.println();
		System.out.print("2번 경주말 : ");
		for(int i=1; i<=50; i++) {
			System.out.print("  =͟͟͞͞");
			try {Thread.sleep(10);} catch (InterruptedException e) {}
		}
		System.out.println("𓃗");
	}
		
		
	
}
	
	
	

	
//	class horse1 extends Thread {
//		@Override
//		public void run() {
//			System.out.print("1번 경주말 : ");
//			for(int i=1; i<=100; i++) {
//				System.out.print("  =͟͟͞͞");
//				try {Thread.sleep(10);} catch (InterruptedException e) {}
//			}
//			System.out.println("𓃗");
//		}
//	}
//
//	class horse2 extends Thread {
//		public void run() {
//			System.out.print("2번 경주말 : ");
//			for(int i=1; i<=100; i++) {
//				System.out.print("  =͟͟͞͞");
//				try {Thread.sleep(10);} catch (InterruptedException e) {}
//				}
//			System.out.println("𓃗");
//		}
//	}
	
