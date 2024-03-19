package exam1_경마프로그램;



class Counter {
	int data = 10;

	public synchronized void increment() {
		int mydata = data;
		data = mydata + 1;
	}
	public synchronized void decrement() {
		int mydata = data;
		data = mydata - 1;
	}
	
}

class IncrementThread extends Thread {
	Counter increase;
	public IncrementThread(Counter increase) {
		this.increase = increase;
	}
	@Override
	public void run() {
		increase.increment();
		System.out.println("증가 : " + increase.data);
	}
	
}
class DecrementThread extends Thread {
	Counter decrease;
	public DecrementThread(Counter decrease) {
		this.decrease = decrease;
	}
	@Override
	public void run() {
		decrease.decrement();
		System.out.println("감소 : " + decrease.data);
	}
}

public class Run {
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread th1 = new IncrementThread(counter);
		Thread th2 = new DecrementThread(counter);
		
		th1.start();
		th2.start();
		
	}
}


