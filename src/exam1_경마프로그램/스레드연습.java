package exam1_경마프로그램;

import java.util.Scanner;

/*
 		사용자로부터 정수 N을 입력 받습니다.
		1부터 N까지의 모든 정수를 더합니다.
		1부터 N까지의 모든 정수를 곱합니다.
 */

public class 스레드연습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Su = 0;
		
		System.out.print("수를 입력하세요 > ");
		Su = sc.nextInt();
		
		Thread sumThread = new Thread(new SummationTask(Su));
		sumThread.setName("*덧셈*");
		System.out.println();
		sumThread.start();
		
		Thread multiplyThread = new Thread(new MultiplicationTask(Su));
		multiplyThread.setName("*곱셈*");
		multiplyThread.start();
		
	}
}

class SummationTask implements Runnable {
	private int Su;
	public SummationTask(int Su) {
		this.Su = Su;
	}
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i <= Su; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("1부터 "+Su+"까지 더한 수 : "+sum);
	}
}

class MultiplicationTask implements Runnable {
  private int Su;
  private Thread gopp;

  public MultiplicationTask(int Su) {
      this.Su = Su;
      this.gopp = new Thread(this);
  }

  @Override
  public void run() {
      long gop = 1;
      for (int i = 1; i <= Su; i++) {
          gop *= i;
      }
      System.out.println(this.gopp.getName());
      System.out.println("1부터 " + Su + "까지 곱한 수 : " + gop);
  }
}

