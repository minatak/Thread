package exam_경마프로그램;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horseChoice = 0;
		long money = 0;
		
//		System.out.println("* 당첨금은 배팅한 금액의 1등은 200%, 2등은 150%, 3등은 120%까지만 지급됩니다.");
//		
//		System.out.print("배팅하실 금액을 입력해주세요 > ");
//		money = sc.nextLong();
//		//   =͟͟͞͞Ꙭ   ˗ˋˏ˗   𓃗𓃚
//		System.out.println("경주마 소개");
//		System.out.println("1번말 : 태양");
//		System.out.println("2번말 : 바람");
//		System.out.println("3번말 : 번개");
//		System.out.println("4번말 : 파워블레이드");
//		System.out.println("5번말 : 이겨주마"); 
//		System.out.println();
//		
//		System.out.print("경주마를 골라주세요 (말 번호 1,2,3,4,5중 입력) > ");
//		horseChoice = sc.nextInt();
		
//		Test1Thread horse = new Test1Thread();
		
		Horse1 horse1 = new Horse1();
		Horse2 horse2 = new Horse2();
		horse1.start();
		horse2.start();
		
	}
}
