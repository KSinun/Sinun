package chapter3;

public class Ex12 {

	public static void main(String[] args) {
		int number = 11;
		
		switch(number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		default:
			System.out.println("홀수");
		}
			// 2021년 3월의 특정 날짜에 해당하는 요일을 화면에 출력하세요
		int dayOfMonth = 26;
		int dayOfWeek = dayOfMonth % 7;
		
		switch(dayOfWeek) {
		case 1:
			System.out.println("월요일"); break;
		case 2:
			System.out.println("화요일"); break;
		case 3:
			System.out.println("수요일"); break;
		case 4:
			System.out.println("목요일"); break;
		case 5:
			System.out.println("금요일"); break;
		case 6:
			System.out.println("토요일"); break;
		default: 
			System.out.println("일요일"); break;
		
			
		}
		
		
		
		

	}

}
