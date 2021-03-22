package chapter3;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("코드 시작");
		
		if(true) {
			System.out.println("이 if문은");
			System.out.println("참이므로");
			System.out.println("코드가 실행됩니다");
		}
//		if(else) {
//			System.out.println("이 if문은");
//			System.out.println("거짓이므로");
//			System.out.println("코드가 실행되지않습니다");
//		}
		
		System.out.println("코드 끝");
		
		int score = 60;
		
		if(score >= 60) {
			System.out.println("통과");
		}
		if(score < 60) {
			System.out.println("재시험");
		}
		
		
		
	}

}
