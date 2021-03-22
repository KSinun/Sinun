package chapter3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in)
		System.out.println("2021_3 날짜 = ");
		
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek = dayOfMonth % Ex3.WEEK;
		
		System.out.println("2021_3월" + dayOfMonth + "얇은");
		
		if(dayOfWeek == 0) {
			System.out.println("일요일");
		} else if(dayOfWeek == 1) {
			System.out.println("월요일");
		} else if(dayOfWeek == 2) {
			System.out.println("화요일");
		} else if(dayOfWeek == 3) {
			System.out.println("수요일");
		} else if(dayOfWeek == 4) {
			System.out.println("목요일");
		} else if(dayOfWeek == 5) {
			System.out.println("금요일");
		} else {
			System.out.println("토요일");
		} 
			System.out.println("입니다.");
			
		}

	}

}
